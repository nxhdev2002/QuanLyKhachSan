package hotelmanagement.BLL;

import java.sql.ResultSet;
import java.sql.SQLException;

import hotelmanagement.DAL.DAL;
import hotelmanagement.DAL.KhachHangDAL;
import hotelmanagement.DTO.KhachHangDTO;

public class KhachHangBLL {
    public static KhachHangBLL instance;

    public KhachHangBLL() {
        
    }

    public static KhachHangBLL getInstance() {
        if (instance == null) {
            instance = new KhachHangBLL();
        }
        return instance;
    }

    public KhachHangDTO getDataFromCCCD(String CCCD) {
        return KhachHangDAL.getInstance().loadDataFromCCCD(CCCD);
    }

}
