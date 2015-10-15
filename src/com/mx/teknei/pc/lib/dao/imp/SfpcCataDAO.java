
package com.mx.teknei.pc.lib.dao.imp;

import com.mx.teknei.pc.lib.dao.ISfpcCataDAO;
import com.mx.teknei.pc.lib.entities.SfpcCata;
import static com.mx.teknei.pc.lib.connection.LoadConnection.getSessionFactory;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 1/10/2015
 * @class Sfpc_CataDAO
 */
public class SfpcCataDAO extends GenericDaoImp<SfpcCata, Long> implements ISfpcCataDAO{

    @Override
    public List<SfpcCata> findCod_Cat(String ruta) {
        List<SfpcCata> pc_cata = null;
        Session session = getSessionFactory().openSession();
        Transaction trans = null;
        try {
            trans = session.beginTransaction();
            Query queryFindCodCata = session.createQuery("from SfpcCata c where c.codCata = :rut");
            //Query queryFindCodCata = session.createSQLQuery("SELECT * FROM sitm.sfpc_cata c where c.cod_cata=?;").addEntity(SfpcCata.class);
            queryFindCodCata.setParameter("rut", ruta);
//          queryFindCodCata.setParameter(0, ruta);
            pc_cata = queryFindCodCata.list();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        return pc_cata;
    }
    
    
    
}
