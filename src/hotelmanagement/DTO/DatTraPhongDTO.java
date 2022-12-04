package hotelmanagement.DTO;

import java.time.LocalDate;

public class DatTraPhongDTO {
    private int maHopDong;
    private String CCCD;
    private int maNhanVien;
    private LocalDate ngayDatPhong;
    private LocalDate ngayTraPhong;
    public int getMaHopDong() {
        return maHopDong;
    }
    public void setMaHopDong(int maHopDong) {
        this.maHopDong = maHopDong;
    }
    public String getCCCD() {
        return CCCD;
    }
    public void setCCCD(String cCCD) {
        CCCD = cCCD;
    }
    public int getMaNhanVien() {
        return maNhanVien;
    }
    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    public LocalDate getNgayDatPhong() {
        return ngayDatPhong;
    }
    public void setNgayDatPhong(LocalDate ngayDatPhong) {
        this.ngayDatPhong = ngayDatPhong;
    }
    public LocalDate getNgayTraPhong() {
        return ngayTraPhong;
    }
    public void setNgayTraPhong(LocalDate ngayTraPhong) {
        this.ngayTraPhong = ngayTraPhong;
    }

    
}
