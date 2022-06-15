
package dao;

import domain.Duan;
import java.util.List;
import org.hibernate.Session;

public class DaoDuAn {
   private final Session ses;

    public DaoDuAn(Session ses) {
        this.ses = ses;
    }
   public List<Duan> findAll(){
       return ses.createQuery("from Duan").list();
   } 
   public Duan findById(int ma){
       return (Duan) ses.get(Duan.class, ma);
   }
   public void saveOrUp(Duan da){
       ses.saveOrUpdate(da);
   }
   public void delete(Duan da){
       ses.delete(da);
   }
}
