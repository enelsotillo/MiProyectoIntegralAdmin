
package metodotostring;
public class MetodosN {
     private double sueldo=3000;
    public int edad=25;
    public String nombre="Rachel";
    public String apellido="Sotillo";
    
public double getSueldo(){
    return sueldo;
}
public void  setSueldo(double nuevosueldo){
    this.sueldo=nuevosueldo;
}
public String ToString(){
    String mensaje="El Emplado se llama; "+nombre+" "+apellido+" con "+edad+" años "+" y un sueldo de "+sueldo+" pesos";
    return mensaje;
}
}
