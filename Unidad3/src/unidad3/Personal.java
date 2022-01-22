
package unidad3;

public class Personal {

private double sueldo=3000;
public int edad=45;
public String apellido="Jose";
public String nombre="Perez";

public Personal(){
    
}

public void MiPersonal(int miEdad, String miNombre, String miApellido){
    edad=miEdad;
    apellido=miApellido;
    nombre=miNombre;
}

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


}
