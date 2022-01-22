
package Unidad5;



public class Cubo extends Figura3D{
    private Cuadrado cuadrado;//Se utiliza para calcular el volumen y llamar al metodo de cuadrado

    public Cubo() {
       
    }

    public Cubo(Cuadrado cuadrado, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.cuadrado = cuadrado;
    }

    public Cuadrado getCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(Cuadrado cuadrado) {
        this.cuadrado = cuadrado;
    }
    
    
     public double calcularVolumen(){
         double total=cuadrado.getLado()*cuadrado.getLado()*cuadrado.getLado();
         return total ;
             
}
    @Override
     public void dibujar(){
        cuadrado.dibujar();
        System.out.println("El volumen del cubo es : " + calcularVolumen());
        
        
     }
}
