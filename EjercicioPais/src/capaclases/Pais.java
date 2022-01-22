
package capaclases;
public class Pais {
    private int paisid;
    private String nombre;
    
    public Pais(int paisId, String nombre){
        this.paisid=paisId;
        this.nombre=nombre;
        
    }

    public Pais() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public int getPaisId() {

        return paisid;

    }

    public void setPaisId(int paisId) {

        this.paisid = paisId;

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }
    
    
    @Override
    public String toString(){
        return "Id pais = " + paisid + " , nombre= " + nombre;
    }
}
