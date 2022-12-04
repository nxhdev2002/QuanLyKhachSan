package hotelmanagement.DAL;
import java.sql.ResultSet;
import hotelmanagement.DTO.LoaiPhongDTO;
import java.util.ArrayList;

/**
 *
 * @author nguyenxuanhoang
 */
public class LoaiPhongDAL {
    private static LoaiPhongDAL instance;
    private ArrayList<LoaiPhongDTO> DSPhong;
    
    private LoaiPhongDAL() {
        this.DSPhong = new ArrayList<LoaiPhongDTO>();
        loadData();
    }
    
    public static LoaiPhongDAL getInstance() {
        if (instance == null){
            instance = new LoaiPhongDAL();
        }
        return instance;
    }
    
    public ArrayList<LoaiPhongDTO> loadData() {
        String query = "SELECT * FROM LoaiPhong";
        try {
            ResultSet rs = DAL.getInstance().executeQueryToGetData(query);
            while (rs.next()) {
                LoaiPhongDTO LoaiPhong = new LoaiPhongDTO();
                LoaiPhong.setMaLoaiPhong(rs.getInt("maloaiphong"));
                LoaiPhong.setTenLoaiPhong(rs.getString("tenloaiphong"));
                LoaiPhong.setDonGia(null);
                
                this.DSPhong.add(LoaiPhong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.DSPhong;
    } 
}