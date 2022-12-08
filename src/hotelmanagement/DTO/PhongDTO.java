package hotelmanagement.DTO;

public class PhongDTO {
    private int maPhong;
    private int soPhong;
    private String CCCD;
    private int soTang;
    private int trangThai;
    private int maLoaiPhong;
    
    public int getMaPhong() {
        return maPhong;
    }
    public String getCCCD() {
        return CCCD;
    }
    public void setCCCD(String cCCD) {
        CCCD = cCCD;
    }
    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }
    public int getSoPhong() {
        return soPhong;
    }
    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }
    public int getSoTang() {
        return soTang;
    }
    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }
    public int getTrangThai() {
        return trangThai;
    }
    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    public int getMaLoaiPhong() {
        return maLoaiPhong;
    }
    public void setMaLoaiPhong(int maLoaiPhong) {
        this.maLoaiPhong = maLoaiPhong;
    }

    
    
    
}
