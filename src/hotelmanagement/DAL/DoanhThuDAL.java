package hotelmanagement.DAL;

import java.sql.ResultSet;
import hotelmanagement.DTO.DoanhThuDTO;
import java.util.ArrayList;

/**
 *
 * @author nguyenxuanhoang
 */
public class DoanhThuDAL {
    private static DoanhThuDAL instance;
    private ArrayList<DoanhThuDTO> DSPhong;

    private DoanhThuDAL() {
        this.DSPhong = new ArrayList<DoanhThuDTO>();
        loadData();
    }

    public static DoanhThuDAL getInstance() {
        if (instance == null) {
            instance = new DoanhThuDAL();
        }
        return instance;
    }

    public ArrayList<DoanhThuDTO> loadData() {
        String query = "SELECT * FROM DoanhThu";
        try {
            ResultSet rs = DAL.getInstance().executeQueryToGetData(query);
            while (rs.next()) {
                DoanhThuDTO DoanhThu = new DoanhThuDTO();
                DoanhThu.setMaDoanhThu(rs.getInt("madoanhthu"));
                DoanhThu.setNgayThang(rs.getDate("ngaythang"));
                DoanhThu.setTienHoaDon(rs.getBigDecimal("tienhoadon"));
                DoanhThu.setPhiDuyTri(rs.getBigDecimal("phiduytri"));
                DoanhThu.setTongKet(rs.getBigDecimal("tongket"));
                DoanhThu.setGhiChu(rs.getString("ghichu"));
                this.DSPhong.add(DoanhThu);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.DSPhong;
    }
}