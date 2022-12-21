package hotelmanagement.DAL;
import java.sql.ResultSet;
import java.sql.SQLException;

import hotelmanagement.DTO.KhachHangDTO;
import java.util.ArrayList;

/**
 *
 * @author nguyenxuanhoang
 */
public class KhachHangDAL {
    private static KhachHangDAL instance;
    private ArrayList<KhachHangDTO> DSKhachHang;
    
    private KhachHangDAL() {
        this.DSKhachHang = new ArrayList<KhachHangDTO>();
        loadData();
    }
    
    public static KhachHangDAL getInstance() {
        if (instance == null){
            instance = new KhachHangDAL();
        }
        return instance;
    }
    
    public ArrayList<KhachHangDTO> loadData() {
        this.DSKhachHang.clear();
        String query = "SELECT * FROM KhachHang";
        try {
            ResultSet rs = DAL.getInstance().executeQueryToGetData(query);
            while (rs.next()) {
                KhachHangDTO KhachHang = new KhachHangDTO();
                KhachHang.setTenKhachHang(rs.getString("tenkhachhang"));
                KhachHang.setCCCD(rs.getString("CCCD"));
                KhachHang.setSoDienThoai(rs.getString("sodienthoai"));
                KhachHang.setGioiTinh(rs.getInt("GioiTinh"));
            
                this.DSKhachHang.add(KhachHang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.DSKhachHang;
    } 

    public int saveCustomerData(KhachHangDTO KhachHang) {
        Boolean isExist = false;
        for (KhachHangDTO Khach: this.DSKhachHang) {
            if (Khach.getCCCD().equals(KhachHang.getCCCD())) {
                isExist = true;
                // String query = String.format(
                //     "UPDATE KhachHang SET TenKhachHang = 'Alfred Schmidt', City = 'Frankfurt' WHERE CustomerID = 1;",
                //     KhachHang.getTenKhachHang(), KhachHang.getSoDienThoai()
                // )
            }
        }
        if (!isExist) {
            String query = String.format(
                "INSERT INTO KhachHang(CCCD, TenKhachHang, GioiTinh, SoDienThoai ) VALUES ('%1$s', '%2$s', '%3$s', %4$s)",
                KhachHang.getCCCD(), KhachHang.getTenKhachHang(),KhachHang.getGioiTinh() ,KhachHang.getSoDienThoai()
            );
            return DAL.getInstance().executeQueryUpdate(query);
        }
        return 1;
    }
    

    public KhachHangDTO loadDataFromCCCD(String CCCD) {
        KhachHangDTO res = new KhachHangDTO();
        ResultSet rs = DAL.getInstance().executeQueryToGetData("SELECT * FROM KhachHang WHERE CCCD=" + CCCD);
        try {
            while (rs.next()) {
                res.setCCCD(rs.getString("CCCD"));
                res.setSoDienThoai(rs.getString("SoDienThoai"));
                res.setTenKhachHang(rs.getString("TenKhachHang"));
                res.setGioiTinh(rs.getInt("GioiTinh"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return res;
    }
    
    public int updateData(KhachHangDTO KhachHang) {
        String query = String.format(
            "UPDATE KhachHang SET TenKhachHang='%1$s', GioiTinh=%2$s, SoDienThoai='%3$s' WHERE CCCD='" + KhachHang.getCCCD() + "'",
            KhachHang.getTenKhachHang(), KhachHang.getGioiTinh(), KhachHang.getSoDienThoai()
        );
        return DAL.getInstance().executeQueryUpdate(query);
    }
}