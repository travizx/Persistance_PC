package com.mx.teknei.pc.lib.entities;
// Generated 1/10/2015 08:51:28 AM by Hibernate Tools 4.3.1



/**
 * CctmMncpId generated by hbm2java
 */
public class CctmMncpId  implements java.io.Serializable {


     private int idMncp;
     private int idCiud;
     private int idEstd;

    public CctmMncpId() {
    }

    public CctmMncpId(int idMncp, int idCiud, int idEstd) {
       this.idMncp = idMncp;
       this.idCiud = idCiud;
       this.idEstd = idEstd;
    }
   
    public int getIdMncp() {
        return this.idMncp;
    }
    
    public void setIdMncp(int idMncp) {
        this.idMncp = idMncp;
    }
    public int getIdCiud() {
        return this.idCiud;
    }
    
    public void setIdCiud(int idCiud) {
        this.idCiud = idCiud;
    }
    public int getIdEstd() {
        return this.idEstd;
    }
    
    public void setIdEstd(int idEstd) {
        this.idEstd = idEstd;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CctmMncpId) ) return false;
		 CctmMncpId castOther = ( CctmMncpId ) other; 
         
		 return (this.getIdMncp()==castOther.getIdMncp())
 && (this.getIdCiud()==castOther.getIdCiud())
 && (this.getIdEstd()==castOther.getIdEstd());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdMncp();
         result = 37 * result + this.getIdCiud();
         result = 37 * result + this.getIdEstd();
         return result;
   }   


}


