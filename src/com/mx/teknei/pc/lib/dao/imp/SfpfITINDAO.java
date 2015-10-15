
package com.mx.teknei.pc.lib.dao.imp;

import static com.mx.teknei.pc.lib.connection.LoadConnection.getSessionFactory;
import com.mx.teknei.pc.lib.dao.ISfpfITINDAO;
import com.mx.teknei.pc.lib.entities.SfpfItin;
import org.hibernate.NonUniqueResultException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 7/10/2015
 * @class SfpfITINDAO
 */
public class SfpfITINDAO extends GenericDaoImp<SfpfItin, Long> implements ISfpfITINDAO{

    @Override
    public SfpfItin findLastItin() {
        SfpfItin itinEntity = null;
        Transaction trans = null;
        Session session = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query queryFindLastRec = session.createQuery("FROM SfpfItin r ORDER BY r.idItin DESC");
            queryFindLastRec.setMaxResults(1);
            queryFindLastRec.setFirstResult(0);
            itinEntity = (SfpfItin)queryFindLastRec.uniqueResult();
        } catch (NonUniqueResultException nonE) {
              System.out.println("No se encontro ningun ITINERARIO en BD");
//            Logg.getInstance().fatal( this.getClass().getSimpleName()+"_lastRecpNav_"+"Error No es el unico REGISTRO que regreso la BD_"+nonE.getMessage() );
        } catch (Exception e) {
//            Logg.getInstance().fatal( this.getClass().getSimpleName()+"_lastRecpNav_"+e.getMessage() );
        }finally {
            session.close();
        }
        return itinEntity;
    }

   

}
