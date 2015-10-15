package com.mx.teknei.pc.lib.entities;
// Generated 1/10/2015 08:51:28 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CctmColn generated by hbm2java
 */
public class CctmColn  implements java.io.Serializable {


     private CctmColnId id;
     private String nomColn;
     private String tipoAsen;
     private Integer idCiud;
     private int idEsta;
     private int idTipo;
     private String usrCrea;
     private Date fchCrea;
     private Set cctmDires = new HashSet(0);

    public CctmColn() {
    }

	
    public CctmColn(CctmColnId id, int idEsta, int idTipo, String usrCrea, Date fchCrea) {
        this.id = id;
        this.idEsta = idEsta;
        this.idTipo = idTipo;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
    }
    public CctmColn(CctmColnId id, String nomColn, String tipoAsen, Integer idCiud, int idEsta, int idTipo, String usrCrea, Date fchCrea, Set cctmDires) {
       this.id = id;
       this.nomColn = nomColn;
       this.tipoAsen = tipoAsen;
       this.idCiud = idCiud;
       this.idEsta = idEsta;
       this.idTipo = idTipo;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.cctmDires = cctmDires;
    }
   
    public CctmColnId getId() {
        return this.id;
    }
    
    public void setId(CctmColnId id) {
        this.id = id;
    }
    public String getNomColn() {
        return this.nomColn;
    }
    
    public void setNomColn(String nomColn) {
        this.nomColn = nomColn;
    }
    public String getTipoAsen() {
        return this.tipoAsen;
    }
    
    public void setTipoAsen(String tipoAsen) {
        this.tipoAsen = tipoAsen;
    }
    public Integer getIdCiud() {
        return this.idCiud;
    }
    
    public void setIdCiud(Integer idCiud) {
        this.idCiud = idCiud;
    }
    public int getIdEsta() {
        return this.idEsta;
    }
    
    public void setIdEsta(int idEsta) {
        this.idEsta = idEsta;
    }
    public int getIdTipo() {
        return this.idTipo;
    }
    
    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }
    public String getUsrCrea() {
        return this.usrCrea;
    }
    
    public void setUsrCrea(String usrCrea) {
        this.usrCrea = usrCrea;
    }
    public Date getFchCrea() {
        return this.fchCrea;
    }
    
    public void setFchCrea(Date fchCrea) {
        this.fchCrea = fchCrea;
    }
    public Set getCctmDires() {
        return this.cctmDires;
    }
    
    public void setCctmDires(Set cctmDires) {
        this.cctmDires = cctmDires;
    }




}


