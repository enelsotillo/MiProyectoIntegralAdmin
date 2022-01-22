
package batallanaval;
public class BatallaNaval {

    public static void main(String[] args) {
       
        Barcos Lancha = new Barcos(); 
        Lancha.recibirdisparo();
        Lancha.largo = 1;
        Lancha.setNombre("maria");
        System.out.println(Lancha.getNombre());
        
        Jugador Persona = new Jugador();
        Persona.setPuntaje(1500);
        Persona.consultarpuntaje();
        System.out.println("Disparos Realizados");
        Persona.realizardisparo("A2");
        Persona.realizardisparo("B4");   
        Persona.realizardisparo("F5");
        Persona.consultardisparos();
        
    }
    
}
