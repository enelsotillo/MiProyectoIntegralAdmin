
package batallanaval;

import java.util.ArrayList;

public class Jugador {
    // atributos
    public String nombre;
    public String apellido;
    private int puntaje;
    public ArrayList<String> disparos= new ArrayList<>();
    // metodo constructor
    public Jugador(){
        
    }
        // metodos
        public void realizardisparo(String disparo){
            disparos.add(disparo);  
    }
        public void consultardisparos(){
            for (int i = 0; i<=disparos.size()-1; i++) {
                System.out.println(disparos.get(i));
            }
        }
        
        public void consultarpuntaje(){
            System.out.println("El jugador tiene: " + this.puntaje + " puntos") ;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
        
}
