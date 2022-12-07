/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelmanagement;

import hotelmanagement.GUI.MainUI;
import java.sql.SQLException;

/**
 *
 * @author nguyenxuanhoang
 */
public class HotelManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        new MainUI().setVisible(true);
    }
    
}
