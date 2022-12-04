package hotelmanagement.DTO;

import java.text.DecimalFormat;

public class DichVuDTO {
    private int maDichVu;
    private String tenDichVu;
    private DecimalFormat Tien;
    private int soLuong;
    private DecimalFormat thanhTien;
    private String ghiChu;
    
    public int getMaDichVu() {
        return maDichVu;
    }
    public void setMaDichVu(int maDichVu) {
        this.maDichVu = maDichVu;
    }
    public String getTenDichVu() {
        return tenDichVu;
    }
    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }
    public DecimalFormat getTien() {
        return Tien;
    }
    public void setTien(DecimalFormat tien) {
        Tien = tien;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public DecimalFormat getThanhTien() {
        return thanhTien;
    }
    public void setThanhTien(DecimalFormat thanhTien) {
        this.thanhTien = thanhTien;
    }
    public String getGhiChu() {
        return ghiChu;
    }
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
}
