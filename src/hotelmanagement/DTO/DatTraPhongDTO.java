package hotelmanagement.DTO;

import java.util.Date;

public class DatTraPhongDTO {
    private int maHopDong;
    private String CCCD;
    private int maphong;
    private int maNhanVien;
    private Date ngayDatPhong;
    private Date ngayTraPhong;
    public int getMaphong() {
        return maphong;
    }
    public void setMaphong(int maphong) {
        this.maphong = maphong;
    }
    private String ghichu;
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
    public Date getNgayDatPhong() {
        return ngayDatPhong;
    }
    public void setNgayDatPhong(Date ngayDatPhong) {
        this.ngayDatPhong = ngayDatPhong;
    }
    public Date getNgayTraPhong() {
        return ngayTraPhong;
    }
    public void setNgayTraPhong(Date ngayTraPhong) {
        this.ngayTraPhong = ngayTraPhong;
    }
    public String getGhichu() {
        return ghichu;
    }
    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    
}
