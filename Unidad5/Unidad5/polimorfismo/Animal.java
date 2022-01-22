
package Unidad5.polimorfismo;


public abstract class Animal {
    protected int patas;
    
    public Animal(int patas) {
        this.patas = patas;
    }
   
    public abstract void comer();
    
}