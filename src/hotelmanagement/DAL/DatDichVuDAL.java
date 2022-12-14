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

    public int addDichVu(DatTraPhongDTO DatTraPhong, DatDichVuDTO DV) {
        String query = String.format(
            "INSERT INTO DatDichVu(MaDichVu, MaHopDong, SoLuong, ThanhTien) values (%1$s, %2$s, %3$s, %4$s)",
            DV.getMaDichVu(), DatTraPhong.getMaHopDong(), DV.getSoLuong(), DV.getThanhTien()
        );
        return DAL.getInstance().executeQueryUpdate(query);
    }

    public int updateDichVu(DatTraPhongDTO DatTraPhong, DatDichVuDTO DV) {
        String query = String.format(
            "UPDATE DatDichVu SET SoLuong = %1$s AND ThanhTien = %2$s WHERE MaDichVu=%3$s AND MaHopDong=" + DatTraPhong.getMaHopDong(),
            DV.getSoLuong(), DV.getThanhTien(), DV.getMaDichVu()
        );
        return DAL.getInstance().executeQueryUpdate(query);
    }
}
