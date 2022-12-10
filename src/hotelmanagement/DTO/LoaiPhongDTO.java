package hotelmanagement.DTO;

import java.math.BigDecimal;

public class LoaiPhongDTO {
    private int maLoaiPhong;
    private String tenLoaiPhong;
    private BigDecimal donGia;

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
    public BigDecimal getDonGia() {
        return donGia;
    }
    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }
    
    
}
