package hotelmanagement.DAL;
import java.sql.ResultSet;
import hotelmanagement.DTO.DatTraPhongDTO;
import hotelmanagement.DTO.PhongDTO;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguyenxuanhoang
 */
public class DatTraPhongDAL {
    private static DatTraPhongDAL instance;
    
    private DatTraPhongDAL() {
    }
    
    public static DatTraPhongDAL getInstance() {
        if (instance == null){
            instance = new DatTraPhongDAL();
        }
        return instance;
    }
    
    public ArrayList<DatTraPhongDTO> loadData() {
        ArrayList<DatTraPhongDTO> DatTraPhong = new ArrayList<DatTraPhongDTO>();
        String query = "SELECT * FROM DatTraPhong";
        try {
            ResultSet rs = DAL.getInstance().executeQueryToGetData(query);
            while (rs.next()) {
                DatTraPhongDTO DTPhong = new DatTraPhongDTO();
                DTPhong.setMaHopDong(rs.getInt("mahopdong"));
                DTPhong.setCCCD(rs.getString("CCCD"));
                DTPhong.setMaNhanVien(rs.getInt("manhanvien"));
                DTPhong.setNgayDatPhong(rs.getDate("ngaydatphong"));
                DTPhong.setNgayTraPhong(rs.getDate("ngaytraphong"));
                DatTraPhong.add(DTPhong);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatTraPhong;
    } 


    public int addData(DatTraPhongDTO datTraPhong) {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ngaydatphong = sdf.format(datTraPhong.getNgayDatPhong());
        String ngaytraphong = sdf.format(datTraPhong.getNgayTraPhong());
        String query = String.format(
            "INSERT INTO DatTraPhong(CCCD, maphong, MaNhanVien, NgayDatPhong, NgayTraPhong, GhiChu) VALUES ('%1$s', '%2$s', '%3$s', '%4$s', '%5$s', '%6$s')",
            datTraPhong.getCCCD(), datTraPhong.getMaphong(), datTraPhong.getMaNhanVien(), ngaydatphong, ngaytraphong, datTraPhong.getGhichu());
        System.out.println(query);
        return DAL.getInstance().executeQueryUpdate(query);
    }

    public int removeData(DatTraPhongDTO datTraPhong) {
        String query = "DELETE FROM DatTraPhong WHERE MaHopDong=" + datTraPhong.getMaHopDong();
        return DAL.getInstance().executeQueryUpdate(query);
    }
    
    public DatTraPhongDTO getData(PhongDTO Phong) {
        DatTraPhongDTO res = new DatTraPhongDTO();
        try {
            String query = "SELECT * FROM DatTraPhong WHERE maphong=" + Phong.getMaPhong() + " AND DangHoatDong = 1";
            ResultSet rs = DAL.getInstance().executeQueryToGetData(query);
            while(rs.next()) {
                res.setCCCD(rs.getString("CCCD"));
                res.setGhichu(rs.getString("GhiChu"));
                res.setMaHopDong(rs.getInt("MaHopDong"));
                res.setMaNhanVien(0);
                res.setMaphong(rs.getInt("maphong"));
                res.setNgayDatPhong(rs.getDate("NgayDatPhong"));
                res.setNgayTraPhong(rs.getDate("NgayTraPhong"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatTraPhongDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
}