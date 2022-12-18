package hotelmanagement;
import java.awt.Desktop;
import java.math.BigDecimal;
import java.net.URI;
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
    
    public static boolean openWebpage(URI uri) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(uri);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * @param date1
     * @param date2
     * @return 1 if date 1 after date 2
     * -1 if date 1 before date 2
     * 0 if equal
     */
    public static int compareDates(Date date1,Date date2)
    {
        int res = 1;
        // if you already have date objects then skip 1
        //1

        //1

        //date object is having 3 methods namely after,before and equals for comparing
        //after() will return true if and only if date1 is after date 2
        if(date1.after(date2)){
            res = 1;
        }

        //before() will return true if and only if date1 is before date2
        if(date1.before(date2)){
            res = -1;
        }

        //equals() returns true if both the dates are equal
        if(date1.equals(date2)){
            res = 0;
        }
    return res;
    }
}
