package hotelmanagement.BLL;

import java.util.ArrayList;

import hotelmanagement.DAL.DatDichVuDAL;
import hotelmanagement.DTO.DatDichVuDTO;
import hotelmanagement.DTO.DatTraPhongDTO;

public class DatDichVuBLL {
    public static DatDichVuBLL instance;
    public DatDichVuBLL() {
        
    }

    public static DatDichVuBLL getInstance() {
        if (instance == null) {
            instance = new DatDichVuBLL();
        }
        return instance;
    }

    public ArrayList<DatDichVuDTO> loadData(DatTraPhongDTO DatTra) {
        return DatDichVuDAL.getInstance().loadData(DatTra);
    }

    public int getNumberByServiceId(DatTraPhongDTO DatTra, int ID) {
        return DatDichVuDAL.getInstance().getNumberByServiceId(DatTra, ID);
    }
}
