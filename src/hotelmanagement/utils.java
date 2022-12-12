package hotelmanagement;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Haizz
 */
public class utils {
    public static int nDays_Between_Dates(String date1, String date2) {
        int diffDays = 0;
        try {
            SimpleDateFormat dates = new SimpleDateFormat("dd/MM/yyyy");
            Date startDate = dates.parse(date1);
            Date endDate = dates.parse(date2);
            long diff = endDate.getTime() - startDate.getTime();
            diffDays = (int) (diff / (24 * 60 * 60 * 1000));            
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return Math.abs(diffDays);
    }

    public static String bigDecimalFormatPrint(BigDecimal bd) {
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(bd);
    }
}
