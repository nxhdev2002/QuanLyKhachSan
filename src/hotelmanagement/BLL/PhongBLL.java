package hotelmanagement.BLL;

import java.util.ArrayList;

import hotelmanagement.DAL.PhongDAL;
import hotelmanagement.DTO.PhongDTO;

public class PhongBLL {
    public static PhongBLL instance;
    public ArrayList<PhongDTO> DSPhong;

    public PhongBLL() {
        this.DSPhong = new ArrayList<PhongDTO>();
    }

    public static PhongBLL getInstance() {
        if (instance == null)
            instance = new PhongBLL();
        return instance;
    }

    public ArrayList<PhongDTO> loadData() {
        this.DSPhong = PhongDAL.getInstance().loadData();
        return this.DSPhong;
    }

    public ArrayList<PhongDTO> loadDataByTang(int Tang) {
        ArrayList<PhongDTO> rs = new ArrayList<PhongDTO>();
        for (int i = 0; i<this.DSPhong.size(); i++) {
            if (this.DSPhong.get(i).getSoTang() == Tang) rs.add(this.DSPhong.get(i));
        }
        return rs;
    }
}
