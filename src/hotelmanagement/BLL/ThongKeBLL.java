package hotelmanagement.BLL;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import hotelmanagement.utils;
import hotelmanagement.DAL.HoaDonDAL;
import hotelmanagement.DTO.HoaDonDTO;
import java.util.Date;

public class ThongKeBLL {
    public static ThongKeBLL instance;

    public ThongKeBLL() {
    }

    public static ThongKeBLL getInstance() {
        if (instance == null) {
            instance = new ThongKeBLL();
        }
        return instance;
    }

    public DefaultTableModel getTableData() {
        DefaultTableModel dtm = new DefaultTableModel();
        int Count = 0;
        ArrayList<HoaDonDTO> dsHoaDon = HoaDonDAL.getInstance().loadData();
        dtm.addColumn("STT");
        dtm.addColumn("Mã Hoá Đơn");
        dtm.addColumn("Ngày Thanh Toán");
        dtm.addColumn("Thành Tiền");
        for (HoaDonDTO hoadon: dsHoaDon) {
            Count+=1;
            Object[] row = { Count, hoadon.getMaHoaDon(), hoadon.getNgayThanhToan() , hoadon.getThanhTien()};
            dtm.addRow(row);
        }

        return dtm;
    }
    
    public DefaultTableModel getDataBetween2Days(Date d1, Date d2) {
        DefaultTableModel dtm = new DefaultTableModel();
        int Count = 0;
        
        ArrayList<HoaDonDTO> dsHoaDon = HoaDonDAL.getInstance().getDataBetWeen2Days(d1, d2);
        dtm.addColumn("STT");
        dtm.addColumn("Mã Hoá Đơn");
        dtm.addColumn("Ngày Thanh Toán");
        dtm.addColumn("Thành Tiền");
        for (HoaDonDTO hoadon: dsHoaDon) {
            Count+=1;
            Object[] row = { Count, hoadon.getMaHoaDon(), hoadon.getNgayThanhToan() , hoadon.getThanhTien()};
            dtm.addRow(row);
        }

        return dtm;
    }
    
}
