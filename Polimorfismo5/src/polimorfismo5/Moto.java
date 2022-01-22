
package polimorfismo5;

public class  Moto extends Vehiculo {
    private int peso;
    private int cantidadPasajaro;
    
    public Moto(int mipeso, int micantidadPasajero, String miMatricula, String miMarca, String miModelo){
        super(miMatricula, miMarca, miModelo);
        this.cantidadPasajaro=micantidadPasajero;
        this.peso=mipeso;
        
    }

    public int getPeso() {
        return peso;
    }

    public int getCantidadPasajaro() {
        return cantidadPasajaro;
    }
 
    @Override
    public String MostrarDatos(){
      return "Martricula:"+Matricula+"\nMarca :"+Marca+"\nModelo: "+Modelo+"\ncantidad de Pasajero:"+cantidadPasajaro+
              "\nPeso :"+peso;
                 
    }
    
}
