
package encapsulamiento;
public class Encapsulamiento {
    public static void main(String[] args) {
       Metodos MM = new Metodos();
        int miEdad;
        String miNombre;
        miEdad=45;
        miNombre="Enel";
        //asignarle un valor
        MM.setNombre(miNombre);
        MM.setEdad(miEdad);
        //obtenr valor
        System.out.println("Edad "+ MM.getEdad());
        System.out.println("Nombre "+MM.getNombre());
    }
    
}
