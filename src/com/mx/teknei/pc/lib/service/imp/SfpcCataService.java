
package com.mx.teknei.pc.lib.service.imp;

import com.mx.teknei.pc.lib.dao.ISfpcCataDAO;
import com.mx.teknei.pc.lib.dao.imp.SfpcCataDAO;
import com.mx.teknei.pc.lib.entities.SfpcCata;
import com.mx.teknei.pc.lib.service.ISfpcCataService;
import java.util.List;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 1/10/2015
 * @class SfpcCataService
 */
public class SfpcCataService implements ISfpcCataService{

    private ISfpcCataDAO cataDao;

    public SfpcCataService() {
        this.cataDao = new SfpcCataDAO();
    }
    
    
    @Override
    public List<SfpcCata> BuscarCodCata(String cod_cata) {
        return cataDao.findCod_Cat(cod_cata);
    }

}
