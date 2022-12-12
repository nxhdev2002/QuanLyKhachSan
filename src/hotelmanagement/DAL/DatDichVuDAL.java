package hotelmanagement.DAL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import hotelmanagement.DTO.DatDichVuDTO;
import hotelmanagement.DTO.DatTraPhongDTO;
import hotelmanagement.DTO.PhongDTO;

public class DatDichVuDAL {
    private static DatDichVuDAL instance;
    
    private DatDichVuDAL() {
    }
    
    public static DatDichVuDAL getInstance() {
        if (instance == null){
            instance = new DatDichVuDAL();
        }
        return instance;
    }
    
    public ArrayList<DatDichVuDTO> loadData(DatTraPhongDTO DatTra) {
        ArrayList<DatDichVuDTO> DatTraPhong = new ArrayList<DatDichVuDTO>();
        String query = "SELECT * FROM DatDichVu WHERE MaHopDong=" + DatTra.getMaHopDong();
        try {
            ResultSet rs = DAL.getInstance().executeQueryToGetData(query);
            while (rs.next()) {
                DatDichVuDTO DichVuDaDat = new DatDichVuDTO();
                DichVuDaDat.setMaDonHang(rs.getInt("MaDonHang"));
                DichVuDaDat.setMaDichVu(rs.getInt("MaDichVu"));
                DichVuDaDat.setMaHopDong(rs.getInt("MaHopDong"));
                DichVuDaDat.setSoLuong(rs.getInt("SoLuong"));
                DichVuDaDat.setThanhTien(rs.getBigDecimal("ThanhTien"));
                DatTraPhong.add(DichVuDaDat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatTraPhong;
    } 

    public int getNumberByServiceId(DatTraPhongDTO DatTra, int ID) {
        int res = 0;
        String query = "SELECT SoLuong FROM DatDichVu WHERE MaHopDong=" + DatTra.getMaHopDong() + " AND MaDichVu=" + ID;
        try {
            ResultSet rs = DAL.getInstance().executeQueryToGetData(query);
            while (rs.next()) {
                res += rs.getInt("SoLuong");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
