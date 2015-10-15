package com.mx.teknei.pc.lib.entities;
// Generated 1/10/2015 08:51:28 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SfruRuta generated by hbm2java
 */
public class SfruRuta  implements java.io.Serializable {


     private int idRuta;
     private SflnLin sflnLin;
     private String nomRuta;
     private String descRuta;
     private Integer tipoRuta;
     private Integer tipoDia;
     private Integer tipoServ;
     private Integer parMax;
     private Integer parMin;
     private double recoRuta;
     private Integer jornRuta;
     private Date durRuta;
     private String usrCrea;
     private Date fchCrea;
     private String usrModi;
     private Date fchModi;
     private int idEsta;
     private Integer idTipo;
     private Set sfruCruts = new HashSet(0);
     private Set sfpfItins = new HashSet(0);

    public SfruRuta() {
    }

	
    public SfruRuta(int idRuta, double recoRuta, String usrCrea, Date fchCrea, int idEsta) {
        this.idRuta = idRuta;
        this.recoRuta = recoRuta;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
        this.idEsta = idEsta;
    }
    public SfruRuta(int idRuta, SflnLin sflnLin, String nomRuta, String descRuta, Integer tipoRuta, Integer tipoDia, Integer tipoServ, Integer parMax, Integer parMin, double recoRuta, Integer jornRuta, Date durRuta, String usrCrea, Date fchCrea, String usrModi, Date fchModi, int idEsta, Integer idTipo, Set sfruCruts, Set sfpfItins) {
       this.idRuta = idRuta;
       this.sflnLin = sflnLin;
       this.nomRuta = nomRuta;
       this.descRuta = descRuta;
       this.tipoRuta = tipoRuta;
       this.tipoDia = tipoDia;
       this.tipoServ = tipoServ;
       this.parMax = parMax;
       this.parMin = parMin;
       this.recoRuta = recoRuta;
       this.jornRuta = jornRuta;
       this.durRuta = durRuta;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.usrModi = usrModi;
       this.fchModi = fchModi;
       this.idEsta = idEsta;
       this.idTipo = idTipo;
       this.sfruCruts = sfruCruts;
       this.sfpfItins = sfpfItins;
    }
   
    public int getIdRuta() {
        return this.idRuta;
    }
    
    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }
    public SflnLin getSflnLin() {
        return this.sflnLin;
    }
    
    public void setSflnLin(SflnLin sflnLin) {
        this.sflnLin = sflnLin;
    }
    public String getNomRuta() {
        return this.nomRuta;
    }
    
    public void setNomRuta(String nomRuta) {
        this.nomRuta = nomRuta;
    }
    public String getDescRuta() {
        return this.descRuta;
    }
    
    public void setDescRuta(String descRuta) {
        this.descRuta = descRuta;
    }
    public Integer getTipoRuta() {
        return this.tipoRuta;
    }
    
    public void setTipoRuta(Integer tipoRuta) {
        this.tipoRuta = tipoRuta;
    }
    public Integer getTipoDia() {
        return this.tipoDia;
    }
    
    public void setTipoDia(Integer tipoDia) {
        this.tipoDia = tipoDia;
    }
    public Integer getTipoServ() {
        return this.tipoServ;
    }
    
    public void setTipoServ(Integer tipoServ) {
        this.tipoServ = tipoServ;
    }
    public Integer getParMax() {
        return this.parMax;
    }
    
    public void setParMax(Integer parMax) {
        this.parMax = parMax;
    }
    public Integer getParMin() {
        return this.parMin;
    }
    
    public void setParMin(Integer parMin) {
        this.parMin = parMin;
    }
    public double getRecoRuta() {
        return this.recoRuta;
    }
    
    public void setRecoRuta(double recoRuta) {
        this.recoRuta = recoRuta;
    }
    public Integer getJornRuta() {
        return this.jornRuta;
    }
    
    public void setJornRuta(Integer jornRuta) {
        this.jornRuta = jornRuta;
    }
    public Date getDurRuta() {
        return this.durRuta;
    }
    
    public void setDurRuta(Date durRuta) {
        this.durRuta = durRuta;
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
    public String getUsrModi() {
        return this.usrModi;
    }
    
    public void setUsrModi(String usrModi) {
        this.usrModi = usrModi;
    }
    public Date getFchModi() {
        return this.fchModi;
    }
    
    public void setFchModi(Date fchModi) {
        this.fchModi = fchModi;
    }
    public int getIdEsta() {
        return this.idEsta;
    }
    
    public void setIdEsta(int idEsta) {
        this.idEsta = idEsta;
    }
    public Integer getIdTipo() {
        return this.idTipo;
    }
    
    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }
    public Set getSfruCruts() {
        return this.sfruCruts;
    }
    
    public void setSfruCruts(Set sfruCruts) {
        this.sfruCruts = sfruCruts;
    }
    public Set getSfpfItins() {
        return this.sfpfItins;
    }
    
    public void setSfpfItins(Set sfpfItins) {
        this.sfpfItins = sfpfItins;
    }




}

