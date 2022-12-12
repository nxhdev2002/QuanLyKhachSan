package hotelmanagement.DTO;

import java.math.BigDecimal;

public class DatDichVuDTO {
    private int maDonHang;
    private int maDichVu;
    private int maHopDong;
    private BigDecimal DonGia;
    private int soLuong;
    private BigDecimal thanhTien;
    public int getMaDonHang() {
        return maDonHang;
    }
    public void setMaDonHang(int maDonHang) {
        this.maDonHang = maDonHang;
    }
    public int getMaDichVu() {
        return maDichVu;
    }
    public void setMaDichVu(int maDichVu) {
        this.maDichVu = maDichVu;
    }
    public int getMaHopDong() {
        return maHopDong;
    }
    public void setMaHopDong(int maHopDong) {
        this.maHopDong = maHopDong;
    }
    public BigDecimal getDonGia() {
        return DonGia;
    }
    public void setDonGia(BigDecimal donGia) {
        DonGia = donGia;
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
    public void setThanhTien(BigDecimal thanhTien) {
        this.thanhTien = thanhTien;
    }
    
}
