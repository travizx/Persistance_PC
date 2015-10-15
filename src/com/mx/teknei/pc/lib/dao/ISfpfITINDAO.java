
package com.mx.teknei.pc.lib.dao;

import com.mx.teknei.pc.lib.entities.SfpfItin;



/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 7/10/2015
 * @class ISfpfITINDAO
 */
public interface ISfpfITINDAO extends GenericDao<SfpfItin, Long> {
    public SfpfItin findLastItin();
    
}
