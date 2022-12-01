/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelmanagement;

import hotelmanagement.DAL.DAL;
import hotelmanagement.GUI.*;
import java.sql.ResultSet;

/**
 *
 * @author nguyenxuanhoang
 */
public class HotelManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new MainUI().setVisible(true);
        DAL.getInstance().connectDB();
        String sql = "select * from Phong";
        ResultSet data = DAL.getInstance().executeQueryToGetData(sql);
        System.out.print(data);
        DAL.getInstance().closeConn();
    }
    
}
