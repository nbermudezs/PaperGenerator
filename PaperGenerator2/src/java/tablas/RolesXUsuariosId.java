package tablas;
// Generated 07-nov-2012 21:24:32 by Hibernate Tools 3.2.1.GA



/**
 * RolesXUsuariosId generated by hbm2java
 */
public class RolesXUsuariosId  implements java.io.Serializable {


     private int idRol;
     private String correo;

    public RolesXUsuariosId() {
    }

    public RolesXUsuariosId(int idRol, String correo) {
       this.idRol = idRol;
       this.correo = correo;
    }
   
    public int getIdRol() {
        return this.idRol;
    }
    
    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RolesXUsuariosId) ) return false;
		 RolesXUsuariosId castOther = ( RolesXUsuariosId ) other; 
         
		 return (this.getIdRol()==castOther.getIdRol())
 && ( (this.getCorreo()==castOther.getCorreo()) || ( this.getCorreo()!=null && castOther.getCorreo()!=null && this.getCorreo().equals(castOther.getCorreo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdRol();
         result = 37 * result + ( getCorreo() == null ? 0 : this.getCorreo().hashCode() );
         return result;
   }   


}


