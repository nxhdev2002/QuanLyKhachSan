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
        if (instance == null) {
            instance = new PhongBLL();
        }
        return instance;
    }

    public ArrayList<PhongDTO> loadData() {
        this.DSPhong = PhongDAL.getInstance().loadData();
        return this.DSPhong;
    }

    public ArrayList<PhongDTO> reloadData() {
        this.DSPhong.clear();
        this.DSPhong = PhongDAL.getInstance().loadData();
        return this.DSPhong;
    } 

    public ArrayList<PhongDTO> loadDataByTang(int Tang) {
        ArrayList<PhongDTO> rs = new ArrayList<>();
        for (int i = 0; i < this.DSPhong.size(); i++) {
            if (this.DSPhong.get(i).getSoTang() == Tang) {
                rs.add(this.DSPhong.get(i));
            }
        }
        return rs;
    }

    public int countByRoomStatus(int RoomStatus) {
        int count = 0;
        for (int i = 0; i < this.DSPhong.size(); i++) {
            if (this.DSPhong.get(i).getTrangThai() == RoomStatus) {
                count+=1;
            }
        }
        return count;
    }
    
    public int changeRoomStatus(PhongDTO Phong, int RoomStatus) {
        return PhongDAL.getInstance().changeStatus(Phong, RoomStatus);
    }

    public int addData(int Tang, int maLoaiPhong) {
        /// check xem có phòng nào inactive không
        // nếu có thì active lại
        PhongDTO room = PhongDAL.getInstance().getInactiveRoomByTang(Tang);
        if (room == null) {
            PhongDTO Phong = new PhongDTO();
            ArrayList<PhongDTO> ds = this.loadDataByTang(Tang);
            Phong.setTrangThai(0);
            Phong.setSoTang(Tang);
            Phong.setMaLoaiPhong(maLoaiPhong);
            Phong.setSoPhong(ds.get(ds.size() - 1) .getSoPhong() + 1);
            return PhongDAL.getInstance().addData(Phong); 
        } else {
            return PhongDAL.getInstance().activeRoom(room);
        }
    }

    public int removeData(PhongDTO Phong) {
        return PhongDAL.getInstance().removeData(Phong);
    }
}
