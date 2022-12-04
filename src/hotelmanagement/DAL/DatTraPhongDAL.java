package hotelmanagement.DAL;
import java.sql.ResultSet;
import hotelmanagement.DTO.DatTraPhongDTO;
import java.util.ArrayList;

/**
 *
 * @author nguyenxuanhoang
 */
public class DatTraPhongDAL {
    private static DatTraPhongDAL instance;
    private ArrayList<DatTraPhongDTO> DatTraPhong;
    
    private DatTraPhongDAL() {
        this.DatTraPhong = new ArrayList<DatTraPhongDTO>();
        loadData();
    }
    
    public static DatTraPhongDAL getInstance() {
        if (instance == null){
            instance = new DatTraPhongDAL();
        }
        return instance;
    }
    
    public ArrayList<DatTraPhongDTO> loadData() {
        String query = "SELECT * FROM DatTraPhong";
        try {
            ResultSet rs = DAL.getInstance().executeQueryToGetData(query);
            while (rs.next()) {
                DatTraPhongDTO DTPhong = new DatTraPhongDTO();
                DTPhong.setMaHopDong(rs.getInt("mahopdong"));
                DTPhong.setCCCD(rs.getString("CCCD"));
                DTPhong.setMaNhanVien(rs.getInt("manhanvien"));
                DTPhong.setNgayDatPhong(rs.getDate("ngaydatphong"));
                DTPhong.setNgayTraPhong(rs.getDate("ngaytraphong"));
                this.DatTraPhong.add(DTPhong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.DatTraPhong;
    } 
}