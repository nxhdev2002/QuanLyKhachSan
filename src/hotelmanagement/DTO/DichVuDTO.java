package hotelmanagement.DTO;

import java.math.BigDecimal;

public class DichVuDTO {
    private int maDichVu;
    private String tenDichVu;
    private BigDecimal DonGia;
    private String LoaiDichVu;
    private String thumbnail;
    private int TrangThai;
    public int getTrangThai() {
        return TrangThai;
    }
    public void setTrangThai(int trangThai) {
        TrangThai = trangThai;
    }
    public String getThumbnail() {
        return thumbnail;
    }
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    public BigDecimal getDonGia() {
        return DonGia;
    }
    public void setDonGia(BigDecimal donGia) {
        DonGia = donGia;
    }
    public String getLoaiDichVu() {
        return LoaiDichVu;
    }
    public void setLoaiDichVu(String loaiDichVu) {
        LoaiDichVu = loaiDichVu;
    }
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
    
}
