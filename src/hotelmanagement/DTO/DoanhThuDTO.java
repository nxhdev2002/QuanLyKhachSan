package hotelmanagement.DTO;

import java.math.BigDecimal;
import java.util.Date;

public class DoanhThuDTO {
    private int maDoanhThu;
    private Date ngayThang;
    private BigDecimal tienHoaDon;
    private BigDecimal phiDuyTri;
    private BigDecimal tongKet;
    private String ghiChu;
    public int getMaDoanhThu() {
        return maDoanhThu;
    }
    public void setMaDoanhThu(int maDoanhThu) {
        this.maDoanhThu = maDoanhThu;
    }
    public Date getNgayThang() {
        return ngayThang;
    }
    public void setNgayThang(Date ngayThang) {
        this.ngayThang = ngayThang;
    }
    public BigDecimal getTienHoaDon() {
        return tienHoaDon;
    }
    public void setTienHoaDon(BigDecimal bigDecimal) {
        this.tienHoaDon = bigDecimal;
    }
    public BigDecimal getPhiDuyTri() {
        return phiDuyTri;
    }
    public void setPhiDuyTri(BigDecimal bigDecimal) {
        this.phiDuyTri = bigDecimal;
    }
    public BigDecimal getTongKet() {
        return tongKet;
    }
    public void setTongKet(BigDecimal bigDecimal) {
        this.tongKet = bigDecimal;
    }
    public String getGhiChu() {
        return ghiChu;
    }
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    
}
