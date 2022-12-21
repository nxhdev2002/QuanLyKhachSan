/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagement.BLL;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Date;

import hotelmanagement.DAL.DatTraPhongDAL;
import hotelmanagement.DAL.HoaDonDAL;
import hotelmanagement.DAL.PhongDAL;
import hotelmanagement.DTO.DatTraPhongDTO;
import hotelmanagement.DTO.HoaDonDTO;
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
    
    public void checkOut(PhongDTO Phong, DatTraPhongDTO DatTra, BigDecimal soNgayO, BigDecimal tongtien) {
        DatTraPhongDAL.getInstance().checkOut(DatTra);
        PhongDAL.getInstance().changeStatus(Phong, 0);
        HoaDonDTO HoaDon = new HoaDonDTO();
        HoaDon.setMaNhanVien(3);
        HoaDon.setCCCD(DatTra.getCCCD());
        HoaDon.setMaPhong(Phong.getMaPhong());
        HoaDon.setSoNgayThue(Integer.valueOf(soNgayO.toString()));
        HoaDon.setThanhTien(tongtien);
        HoaDon.setNgayThanhToan(new Date());
        HoaDonDAL.getInstance().addData(HoaDon);
    }
}
