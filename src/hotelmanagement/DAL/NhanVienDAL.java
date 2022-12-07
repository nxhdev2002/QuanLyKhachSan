package hotelmanagement.DAL;
import java.sql.ResultSet;
import hotelmanagement.DTO.NhanVienDTO;
import java.util.ArrayList;

/**
 *
 * @author nguyenxuanhoang
 */
public class NhanVienDAL {
    private static NhanVienDAL instance;
    private ArrayList<NhanVienDTO> DSPhong;
    
    private NhanVienDAL() {
        this.DSPhong = new ArrayList<NhanVienDTO>();
        loadData();
    }
    
    public static NhanVienDAL getInstance() {
        if (instance == null){
            instance = new NhanVienDAL();
        }
        return instance;
    }
    
    public ArrayList<NhanVienDTO> loadData() {
        String query = "SELECT * FROM NhanVien";
        try {
            ResultSet rs = DAL.getInstance().executeQueryToGetData(query);
            while (rs.next()) {
                NhanVienDTO NhanVien = new NhanVienDTO();
                NhanVien.setMaNhanVien(rs.getInt("manhanvien"));
                NhanVien.setTenNhanVien(rs.getString("tennhanvien"));
                NhanVien.setGioiTinh(rs.getInt("gioitinh"));
                NhanVien.setSoDienThoai(rs.getString("sodienthoai"));
                NhanVien.setNgaySinh(rs.getDate("ngaysinh"));
                NhanVien.setDiaChi(rs.getString("diaChi"));
                this.DSPhong.add(NhanVien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.DSPhong;
    } 
}