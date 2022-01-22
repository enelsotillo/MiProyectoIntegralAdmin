
package practico1;
public class Humano {
    int piernas;
    int brazo;
    int ojos;
    int nariz;
    int boca;
    String nombre;
    String sexo;
    String nombreCaballo;
    String preferenciaWhisky;

    //metodo constructor porque tiene el mismo 
    // nombre de la clase
public Humano(){
    piernas=2;
    brazo=2;
    ojos=2;
    nariz=1;
    boca=1;
}    

//metodo
public String comoTellamas(){
    return nombre;
}
}
