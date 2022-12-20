package hotelmanagement.BLL;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import java.awt.Image;
import hotelmanagement.DAL.DichVuDAL;
import hotelmanagement.DTO.DichVuDTO;
public class DichVuBLL {
    private static DichVuBLL instance;
    private ArrayList<DichVuDTO> DSDichVu;

    public DichVuBLL() {
        DSDichVu = new ArrayList<>();
        getData();
    }

    public static DichVuBLL getInstance() {
        if (instance == null) {
            instance = new DichVuBLL();
        }
        return instance;
    }

    public ArrayList<DichVuDTO> getData() {
        DSDichVu.clear();
        DSDichVu = DichVuDAL.getInstance().loadData();
        return DSDichVu;
    }

    public ArrayList<String> getListCategory() {
        ArrayList<String> res = new ArrayList<>();
        for (DichVuDTO serv: this.DSDichVu) {
            if (!res.contains(serv.getLoaiDichVu()))
                res.add(serv.getLoaiDichVu());
        }
        return res;
    }

    public DichVuDTO getDataById(int maDichVu) {
        DichVuDTO res = new DichVuDTO();
        for (DichVuDTO dv: this.DSDichVu) {
            if (dv.getMaDichVu() == maDichVu) {
                res = dv; 
            }
        }
        return res;
    }

    public int addData(DichVuDTO dv) {
        return DichVuDAL.getInstance().addData(dv);
    }

    public void updateData(ArrayList<DichVuDTO> servs) {
        for (DichVuDTO serv: servs) {
            String[] split = serv.getThumbnail().split("hotelmanagement/Statics/Images/");
            String path = "/hotelmanagement/Statics/Images/" + split[1];
            serv.setThumbnail(path);
            DichVuDAL.getInstance().updateData(serv);
        }
    }

    public DefaultTableModel getTableDichVu() {
        String[] title = {"STT", "Mã Dịch Vụ", "Tên Dịch Vụ", "Đơn Giá", "Loại Dịch Vụ", "Hình Ảnh Mô Tả"};
        DefaultTableModel dtm = new DefaultTableModel(null,title){
            @Override
            public Class<?> getColumnClass(int column) {
                if (column==5) return ImageIcon.class;
                return Object.class;
            }
        };
        int Count = 0;
        ArrayList<DichVuDTO> dsDichVu = DichVuDAL.getInstance().loadData();
        for (DichVuDTO serv: dsDichVu) {
            Count+=1;
            Image iconLogo = new ImageIcon(getClass().getResource(serv.getThumbnail())).getImage().getScaledInstance(75, 75,Image.SCALE_DEFAULT);
            ImageIcon img = new ImageIcon(iconLogo);
            Object[] row = { Count, serv.getMaDichVu(), serv.getTenDichVu(), serv.getDonGia(), serv.getLoaiDichVu(), img};
            dtm.addRow(row);
        }
        return dtm;
    }


}
