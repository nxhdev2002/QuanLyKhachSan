package hotelmanagement.BLL;

import java.math.BigDecimal;

import hotelmanagement.DAL.LoaiPhongDAL;
import hotelmanagement.DTO.PhongDTO;

public class LoaiPhongBLL {
    public static LoaiPhongBLL instance;

    public LoaiPhongBLL() {
        
    }

    public static LoaiPhongBLL getInstance() {
        if (instance == null) {
            instance = new LoaiPhongBLL();
        }
        return instance;
    }

    public BigDecimal getGiaTien(PhongDTO Phong) {
        return LoaiPhongDAL.getInstance().getGiaTien(Phong);
    } 
}
