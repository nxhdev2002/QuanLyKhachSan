package hotelmanagement.DTO;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class DoanhThuDTO {
    private int maDoanhThu;
    private LocalDate ngayThang;
    private DecimalFormat tienHoaDon;
    private DecimalFormat phiDuyTri;
    private DecimalFormat tongKet;
    private String ghiChu;
    public int getMaDoanhThu() {
        return maDoanhThu;
    }
    public void setMaDoanhThu(int maDoanhThu) {
        this.maDoanhThu = maDoanhThu;
    }
    public LocalDate getNgayThang() {
        return ngayThang;
    }
    public void setNgayThang(LocalDate ngayThang) {
        this.ngayThang = ngayThang;
    }
    public DecimalFormat getTienHoaDon() {
        return tienHoaDon;
    }
    public void setTienHoaDon(DecimalFormat tienHoaDon) {
        this.tienHoaDon = tienHoaDon;
    }
    public DecimalFormat getPhiDuyTri() {
        return phiDuyTri;
    }
    public void setPhiDuyTri(DecimalFormat phiDuyTri) {
        this.phiDuyTri = phiDuyTri;
    }
    public DecimalFormat getTongKet() {
        return tongKet;
    }
    public void setTongKet(DecimalFormat tongKet) {
        this.tongKet = tongKet;
    }
    public String getGhiChu() {
        return ghiChu;
    }
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    
}
