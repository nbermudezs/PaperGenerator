package tablas;
// Generated 27-oct-2012 14:04:15 by Hibernate Tools 3.2.1.GA



/**
 * FormatoResumen generated by hbm2java
 */
public class FormatoResumen  implements java.io.Serializable {


     private int idResumen;
     private String muestra;
     private int minimoPalabras;
     private int maximoPalabras;

    public FormatoResumen() {
    }

    public FormatoResumen(int idResumen, String muestra, int minimoPalabras, int maximoPalabras) {
       this.idResumen = idResumen;
       this.muestra = muestra;
       this.minimoPalabras = minimoPalabras;
       this.maximoPalabras = maximoPalabras;
    }
   
    public int getIdResumen() {
        return this.idResumen;
    }
    
    public void setIdResumen(int idResumen) {
        this.idResumen = idResumen;
    }
    public String getMuestra() {
        return this.muestra;
    }
    
    public void setMuestra(String muestra) {
        this.muestra = muestra;
    }
    public int getMinimoPalabras() {
        return this.minimoPalabras;
    }
    
    public void setMinimoPalabras(int minimoPalabras) {
        this.minimoPalabras = minimoPalabras;
    }
    public int getMaximoPalabras() {
        return this.maximoPalabras;
    }
    
    public void setMaximoPalabras(int maximoPalabras) {
        this.maximoPalabras = maximoPalabras;
    }




}


