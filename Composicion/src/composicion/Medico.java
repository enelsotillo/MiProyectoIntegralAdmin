
package composicion;

public class Medico extends Persona {
public String Especialidad;
public String Matricula;
    
// constructor
public Medico(String nombre, String apellido, int edad, double sueldo, String calle, int piso, String Dpto, String localidad, String provincia){
super(nombre, apellido, edad, sueldo);
    Especialidad="Urologia";
    Matricula="100";

        }

}

