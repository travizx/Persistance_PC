
package com.mx.teknei.pc.lib.service;

import com.mx.teknei.pc.lib.entities.SfpfItin;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 7/10/2015
 * @class ISfpfITINService
 */
public interface ISfpfITINService {
    public SfpfItin BuscarUltimoIti();
    public void AgregarITINACTIVO(SfpfItin itinEntity);
    public void EliminarITINActivo(SfpfItin itinEntity);
}
