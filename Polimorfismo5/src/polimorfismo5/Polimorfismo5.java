
package polimorfismo5;

public class Polimorfismo5 {

    public static void main(String[] args) {
        Vehiculo miVehiculo[] = new Vehiculo[3];
        miVehiculo[0] = new Vehiculo("123ACB","FORD","KA");
        miVehiculo[1]= new Moto(52,1,"121CBV","JAGUARD", "TODO TERRENO");
        miVehiculo[2]= new Bus(2500,48,"234TGR", "VOLVO", "UNICO");
        
        for(Vehiculo ciclos: miVehiculo){
        System.out.println(ciclos.MostrarDatos());
        System.out.println();
        
    }
    }
    
}
