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

    public void loadData() {
        // PhongDTO[] tang = new ;
        this.DSPhong = PhongDAL.getInstance().loadData();
    }
}
