/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagement.DAL;
import java.sql.ResultSet;
import hotelmanagement.DTO.PhongDTO;
import java.util.ArrayList;

/**
 *
 * @author nguyenxuanhoang
 */
public class PhongDAL {
    private static PhongDAL instance;
    private ArrayList<PhongDTO> DSPhong;
    private PhongDTO phong;
    private PhongDAL() {
        this.DSPhong = new ArrayList<PhongDTO>();
        loadData();
    }
    
    public static PhongDAL getInstance() {
        if (instance == null){
            instance = new PhongDAL();
        }
        return instance;
    }
    
    public ArrayList<PhongDTO> loadData() {
        String query = "SELECT * FROM Phong";
        try {
            ResultSet rs = DAL.getInstance().executeQueryToGetData(query);
            
            while (rs.next()) {
                phong = new PhongDTO();
                phong.setMaPhong(rs.getInt("maphong"));
                phong.setSoPhong(rs.getInt("sophong"));
                phong.setTrangThai(rs.getInt("trangthai"));
                phong.setMaLoaiPhong(rs.getInt("maloaiphong"));
                phong.setGhiChu(rs.getString("ghichu"));
                this.DSPhong.add(phong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.DSPhong;
    } 

    public int addData(PhongDTO Phong) {
        String query = String.format(
            "INSERT INTO phong(sophong, soTang, trangthai, maloaiphong, ghichu) VALUES (%1$s, %2$s, %3$s, %4$s, %5$s)",
            phong.getSoPhong(), phong.getSoTang(), phong.getTrangThai(), phong.getMaLoaiPhong(), phong.getGhiChu());
            return DAL.getInstance().executeQueryUpdate(query);
    }

    public int removeData(PhongDTO Phong) {
        String query = "DELETE FROM Phong WHERE maphong=" + Phong.getMaPhong();
        return DAL.getInstance().executeQueryUpdate(query);
    }

    public int updateData(PhongDTO phongCu, PhongDTO phongMoi) {
        String query = String.format(
            "UPDATE Phong SET sophong = '%1$s', soTang = '%2$s', trangthai = '%3$s', maloaiphong = '%4$s', ghichu = '%5$s' WHERE maphong=" + phongCu.getMaPhong()
        , phongMoi.getSoPhong(), phongMoi.getSoTang(), phongMoi.getTrangThai(), phongMoi.getMaLoaiPhong(), phongMoi.getGhiChu());
        return DAL.getInstance().executeQueryUpdate(query);
    }
}
