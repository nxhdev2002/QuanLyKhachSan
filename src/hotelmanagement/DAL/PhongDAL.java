/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagement.DAL;
import java.sql.ResultSet;

import hotelmanagement.DTO.KhachHangDTO;
import hotelmanagement.DTO.PhongDTO;
import java.util.ArrayList;

/**
 *
 * @author nguyenxuanhoang
 */
public class PhongDAL {
    private static PhongDAL instance;
    private PhongDTO phong;
    private PhongDAL() {
    }
    
    

    public static PhongDAL getInstance() {
        if (instance == null){
            instance = new PhongDAL();
        }
        return instance;
    }
    
    public ArrayList<PhongDTO> loadData() {
        ArrayList<PhongDTO> DSPhong = new ArrayList<PhongDTO>();
        String query = "SELECT * FROM Phong";
        try {
            ResultSet rs = DAL.getInstance().executeQueryToGetData(query);
            
            while (rs.next()) {
                phong = new PhongDTO();
                phong.setMaPhong(rs.getInt("maphong"));
                phong.setSoPhong(rs.getInt("sophong"));
                phong.setTrangThai(rs.getInt("trangthai"));
                phong.setSoTang(rs.getInt("soTang"));
                phong.setMaLoaiPhong(rs.getInt("maloaiphong"));
                DSPhong.add(phong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DSPhong;
    } 

    public int addData(PhongDTO Phong) {
        String query = String.format(
            "INSERT INTO Phong(sophong, soTang, trangthai, maloaiphong) VALUES (%1$s, %2$s, %3$s, %4$s)",
            Phong.getSoPhong(), Phong.getSoTang(), Phong.getTrangThai(), Phong.getMaLoaiPhong());
            return DAL.getInstance().executeQueryUpdate(query);
    }

    public int removeData(PhongDTO Phong) {
        String query = "DELETE FROM Phong WHERE maphong=" + Phong.getMaPhong();
        return DAL.getInstance().executeQueryUpdate(query);
    }

    public int changeStatus(PhongDTO Phong, int status) {
        String query = String.format(
            "UPDATE Phong SET trangthai = '%s' WHERE maphong=" + Phong.getMaPhong()
        , status);
        return DAL.getInstance().executeQueryUpdate(query);
    }
    
} 
