package dao;

import domain.Nhanvien;
import java.util.List;
import org.hibernate.Session;

public class DaoNhanVien {

    private final Session ses;

    public DaoNhanVien(Session ses) {
        this.ses = ses;
    }

    public List<Nhanvien> findAll() {
        return ses.createQuery("from Nhanvien").list();
    }

    public Nhanvien findById(int ma) {
        return (Nhanvien) ses.get(Nhanvien.class, ma);
    }

    public void saveOrUp(Nhanvien da) {
        ses.saveOrUpdate(da);
    }

    public void delete(Nhanvien da) {
        ses.delete(da);
    }
}
