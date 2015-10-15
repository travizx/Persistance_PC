package com.mx.teknei.pc.lib.entities;
// Generated 1/10/2015 08:51:28 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SfesEst generated by hbm2java
 */
public class SfesEst  implements java.io.Serializable {


     private int idEst;
     private CctmDire cctmDire;
     private String nomEst;
     private String descEst;
     private int noDisp;
     private int cantVehi;
     private int tran;
     private int tipoEst;
     private String imgEst;
     private String usrCrea;
     private Date fchCrea;
     private String usrModi;
     private Date fchModi;
     private int idEsta;
     private int idTipo;
     private Integer idConSis;
     private Integer idPcAbor;
     private Set sfpfItinsForIdEstaOrig = new HashSet(0);
     private Set sfruCrutsForIdEstOrig = new HashSet(0);
     private Set sfpfItinsForIdEstaDest = new HashSet(0);
     private Set sfdtDitisForIdEsto = new HashSet(0);
     private Set sfdtDitisForIdEstd = new HashSet(0);
     private Set sfruCrutsForIdEstDest = new HashSet(0);

    public SfesEst() {
    }

	
    public SfesEst(int idEst, String nomEst, String descEst, int noDisp, int cantVehi, int tran, int tipoEst, String imgEst, String usrCrea, Date fchCrea, int idEsta, int idTipo) {
        this.idEst = idEst;
        this.nomEst = nomEst;
        this.descEst = descEst;
        this.noDisp = noDisp;
        this.cantVehi = cantVehi;
        this.tran = tran;
        this.tipoEst = tipoEst;
        this.imgEst = imgEst;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
        this.idEsta = idEsta;
        this.idTipo = idTipo;
    }
    public SfesEst(int idEst, CctmDire cctmDire, String nomEst, String descEst, int noDisp, int cantVehi, int tran, int tipoEst, String imgEst, String usrCrea, Date fchCrea, String usrModi, Date fchModi, int idEsta, int idTipo, Integer idConSis, Integer idPcAbor, Set sfpfItinsForIdEstaOrig, Set sfruCrutsForIdEstOrig, Set sfpfItinsForIdEstaDest, Set sfdtDitisForIdEsto, Set sfdtDitisForIdEstd, Set sfruCrutsForIdEstDest) {
       this.idEst = idEst;
       this.cctmDire = cctmDire;
       this.nomEst = nomEst;
       this.descEst = descEst;
       this.noDisp = noDisp;
       this.cantVehi = cantVehi;
       this.tran = tran;
       this.tipoEst = tipoEst;
       this.imgEst = imgEst;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.usrModi = usrModi;
       this.fchModi = fchModi;
       this.idEsta = idEsta;
       this.idTipo = idTipo;
       this.idConSis = idConSis;
       this.idPcAbor = idPcAbor;
       this.sfpfItinsForIdEstaOrig = sfpfItinsForIdEstaOrig;
       this.sfruCrutsForIdEstOrig = sfruCrutsForIdEstOrig;
       this.sfpfItinsForIdEstaDest = sfpfItinsForIdEstaDest;
       this.sfdtDitisForIdEsto = sfdtDitisForIdEsto;
       this.sfdtDitisForIdEstd = sfdtDitisForIdEstd;
       this.sfruCrutsForIdEstDest = sfruCrutsForIdEstDest;
    }
   
    public int getIdEst() {
        return this.idEst;
    }
    
    public void setIdEst(int idEst) {
        this.idEst = idEst;
    }
    public CctmDire getCctmDire() {
        return this.cctmDire;
    }
    
    public void setCctmDire(CctmDire cctmDire) {
        this.cctmDire = cctmDire;
    }
    public String getNomEst() {
        return this.nomEst;
    }
    
    public void setNomEst(String nomEst) {
        this.nomEst = nomEst;
    }
    public String getDescEst() {
        return this.descEst;
    }
    
    public void setDescEst(String descEst) {
        this.descEst = descEst;
    }
    public int getNoDisp() {
        return this.noDisp;
    }
    
    public void setNoDisp(int noDisp) {
        this.noDisp = noDisp;
    }
    public int getCantVehi() {
        return this.cantVehi;
    }
    
    public void setCantVehi(int cantVehi) {
        this.cantVehi = cantVehi;
    }
    public int getTran() {
        return this.tran;
    }
    
    public void setTran(int tran) {
        this.tran = tran;
    }
    public int getTipoEst() {
        return this.tipoEst;
    }
    
    public void setTipoEst(int tipoEst) {
        this.tipoEst = tipoEst;
    }
    public String getImgEst() {
        return this.imgEst;
    }
    
    public void setImgEst(String imgEst) {
        this.imgEst = imgEst;
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
    public int getIdTipo() {
        return this.idTipo;
    }
    
    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }
    public Integer getIdConSis() {
        return this.idConSis;
    }
    
    public void setIdConSis(Integer idConSis) {
        this.idConSis = idConSis;
    }
    public Integer getIdPcAbor() {
        return this.idPcAbor;
    }
    
    public void setIdPcAbor(Integer idPcAbor) {
        this.idPcAbor = idPcAbor;
    }
    public Set getSfpfItinsForIdEstaOrig() {
        return this.sfpfItinsForIdEstaOrig;
    }
    
    public void setSfpfItinsForIdEstaOrig(Set sfpfItinsForIdEstaOrig) {
        this.sfpfItinsForIdEstaOrig = sfpfItinsForIdEstaOrig;
    }
    public Set getSfruCrutsForIdEstOrig() {
        return this.sfruCrutsForIdEstOrig;
    }
    
    public void setSfruCrutsForIdEstOrig(Set sfruCrutsForIdEstOrig) {
        this.sfruCrutsForIdEstOrig = sfruCrutsForIdEstOrig;
    }
    public Set getSfpfItinsForIdEstaDest() {
        return this.sfpfItinsForIdEstaDest;
    }
    
    public void setSfpfItinsForIdEstaDest(Set sfpfItinsForIdEstaDest) {
        this.sfpfItinsForIdEstaDest = sfpfItinsForIdEstaDest;
    }
    public Set getSfdtDitisForIdEsto() {
        return this.sfdtDitisForIdEsto;
    }
    
    public void setSfdtDitisForIdEsto(Set sfdtDitisForIdEsto) {
        this.sfdtDitisForIdEsto = sfdtDitisForIdEsto;
    }
    public Set getSfdtDitisForIdEstd() {
        return this.sfdtDitisForIdEstd;
    }
    
    public void setSfdtDitisForIdEstd(Set sfdtDitisForIdEstd) {
        this.sfdtDitisForIdEstd = sfdtDitisForIdEstd;
    }
    public Set getSfruCrutsForIdEstDest() {
        return this.sfruCrutsForIdEstDest;
    }
    
    public void setSfruCrutsForIdEstDest(Set sfruCrutsForIdEstDest) {
        this.sfruCrutsForIdEstDest = sfruCrutsForIdEstDest;
    }




}


