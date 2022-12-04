package hotelmanagement.DTO;

import java.text.DecimalFormat;

public class LoaiPhongDTO {
    private int maLoaiPhong;
    private String tenLoaiPhong;
    private DecimalFormat donGia;

    public int getMaLoaiPhong() {
        return maLoaiPhong;
    }
    public void setMaLoaiPhong(int maLoaiPhong) {
        this.maLoaiPhong = maLoaiPhong;
    }
    public String getTenLoaiPhong() {
        return tenLoaiPhong;
    }
    public void setTenLoaiPhong(String tenLoaiPhong) {
        this.tenLoaiPhong = tenLoaiPhong;
    }
    public DecimalFormat getDonGia() {
        return donGia;
    }
    public void setDonGia(DecimalFormat donGia) {
        this.donGia = donGia;
    }
    
    
}
