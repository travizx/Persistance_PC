
package com.mx.teknei.pc.lib.service;

import com.mx.teknei.pc.lib.entities.SfpcCata;
import java.util.List;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 1/10/2015
 * @class ISfpcCataService
 */
public interface ISfpcCataService {
    public List<SfpcCata> BuscarCodCata(String cod_cata);
}
