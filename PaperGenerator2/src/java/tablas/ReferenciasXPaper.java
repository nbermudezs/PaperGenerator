package tablas;
// Generated 27-oct-2012 14:04:15 by Hibernate Tools 3.2.1.GA



/**
 * ReferenciasXPaper generated by hbm2java
 */
public class ReferenciasXPaper  implements java.io.Serializable {


     private int idPaper;
     private Integer idReferencia;

    public ReferenciasXPaper() {
    }

	
    public ReferenciasXPaper(int idPaper) {
        this.idPaper = idPaper;
    }
    public ReferenciasXPaper(int idPaper, Integer idReferencia) {
       this.idPaper = idPaper;
       this.idReferencia = idReferencia;
    }
   
    public int getIdPaper() {
        return this.idPaper;
    }
    
    public void setIdPaper(int idPaper) {
        this.idPaper = idPaper;
    }
    public Integer getIdReferencia() {
        return this.idReferencia;
    }
    
    public void setIdReferencia(Integer idReferencia) {
        this.idReferencia = idReferencia;
    }




}


