
package Unidad5.polimorfismo;


public class Lobo extends Animal{

    public Lobo() {
        super(4);
    }

    @Override
    public void comer() {
        System.out.println("Los lobos son carnivoros ");
    }
    
    
}
