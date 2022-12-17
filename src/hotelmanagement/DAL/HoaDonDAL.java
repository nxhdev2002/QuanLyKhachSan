package hotelmanagement.DAL;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import hotelmanagement.DTO.HoaDonDTO;
import java.util.ArrayList;

/**
 *
 * @author nguyenxuanhoang
 */
public class HoaDonDAL {
    private static HoaDonDAL instance;
    private ArrayList<HoaDonDTO> DSPhong;
    
    private HoaDonDAL() {
        this.DSPhong = new ArrayList<HoaDonDTO>();
        loadData();
    }
    
    public static HoaDonDAL getInstance() {
        if (instance == null){
            instance = new HoaDonDAL();
        }
        return instance;
    }
    
    public ArrayList<HoaDonDTO> loadData() {
        String query = "SELECT * FROM HoaDon";
        try {
            ResultSet rs = DAL.getInstance().executeQueryToGetData(query);
            while (rs.next()) {
                HoaDonDTO HoaDon = new HoaDonDTO();
                HoaDon.setCCCD(rs.getString("CCCD"));
                HoaDon.setMaHoaDon(rs.getInt("MaHoaDon"));
                HoaDon.setMaNhanVien(rs.getInt("MaNhanVien"));
                HoaDon.setMaPhong(rs.getInt("MaPhong"));
                HoaDon.setNgayThanhToan(rs.getDate("NgayThanhToan"));
                HoaDon.setSoNgayThue(rs.getInt("SoNgayThue"));
                HoaDon.setThanhTien(rs.getBigDecimal("ThanhTien"));
                
                this.DSPhong.add(HoaDon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.DSPhong;
    } 

    public int addData(HoaDonDTO HoaDon) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");


        String query = String.format(
            "INSERT INTO HoaDon(MaNhanVien, CCCD, MaPhong, SoNgayThue, ThanhTien, NgayThanhToan) VALUES (%1$s, '%2$s', %3$s, %4$s, %5$s, '%6$s')",
            HoaDon.getMaNhanVien(), HoaDon.getCCCD(), HoaDon.getMaPhong(), HoaDon.getSoNgayThue(), HoaDon.getThanhTien(), dateFormat.format(HoaDon.getNgayThanhToan()));
            return DAL.getInstance().executeQueryUpdate(query);
    }



}