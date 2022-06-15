
public class GiaoDich {

    private int maGiaoDich;
    private String tenKhachHang;
    private boolean daThanhToan;
    private SanPham sp;

    public GiaoDich() {
    }

    public GiaoDich(int maGiaoDich, String tenKhachHang, boolean daThanhToan, SanPham sp) {
        this.maGiaoDich = maGiaoDich;
        this.tenKhachHang = tenKhachHang;
        this.daThanhToan = daThanhToan;
        this.sp = sp;
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public boolean isDaThanhToan() {
        return daThanhToan;
    }

    public void setDaThanhToan(boolean daThanhToan) {
        this.daThanhToan = daThanhToan;
    }

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

}
