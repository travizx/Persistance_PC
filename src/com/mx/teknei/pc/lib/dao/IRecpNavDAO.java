/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pc.lib.dao;

import java.util.List;
import com.mx.teknei.pc.lib.entities.SfmoReceNave;

/**
 *
 * @author HAENCISO
 */
public interface IRecpNavDAO extends GenericDao<SfmoReceNave,Long>{
    public List<SfmoReceNave> listRecpNav();
    public SfmoReceNave findByIdVehi(int idVehi);
    public SfmoReceNave lastRecpNav();
    
}
