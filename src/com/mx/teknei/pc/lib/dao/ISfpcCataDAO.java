
package com.mx.teknei.pc.lib.dao;

import com.mx.teknei.pc.lib.entities.SfpcCata;
import java.util.List;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 1/10/2015
 * @class ISfpc_Cata
 */
public interface ISfpcCataDAO extends GenericDao<SfpcCata, Long>{
    public List<SfpcCata> findCod_Cat(String ruta);
    
}
