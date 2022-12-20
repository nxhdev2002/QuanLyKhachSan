package hotelmanagement.DAL;
import java.sql.ResultSet;

import hotelmanagement.DTO.DichVuDTO;
import java.util.ArrayList;


public class DichVuDAL {
    private static DichVuDAL instance;
    private ArrayList<DichVuDTO> DSDichVu;
    
    private DichVuDAL() {
    }
    
    public static DichVuDAL getInstance() {
        if (instance == null){
            instance = new DichVuDAL();
        }
        return instance;
    }
    
    public ArrayList<DichVuDTO> loadData() {
        this.DSDichVu = new ArrayList<DichVuDTO>();
        String query = "SELECT * FROM DichVu";
        try {
            ResultSet rs = DAL.getInstance().executeQueryToGetData(query);
            while (rs.next()) {
                DichVuDTO DichVu = new DichVuDTO();
                DichVu.setMaDichVu(rs.getInt("MaDichVu"));
                DichVu.setTenDichVu(rs.getString("TenDichVu"));
                DichVu.setDonGia(rs.getBigDecimal("DonGia"));
                DichVu.setLoaiDichVu(rs.getString("LoaiDichVu"));
                DichVu.setThumbnail(rs.getString("Thumbnail"));
                this.DSDichVu.add(DichVu); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.DSDichVu;
    } 

    public int addData(DichVuDTO DichVu) {
        String query = String.format(
            "INSERT INTO DichVu(TenDichVu, DonGia, LoaiDichVu, Thumbnail) VALUES ('%1$s', %2$s, '%3$s', '%4$s')",
            DichVu.getTenDichVu(), DichVu.getDonGia(), DichVu.getLoaiDichVu(), DichVu.getThumbnail()
        );
        return DAL.getInstance().executeQueryUpdate(query);
    }

    public int updateData(DichVuDTO DichVu) {
        String query = String.format(
            "UPDATE DichVu SET TenDichVu='%1$s', DonGia=%2$s, LoaiDichVu='%3$s', Thumbnail='%4$s' WHERE MaDichVu=" + DichVu.getMaDichVu(),
            DichVu.getTenDichVu(), DichVu.getDonGia(), DichVu.getLoaiDichVu(), DichVu.getThumbnail()
        );
        return DAL.getInstance().executeQueryUpdate(query);
    }

    
}
