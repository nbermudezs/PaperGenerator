package tablas;
// Generated 07-nov-2012 21:24:32 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Papers generated by hbm2java
 */
public class Papers  implements java.io.Serializable {


     private Integer idPaper;
     private Integer ordenRevista;
     private String titulo;
     private String resumen;
     private String resumenEng;
     private String introduccion;
     private Date fechaRecibido;
     private String metodologia;
     private String resultadosAnalisis;
     private String conclusiones;
     private String agradecimientos;

    public Papers() {
    }

    public Papers(Integer ordenRevista, String titulo, String resumen, String resumenEng, String introduccion, Date fechaRecibido, String metodologia, String resultadosAnalisis, String conclusiones, String agradecimientos) {
       this.ordenRevista = ordenRevista;
       this.titulo = titulo;
       this.resumen = resumen;
       this.resumenEng = resumenEng;
       this.introduccion = introduccion;
       this.fechaRecibido = fechaRecibido;
       this.metodologia = metodologia;
       this.resultadosAnalisis = resultadosAnalisis;
       this.conclusiones = conclusiones;
       this.agradecimientos = agradecimientos;
    }
   
    public Integer getIdPaper() {
        return this.idPaper;
    }
    
    public void setIdPaper(Integer idPaper) {
        this.idPaper = idPaper;
    }
    public Integer getOrdenRevista() {
        return this.ordenRevista;
    }
    
    public void setOrdenRevista(Integer ordenRevista) {
        this.ordenRevista = ordenRevista;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getResumen() {
        return this.resumen;
    }
    
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    public String getResumenEng() {
        return this.resumenEng;
    }
    
    public void setResumenEng(String resumenEng) {
        this.resumenEng = resumenEng;
    }
    public String getIntroduccion() {
        return this.introduccion;
    }
    
    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }
    public Date getFechaRecibido() {
        return this.fechaRecibido;
    }
    
    public void setFechaRecibido(Date fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }
    public String getMetodologia() {
        return this.metodologia;
    }
    
    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }
    public String getResultadosAnalisis() {
        return this.resultadosAnalisis;
    }
    
    public void setResultadosAnalisis(String resultadosAnalisis) {
        this.resultadosAnalisis = resultadosAnalisis;
    }
    public String getConclusiones() {
        return this.conclusiones;
    }
    
    public void setConclusiones(String conclusiones) {
        this.conclusiones = conclusiones;
    }
    public String getAgradecimientos() {
        return this.agradecimientos;
    }
    
    public void setAgradecimientos(String agradecimientos) {
        this.agradecimientos = agradecimientos;
    }




}


