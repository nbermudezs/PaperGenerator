package tablas;
// Generated 10-10-2012 02:24:45 PM by Hibernate Tools 3.2.1.GA



/**
 * FormatoPalabrasClave generated by hbm2java
 */
public class FormatoPalabrasClave  implements java.io.Serializable {


     private int idPalabrasClave;
     private String muestra;
     private int cantidadMinima;
     private int cantidadMaximo;
     private boolean indentacion;

    public FormatoPalabrasClave() {
    }

    public FormatoPalabrasClave(int idPalabrasClave, String muestra, int cantidadMinima, int cantidadMaximo, boolean indentacion) {
       this.idPalabrasClave = idPalabrasClave;
       this.muestra = muestra;
       this.cantidadMinima = cantidadMinima;
       this.cantidadMaximo = cantidadMaximo;
       this.indentacion = indentacion;
    }
   
    public int getIdPalabrasClave() {
        return this.idPalabrasClave;
    }
    
    public void setIdPalabrasClave(int idPalabrasClave) {
        this.idPalabrasClave = idPalabrasClave;
    }
    public String getMuestra() {
        return this.muestra;
    }
    
    public void setMuestra(String muestra) {
        this.muestra = muestra;
    }
    public int getCantidadMinima() {
        return this.cantidadMinima;
    }
    
    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }
    public int getCantidadMaximo() {
        return this.cantidadMaximo;
    }
    
    public void setCantidadMaximo(int cantidadMaximo) {
        this.cantidadMaximo = cantidadMaximo;
    }
    public boolean isIndentacion() {
        return this.indentacion;
    }
    
    public void setIndentacion(boolean indentacion) {
        this.indentacion = indentacion;
    }




}


