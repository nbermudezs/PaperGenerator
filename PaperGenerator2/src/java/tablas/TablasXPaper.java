package tablas;
// Generated 10-10-2012 02:24:45 PM by Hibernate Tools 3.2.1.GA



/**
 * TablasXPaper generated by hbm2java
 */
public class TablasXPaper  implements java.io.Serializable {


     private int idPaper;
     private Integer idTabla;

    public TablasXPaper() {
    }

	
    public TablasXPaper(int idPaper) {
        this.idPaper = idPaper;
    }
    public TablasXPaper(int idPaper, Integer idTabla) {
       this.idPaper = idPaper;
       this.idTabla = idTabla;
    }
   
    public int getIdPaper() {
        return this.idPaper;
    }
    
    public void setIdPaper(int idPaper) {
        this.idPaper = idPaper;
    }
    public Integer getIdTabla() {
        return this.idTabla;
    }
    
    public void setIdTabla(Integer idTabla) {
        this.idTabla = idTabla;
    }




}


