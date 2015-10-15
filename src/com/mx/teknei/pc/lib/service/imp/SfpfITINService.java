
package com.mx.teknei.pc.lib.service.imp;

import com.mx.teknei.pc.lib.dao.ISfpfITINDAO;
import com.mx.teknei.pc.lib.dao.imp.SfpfITINDAO;
import com.mx.teknei.pc.lib.entities.SfpfItin;
import com.mx.teknei.pc.lib.service.ISfpfITINService;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 7/10/2015
 * @class SfpfITINService
 */
    public class SfpfITINService implements ISfpfITINService{
    
    ISfpfITINDAO itinDAO;

    public SfpfITINService() {
        this.itinDAO = new SfpfITINDAO();
    }
    
    @Override
    public SfpfItin BuscarUltimoIti() {
        return itinDAO.findLastItin();
    }

    @Override
    public void AgregarITINACTIVO(SfpfItin itinEntity) {
        itinDAO.add(itinEntity);
    }

    @Override
    public void EliminarITINActivo(SfpfItin itinEntity) {
        itinDAO.erase(itinEntity);
    }
    
    
    
}
