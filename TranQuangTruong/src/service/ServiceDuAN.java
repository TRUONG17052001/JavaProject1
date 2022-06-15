package service;

import dao.DaoDuAn;
import domain.Duan;
import java.util.List;
import org.hibernate.Session;

public class ServiceDuAN {

    private final dao.DaoDuAn dda;
    private final Session ses;

    public ServiceDuAN(Session ses) {
        this.ses = ses;
        dda = new DaoDuAn(ses);
    }

    public List<Duan> findAll() {
        ses.beginTransaction();
        List<Duan> da = ses.createQuery("from Duan").list();
        ses.getTransaction().commit();
        return da;
    }

    public Duan findById(int ma) {
        ses.beginTransaction();
        Duan da= (Duan) ses.get(Duan.class, ma);
        ses.getTransaction().commit();
        return da;
    }

    public void saveOrUp(Duan da) {
        ses.beginTransaction();
        ses.saveOrUpdate(da);
        ses.getTransaction().commit();
    }

    public void delete(Duan da) {
        ses.beginTransaction();
        ses.delete(da);
        ses.getTransaction().commit();
    }

}
