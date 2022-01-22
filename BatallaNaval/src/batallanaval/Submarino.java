
package batallanaval;

public class Submarino extends Barcos{
  public int tripulacion; // cantidad de tripulantes
  
    public Submarino(int largo, String nombre, int estado){
        super(largo,nombre,estado);
    }

    public int getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(int tripulacion) {
        this.tripulacion = tripulacion;
    }
    
    
}
