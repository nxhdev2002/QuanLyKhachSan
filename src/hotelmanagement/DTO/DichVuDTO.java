package hotelmanagement.DTO;

import java.math.BigDecimal;

public class DichVuDTO {
    private int maDichVu;
    private String tenDichVu;
    private BigDecimal Tien;
    private int soLuong;
    private BigDecimal thanhTien;
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
    public BigDecimal getTien() {
        return Tien;
    }
    public void setTien(BigDecimal bigDecimal) {
        Tien = bigDecimal;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public BigDecimal getThanhTien() {
        return thanhTien;
    }
    public void setThanhTien(BigDecimal bigDecimal) {
        this.thanhTien = bigDecimal;
    }
    public String getGhiChu() {
        return ghiChu;
    }
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
}
