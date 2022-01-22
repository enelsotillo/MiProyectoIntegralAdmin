
package Unidad5.polimorfismo;


public class AnimalTest {

    
    public static void main(String[] args) {
        
        Gato gato=new Gato();
        Pez globo=new Pez();
        //cada instancia recibe el mensaje comer y lo ejecuta segun el objeto
        gato.comer();
        globo.comer();
        
        //No se puede crear instancias de clases abstractas 
       // Animal animal=new Animal()
       
       Animal animal=new Pez();//utilizo el construtor de pez 
       
        animal=gato;//referencia de la superclase le asigno una de sus subclases
       
        animal.comer();
        imprimir(animal);
        imprimir(gato);
        imprimir(globo);
       
       
    }
    public static void imprimir(Animal animal) {
        System.out.println(); 
        System.out.println("Animal tipo:   " + animal.getClass().getSimpleName());
        System.out.println(animal);
    }
}
