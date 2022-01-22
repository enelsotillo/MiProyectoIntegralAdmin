
package practico1;
public class MetodoToString {
    private double sueldo=3000;
    public int edad=25;
    public String nombre="Enel";
    public String apellido="Sotillo";
    
public double getSueldo(){
    return sueldo;
}
public void  setSueldo(double nuevosueldo){
    this.sueldo=nuevosueldo;
}
public String ToString(){
    String Mensaje="El Emplado se llama; "+nombre+" "+apellido+"con "+edad+"años "+"y un sueldo de "+sueldo;
    return Mensaje;
}
}
