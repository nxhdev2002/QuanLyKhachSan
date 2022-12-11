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

    public ArrayList<String> getListCategory() {
        ArrayList<String> res = new ArrayList<>();
        for (DichVuDTO serv: this.DSDichVu) {
            if (!res.contains(serv.getLoaiDichVu()))
                res.add(serv.getLoaiDichVu());
        }
        return res;
    }

    public ArrayList<DichVuDTO> filterData(String Category, String keyword) {
        ArrayList<DichVuDTO> res = new ArrayList<>();
        for (DichVuDTO serv: this.DSDichVu) {
            if (Category != "Tất cả") {
                if (keyword.length() > 1) {
                    if (serv.getLoaiDichVu() == Category && serv.getTenDichVu().toLowerCase().contains(keyword)) 
                    res.add(serv);
                } else {
                    if (serv.getLoaiDichVu() == Category) 
                    res.add(serv);
                }
            } else {
                if (serv.getTenDichVu().toLowerCase().contains(keyword)) res.add(serv);
            }
        }
        return res;
    }

}
