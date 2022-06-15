/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.DaoDuAn;
import dao.DaoNhanVien;
import domain.Duan;
import domain.Nhanvien;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author TruongTran
 */
public class ServiceNhanVien {
    
    private final dao.DaoNhanVien dnv;
    private final Session ses;

    public ServiceNhanVien(Session ses) {
        this.ses = ses;
        dnv = new DaoNhanVien(ses);
    }

    public List<Nhanvien> findAll() {
        ses.beginTransaction();
        List<Nhanvien> nv = ses.createQuery("from Nhanvien").list();
        ses.getTransaction().commit();
        return nv;
    }

    public Nhanvien findById(String ma) {
        ses.beginTransaction();
        Nhanvien nv= (Nhanvien) ses.get(Nhanvien.class, ma);
        ses.getTransaction().commit();
        return nv;
    }

    public void saveOrUp(Nhanvien da) {
        ses.beginTransaction();
        ses.saveOrUpdate(da);
        ses.getTransaction().commit();
    }

    public void delete(Nhanvien da) {
        ses.beginTransaction();
        ses.delete(da);
        ses.getTransaction().commit();
    }
}
