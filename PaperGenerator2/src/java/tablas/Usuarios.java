package tablas;
// Generated 07-nov-2012 21:24:32 by Hibernate Tools 3.2.1.GA



/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private String correo;
     private String nombres;
     private String apellidos;
     private String password;

    public Usuarios() {
    }

    public Usuarios(String correo, String nombres, String apellidos, String password) {
       this.correo = correo;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.password = password;
    }
   
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


