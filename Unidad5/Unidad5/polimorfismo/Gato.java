
package Unidad5.polimorfismo;


public class Gato extends Animal {

    private String nombre;

    public Gato() {
        this("Michi");
    }

    public Gato(String nombre) {
        super(4);
        this.nombre = nombre;
    }

    @Override
    public void comer() {
        System.out.println("Al gato le gusta comer wisky ");

    }

}