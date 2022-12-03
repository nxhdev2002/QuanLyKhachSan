package hotelmanagement.DTO;

import java.time.LocalDate;

public class NhanVienDTO {
    private int maNhanVien;
    private String tenNhanVien;
    private int gioiTinh;
    private String soDienThoai;
    private LocalDate ngaySinh;
    private String diaChi;

    public int getMaNhanVien() {
        return maNhanVien;
    }
    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    public String getTenNhanVien() {
        return tenNhanVien;
    }
    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    public int getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String getSoDienThoai() {
        return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
        
}
