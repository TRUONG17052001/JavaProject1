
import java.util.Date;

public class SanPham {

    private int maSanPham;
    private String tenSanPham;
    private Date ngayGiaoDich;

    public SanPham() {
    }

    public SanPham(int maSanPham, String tenSanPham, Date ngayGiaoDich) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    @Override
    public String toString() {
        return tenSanPham + "-" + ngayGiaoDich ;
    }

}
