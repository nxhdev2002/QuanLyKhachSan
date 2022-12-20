/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagement.BLL;

import java.util.Date;

import hotelmanagement.DAL.DatTraPhongDAL;
import hotelmanagement.DAL.KhachHangDAL;
import hotelmanagement.DAL.PhongDAL;
import hotelmanagement.DTO.DatTraPhongDTO;
import hotelmanagement.DTO.KhachHangDTO;
import hotelmanagement.DTO.PhongDTO;

/**
 *
 * @author Haizz
 */
public class DatPhongBLL {
    public static DatPhongBLL instance;

    public DatPhongBLL() {
        
    }

    public static DatPhongBLL getInstance() {
        if (instance == null) {
            instance = new DatPhongBLL();
        }
        return instance;
    }
    
    
    public Boolean addData(String hoten, String sdt, String gioitinh, String cccd, Date beginDate, Date endDate, String note, PhongDTO Phong) {
        DatTraPhongDTO dattra = new DatTraPhongDTO();
        KhachHangDTO KhachHang = new KhachHangDTO();
        KhachHang.setCCCD(cccd);
        KhachHang.setSoDienThoai(sdt);
        KhachHang.setTenKhachHang(hoten);
        KhachHang.setGioiTinh(Integer.parseInt(gioitinh));
        
        dattra.setCCCD(cccd);
        dattra.setNgayDatPhong(beginDate);
        dattra.setNgayTraPhong(endDate);
        dattra.setMaNhanVien(3);
        dattra.setGhichu(note);
        dattra.setMaphong(Phong.getMaPhong());
        PhongDAL.getInstance().changeStatus(Phong, 1);
        KhachHangDAL.getInstance().saveCustomerData(KhachHang);
        int res = DatTraPhongDAL.getInstance().addData(dattra);
        return res == 1;
    }
    
    public DatTraPhongDTO getData(PhongDTO Phong) {
        return DatTraPhongDAL.getInstance().getData(Phong);
    }
    
    
    
}
