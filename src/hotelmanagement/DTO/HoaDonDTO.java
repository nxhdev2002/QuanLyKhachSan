package hotelmanagement.DTO;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;

public class HoaDonDTO {
    private int maHoaDon;
    private int maNhanVien;
    private String CCCD;
    private int maPhong;
    private int soNgayThue;
    private BigDecimal ThanhTien;
    private Date NgayThanhToan;
    public int getMaHoaDon() {
        return maHoaDon;
    }
    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }
    public int getMaNhanVien() {
        return maNhanVien;
    }
    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    public String getCCCD() {
        return CCCD;
    }
    public void setCCCD(String cCCD) {
        CCCD = cCCD;
    }
    public int getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }
    public int getSoNgayThue() {
        return soNgayThue;
    }
    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }
    public BigDecimal getThanhTien() {
        return ThanhTien;
    }
    public void setThanhTien(BigDecimal bigDecimal) {
        ThanhTien = bigDecimal;
    }
    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }
    public void setNgayThanhToan(Date ngayThanhToan) {
        NgayThanhToan = ngayThanhToan;
    }
    
    
}
