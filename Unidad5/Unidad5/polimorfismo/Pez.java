
package Unidad5.polimorfismo;


public class Pez extends Animal{
    private String nombre;

    public Pez() {
        
        super(0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void comer() {
        System.out.println("El pez come algas");
    }
    
}
