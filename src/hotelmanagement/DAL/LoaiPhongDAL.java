package hotelmanagement.DAL;
import java.math.BigDecimal;
import java.sql.ResultSet;
import hotelmanagement.DTO.LoaiPhongDTO;
import hotelmanagement.DTO.PhongDTO;

import java.util.ArrayList;

/**
 *
 * @author nguyenxuanhoang
 */
public class LoaiPhongDAL {
    private static LoaiPhongDAL instance;
    private ArrayList<LoaiPhongDTO> DSLoaiPhong;
    
    private LoaiPhongDAL() {
        this.DSLoaiPhong = new ArrayList<LoaiPhongDTO>();
        loadData();
    }
    
    public static LoaiPhongDAL getInstance() {
        if (instance == null){
            instance = new LoaiPhongDAL();
        }
        return instance;
    }
    
    public ArrayList<LoaiPhongDTO> loadData() {
        this.DSLoaiPhong.clear();
        String query = "SELECT * FROM LoaiPhong";
        try {
            ResultSet rs = DAL.getInstance().executeQueryToGetData(query);
            while (rs.next()) {
                LoaiPhongDTO LoaiPhong = new LoaiPhongDTO();
                LoaiPhong.setMaLoaiPhong(rs.getInt("MaLoaiPhong"));
                LoaiPhong.setTenLoaiPhong(rs.getString("TenLoaiPhong"));
                LoaiPhong.setDonGia(rs.getBigDecimal("DonGia"));
                this.DSLoaiPhong.add(LoaiPhong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.DSLoaiPhong;
    } 

    public BigDecimal getGiaTien(PhongDTO Phong) {
        BigDecimal res = null;
        for (LoaiPhongDTO P: this.DSLoaiPhong) {
            if (P.getMaLoaiPhong() == Phong.getMaLoaiPhong()) {{
                res = P.getDonGia();
            }}
        }
        return res;
    }

}