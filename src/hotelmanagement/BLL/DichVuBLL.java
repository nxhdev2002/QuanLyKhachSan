package hotelmanagement.BLL;

import java.util.ArrayList;

import hotelmanagement.DAL.DichVuDAL;
import hotelmanagement.DTO.DichVuDTO;
public class DichVuBLL {
    private static DichVuBLL instance;
    private ArrayList<DichVuDTO> DSDichVu;

    public DichVuBLL() {
        DSDichVu = new ArrayList<>();
        getData();
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

    public ArrayList<String> getListCategory() {
        ArrayList<String> res = new ArrayList<>();
        for (DichVuDTO serv: this.DSDichVu) {
            if (!res.contains(serv.getLoaiDichVu()))
                res.add(serv.getLoaiDichVu());
        }
        return res;
    }

    public DichVuDTO getDataById(int maDichVu) {
        DichVuDTO res = new DichVuDTO();
        for (DichVuDTO dv: this.DSDichVu) {
            if (dv.getMaDichVu() == maDichVu) {
                res = dv; 
            }
        }
        return res;
    }


}
