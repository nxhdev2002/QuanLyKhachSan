package hotelmanagement.BLL;

import java.util.ArrayList;

import hotelmanagement.DAL.DichVuDAL;
import hotelmanagement.DTO.DichVuDTO;
public class DichVuBLL {
    private static DichVuBLL instance;
    private ArrayList<DichVuDTO> DSDichVu;

    public DichVuBLL() {
        DSDichVu = new ArrayList<>();
    }

    public static DichVuBLL getInstance() {
        if (instance == null) {
            instance = new DichVuBLL();
        }
        return instance;
    }

    public ArrayList<DichVuDTO> getData() {
        DSDichVu.clear();
        DSDichVu = DichVuDAL.getInstance().loadData();
        return DSDichVu;
    }
}
