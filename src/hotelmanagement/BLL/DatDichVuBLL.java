package hotelmanagement.BLL;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import hotelmanagement.DAL.DatDichVuDAL;
import hotelmanagement.DTO.DatDichVuDTO;
import hotelmanagement.DTO.DatTraPhongDTO;
import hotelmanagement.DTO.DichVuDTO;

public class DatDichVuBLL {
    public static DatDichVuBLL instance;
    public DatDichVuBLL() {
        
    }

    public static DatDichVuBLL getInstance() {
        if (instance == null) {
            instance = new DatDichVuBLL();
        }
        return instance;
    }

    public ArrayList<DatDichVuDTO> loadData(DatTraPhongDTO DatTra) {
        return DatDichVuDAL.getInstance().loadData(DatTra);
    }

    public int getNumberByServiceId(DatTraPhongDTO DatTra, int ID) {
        return DatDichVuDAL.getInstance().getNumberByServiceId(DatTra, ID);
    }

    public DefaultTableModel getTableData(DatTraPhongDTO DatTra) {
        DefaultTableModel dtm = new DefaultTableModel();
        int Count = 0;
        BigDecimal TongTien = new BigDecimal(0);
        ArrayList<DatDichVuDTO> orderServices = DatDichVuDAL.getInstance().loadData(DatTra);
        dtm.addColumn("STT");
        dtm.addColumn("Tên Dịch Vụ");
        dtm.addColumn("Đơn Giá");
        dtm.addColumn("Số Lượng");
        dtm.addColumn("Thành Tiền");
        for (DatDichVuDTO serv: orderServices) {
            Count+=1;
            DichVuDTO DV = DichVuBLL.getInstance().getDataById(serv.getMaDichVu());
            Object[] row = { Count, DV.getTenDichVu(), DV.getDonGia() , serv.getSoLuong(), serv.getThanhTien()};
            dtm.addRow(row);
            TongTien = TongTien.add(serv.getThanhTien()); 
        }
        Object[] row = { null, null, null, "Tổng Tiền: ",  TongTien.toString()};
        dtm.addRow(row);

        return dtm;
    }

    public int addDichVu(DatTraPhongDTO DatTra, ArrayList<DatDichVuDTO> danhSachDV) {
        ArrayList<DatDichVuDTO> data = DatDichVuBLL.getInstance().loadData(DatTra);
        int res = 1;
        for (DatDichVuDTO serv: danhSachDV) {
            Boolean isExist = false;

            for (DatDichVuDTO dat: data) {
                if (dat.getMaHopDong() == DatTra.getMaHopDong() && dat.getMaDichVu() == serv.getMaDichVu()) {
                    isExist = true;
                }
            }

            if (isExist) {
                if (serv.getSoLuong() != 0) {
                    DatDichVuDAL.getInstance().updateDichVu(DatTra, serv);
                } else {
                    DatDichVuDAL.getInstance().deledeDichVu(DatTra, serv);
                }
            } else {
                if (serv.getSoLuong() > 0) {
                    DatDichVuDAL.getInstance().addDichVu(DatTra, serv);
                }
            }

        }
        return res;
    }

}
