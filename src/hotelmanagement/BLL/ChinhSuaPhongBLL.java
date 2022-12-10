package hotelmanagement.BLL;

import hotelmanagement.DAL.KhachHangDAL;
import hotelmanagement.DTO.DatTraPhongDTO;
import hotelmanagement.DTO.KhachHangDTO;

public class ChinhSuaPhongBLL {
    public static ChinhSuaPhongBLL instance;

    public ChinhSuaPhongBLL() {
        
    }

    public static ChinhSuaPhongBLL getInstance() {
        if (instance == null) {
            instance = new ChinhSuaPhongBLL();
        }
        return instance;
    }
    
    public Boolean editData(DatTraPhongDTO DatTra, KhachHangDTO KhachHang) {
        KhachHangDAL.getInstance().saveCustomerData(KhachHang);
        return true;
    }

}
