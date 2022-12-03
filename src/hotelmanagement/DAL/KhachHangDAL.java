package hotelmanagement.DAL;
import java.sql.ResultSet;
import hotelmanagement.DTO.KhachHangDTO;
import java.util.ArrayList;

/**
 *
 * @author nguyenxuanhoang
 */
public class KhachHangDAL {
    private static KhachHangDAL instance;
    private ArrayList<KhachHangDTO> DSPhong;
    
    private KhachHangDAL() {
        this.DSPhong = new ArrayList<KhachHangDTO>();
        loadData();
    }
    
    public static KhachHangDAL getInstance() {
        if (instance == null){
            instance = new KhachHangDAL();
        }
        return instance;
    }
    
    public ArrayList<KhachHangDTO> loadData() {
        String query = "SELECT * FROM KhachHang";
        try {
            ResultSet rs = DAL.getInstance().executeQueryToGetData(query);
            while (rs.next()) {
                KhachHangDTO KhachHang = new KhachHangDTO();
                KhachHang.setTenKhachHang(rs.getString("tenkhachhang"));
                KhachHang.setCCCD(rs.getString("CCCD"));
                KhachHang.setSoDienThoai(rs.getString("sodienthoai"));
            
                this.DSPhong.add(KhachHang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.DSPhong;
    } 
}