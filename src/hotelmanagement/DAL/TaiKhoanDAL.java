package hotelmanagement.DAL;
import java.sql.ResultSet;
import hotelmanagement.DTO.TaiKhoanDTO;
import java.util.ArrayList;

/**
 *
 * @author nguyenxuanhoang
 */
public class TaiKhoanDAL {
    private static TaiKhoanDAL instance;
    private ArrayList<TaiKhoanDTO> DSPhong;
    
    private TaiKhoanDAL() {
        this.DSPhong = new ArrayList<TaiKhoanDTO>();
        loadData();
    }
    
    public static TaiKhoanDAL getInstance() {
        if (instance == null){
            instance = new TaiKhoanDAL();
        }
        return instance;
    }
    
    public ArrayList<TaiKhoanDTO> loadData() {
        String query = "SELECT * FROM Phong";
        try {
            ResultSet rs = DAL.getInstance().executeQueryToGetData(query);
            while (rs.next()) {
                TaiKhoanDTO TaiKhoan = new TaiKhoanDTO();
                TaiKhoan.setMaTaiKhoan(rs.getInt("mataikhoan"));
                TaiKhoan.setMaNhanVien(rs.getInt("manhanvien"));
                TaiKhoan.setTenTaiKhoan(rs.getString("tentaikhoan"));
                TaiKhoan.setMatKhau(rs.getString("matkhau"));
                TaiKhoan.setLoaiTaiKhoan(rs.getInt("loaitaikhoan"));
                this.DSPhong.add(TaiKhoan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.DSPhong;
    } 
}