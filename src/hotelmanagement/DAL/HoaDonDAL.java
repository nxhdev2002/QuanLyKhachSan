package hotelmanagement.DAL;
import java.sql.ResultSet;
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
                HoaDon.setMaHoaDon(rs.getInt("mahoadon"));
                HoaDon.setTenNhanVien(rs.getString("tennhanvien"));
                HoaDon.setTenKhachHang(rs.getString("tenkhachhang"));
                HoaDon.setMaPhong(rs.getInt("maphong"));
                HoaDon.setSoNgayThue(rs.getInt("songaythue"));
                HoaDon.setDonGia(null);
                HoaDon.setThanhTien(null);
                HoaDon.setNgayThanhToan(null);
                HoaDon.setPhuongThucThanhToan(rs.getString("phuongthucthanhtoan"));
                
                this.DSPhong.add(HoaDon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.DSPhong;
    } 
}