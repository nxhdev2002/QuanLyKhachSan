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
}
