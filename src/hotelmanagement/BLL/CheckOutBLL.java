/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagement.BLL;

import hotelmanagement.DAL.DatTraPhongDAL;
import hotelmanagement.DAL.PhongDAL;
import hotelmanagement.DTO.DatTraPhongDTO;
import hotelmanagement.DTO.PhongDTO;

/**
 *
 * @author Haizz
 */
public class CheckOutBLL {
    public static CheckOutBLL instance;

    public CheckOutBLL() {
        
    }

    public static CheckOutBLL getInstance() {
        if (instance == null) {
            instance = new CheckOutBLL();
        }
        return instance;
    }
    
    public void checkOut(PhongDTO Phong, DatTraPhongDTO DatTra) {
        DatTraPhongDAL.getInstance().checkOut(DatTra);
        PhongDAL.getInstance().changeStatus(Phong, 0);
    }
}
