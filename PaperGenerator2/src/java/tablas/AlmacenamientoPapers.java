package tablas;
// Generated 27-oct-2012 14:04:15 by Hibernate Tools 3.2.1.GA



/**
 * AlmacenamientoPapers generated by hbm2java
 */
public class AlmacenamientoPapers  implements java.io.Serializable {


     private int idPaper;
     private byte[] paperPdf;

    public AlmacenamientoPapers() {
    }

    public AlmacenamientoPapers(int idPaper, byte[] paperPdf) {
       this.idPaper = idPaper;
       this.paperPdf = paperPdf;
    }
   
    public int getIdPaper() {
        return this.idPaper;
    }
    
    public void setIdPaper(int idPaper) {
        this.idPaper = idPaper;
    }
    public byte[] getPaperPdf() {
        return this.paperPdf;
    }
    
    public void setPaperPdf(byte[] paperPdf) {
        this.paperPdf = paperPdf;
    }




}


