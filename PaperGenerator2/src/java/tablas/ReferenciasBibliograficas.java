package tablas;
// Generated 07-nov-2012 21:24:32 by Hibernate Tools 3.2.1.GA



/**
 * ReferenciasBibliograficas generated by hbm2java
 */
public class ReferenciasBibliograficas  implements java.io.Serializable {


     private int idReferencia;
     private String camposPendientes;

    public ReferenciasBibliograficas() {
    }

	
    public ReferenciasBibliograficas(int idReferencia) {
        this.idReferencia = idReferencia;
    }
    public ReferenciasBibliograficas(int idReferencia, String camposPendientes) {
       this.idReferencia = idReferencia;
       this.camposPendientes = camposPendientes;
    }
   
    public int getIdReferencia() {
        return this.idReferencia;
    }
    
    public void setIdReferencia(int idReferencia) {
        this.idReferencia = idReferencia;
    }
    public String getCamposPendientes() {
        return this.camposPendientes;
    }
    
    public void setCamposPendientes(String camposPendientes) {
        this.camposPendientes = camposPendientes;
    }




}


