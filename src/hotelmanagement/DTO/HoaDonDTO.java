package hotelmanagement.DTO;

import java.text.DecimalFormat;
import java.util.Date;

public class HoaDonDTO {
    private int maHoaDon;
    private String tenNhanVien;
    private String tenKhachHang;
    private int maPhong;
    private int soNgayThue;
    private DecimalFormat donGia;
    private DecimalFormat thanhTien;
    private Date ngayThanhToan;
    private String phuongThucThanhToan;

    public int getMaHoaDon() {
        return maHoaDon;
    }
    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }
    public String getTenNhanVien() {
        return tenNhanVien;
    }
    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    public String getTenKhachHang() {
        return tenKhachHang;
    }
    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
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
    public DecimalFormat getDonGia() {
        return donGia;
    }
    public void setDonGia(DecimalFormat donGia) {
        this.donGia = donGia;
    }
    public DecimalFormat getThanhTien() {
        return thanhTien;
    }
    public void setThanhTien(DecimalFormat thanhTien) {
        this.thanhTien = thanhTien;
    }
    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }
    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }
    public String getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }
    public void setPhuongThucThanhToan(String phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    
    
}
