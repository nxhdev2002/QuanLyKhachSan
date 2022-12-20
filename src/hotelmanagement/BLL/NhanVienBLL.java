package hotelmanagement.BLL;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import hotelmanagement.DAL.NhanVienDAL;
import hotelmanagement.DTO.NhanVienDTO;

public class NhanVienBLL {
    private static NhanVienBLL instance;

    public NhanVienBLL() {
    }

    public static NhanVienBLL getInstance() {
        if (instance == null) {
            instance = new NhanVienBLL();
        }
        return instance;
    }

    public DefaultTableModel getTableNhanVien() {
        DefaultTableModel dtm = new DefaultTableModel();
        int Count = 0;
        ArrayList<NhanVienDTO> dsNhanVien = NhanVienDAL.getInstance().loadData();
        dtm.addColumn("STT");
        dtm.addColumn("Mã Nhân Viên");
        dtm.addColumn("Tên Nhân Viên");
        dtm.addColumn("Giới Tính");
        dtm.addColumn("Số Điện Thoại");
        dtm.addColumn("Ngày Sinh");
        dtm.addColumn("Địa Chỉ");
        for (NhanVienDTO staff: dsNhanVien) {
            Count+=1;
            Object[] row = { Count, staff.getMaNhanVien(), staff.getTenNhanVien(), staff.getGioiTinh() == 1 ? "Nam" : "Nữ", staff.getSoDienThoai(), staff.getNgaySinh(), staff.getDiaChi()};
            dtm.addRow(row);
        }
        return dtm;
    }
}
