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
        ArrayList<String> tang = new ArrayList<String>();
        ArrayList<ArrayList<PhongDTO>> phongMoiTang = new ArrayList<ArrayList<PhongDTO>>();
        this.DSPhong = PhongDAL.getInstance().loadData();
        for (PhongDTO phong : DSPhong) {
            char firstChar = Integer.toString(phong.getSoPhong()).charAt(0);
            if (!tang.contains(Character.toString(firstChar))) {
                tang.add(Character.toString(firstChar));
            } else {
                phongMoiTang.get(firstChar).add(phong);
            }
        }
        System.out.println("LOAD DATA:");
        for (int i = 0; i < tang.size(); i++) {
                System.out.print(tang.get(i));
                System.out.print(", ");
        }
    }
}
