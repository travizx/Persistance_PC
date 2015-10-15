package com.mx.teknei.pc.lib.service.imp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mx.teknei.pc.lib.dao.IRecpNavDAO;
import com.mx.teknei.pc.lib.dao.imp.RecpNavDAO;
import com.mx.teknei.pc.lib.entities.SfmoReceNave;
import com.mx.teknei.pc.lib.service.IRecpNavService;
import java.util.List;
/**
 *
 * @author HAENCISO
 */
public class RecpNavService implements IRecpNavService{

    private IRecpNavDAO recpDAO;

    public RecpNavService() {
        recpDAO = new RecpNavDAO();
    }
    
    public void hablar(){
        System.out.println("Entre al Servicio y tambien obtuve el DAO");
    }
    
    @Override
    public void GuardarRecpNav(SfmoReceNave recp) {
        try{
            recpDAO.add(recp);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ActualizarRecpNav(SfmoReceNave recp) {
        recpDAO.update(recp);
    }

    @Override
    public void Eliminar(SfmoReceNave recp) {
        recpDAO.erase(recp);
    }

    @Override
    public List<SfmoReceNave> ListarRecpNav() {
        return recpDAO.listRecpNav();
    }

    @Override
    public SfmoReceNave UltimoReceNave() throws RuntimeException{
        return recpDAO.lastRecpNav();
    }

    @Override
    public SfmoReceNave buscarPorVehiculo(int idVehi) {
        return recpDAO.findByIdVehi(idVehi);
    }
    
}
