package hotelmanagement.BLL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import hotelmanagement.DAL.DAL;
import hotelmanagement.DAL.KhachHangDAL;
import hotelmanagement.DTO.KhachHangDTO;

public class KhachHangBLL {
    public static KhachHangBLL instance;

    public KhachHangBLL() {
        
    }

    public static KhachHangBLL getInstance() {
        if (instance == null) {
            instance = new KhachHangBLL();
        }
        return instance;
    }

    public KhachHangDTO getDataFromCCCD(String CCCD) {
        return KhachHangDAL.getInstance().loadDataFromCCCD(CCCD);
    }

    public DefaultTableModel getTableKhachHang() {
        String[] title = {"STT", "CCCD", "Tên Khách Hàng", "Giới Tính", "Số Điện Thoại"};
        DefaultTableModel dtm = new DefaultTableModel(null, title);
        int Count = 0;
        ArrayList<KhachHangDTO> dsDichVu = KhachHangDAL.getInstance().loadData();
        for (KhachHangDTO customer: dsDichVu) {
            Count+=1;
            Object[] row = { Count, customer.getCCCD(), customer.getTenKhachHang(), customer.getGioiTinh() == 1 ? "Nam" : "Nữ", customer.getSoDienThoai()};
            dtm.addRow(row);
        }
        return dtm;
    }
    public void updateData(ArrayList<KhachHangDTO> customers) {
        for (KhachHangDTO cust: customers) {
            KhachHangDAL.getInstance().updateData(cust);
        }
    }
}
