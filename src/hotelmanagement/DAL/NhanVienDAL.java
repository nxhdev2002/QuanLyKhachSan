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
    private ArrayList<NhanVienDTO> DSNhanVien;
    
    private NhanVienDAL() {
        this.DSNhanVien = new ArrayList<NhanVienDTO>();
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
                this.DSNhanVien.add(NhanVien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.DSNhanVien;
    } 
    
    public int addNhanVien(NhanVienDTO nhanVien) {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ngaySinh = sdf.format(nhanVien.getNgaySinh());
        String query = String.format(
                "INSERT INTO NhanVien(TenNhanVien, GioiTinh, SoDienThoai, NgaySinh, DiaChi) VALUES ('%1$s', %2$s, '%3$s', '%4$s', '%5$s')",
                nhanVien.getTenNhanVien(), nhanVien.getGioiTinh(), nhanVien.getSoDienThoai(), ngaySinh, nhanVien.getDiaChi()
        );
        return DAL.getInstance().executeQueryUpdate(query);
    }

    public int removeNhanVien(NhanVienDTO nhanVien) {
        String query = "DELETE FROM NhanVien WHERE MaNhanVien=" + nhanVien.getMaNhanVien();
        return DAL.getInstance().executeQueryUpdate(query);
    }
}