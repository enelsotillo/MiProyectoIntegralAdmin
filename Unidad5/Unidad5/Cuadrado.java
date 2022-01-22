
package Unidad5;



public class Cuadrado extends Figura2D{
    private int lado;
    
    public Cuadrado() {
       
    }

    public Cuadrado(int lado, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea(){
        double total=this.lado*this.lado;
        return total ;
        
    }
    @Override
    public double calcularPerimetro(){
        double totalPeri=4*this.lado;
        return totalPeri ;
    }
    
    @Override
    public void dibujar(){
    
        System.out.println("Nombre Figura : " + getNombre());
        System.out.println("Grosor de linea : "+ getGrosorBorde());
        System.out.println("Color : " + getColor());
        System.out.println("El area del circulo es : " + calcularArea());
        System.out.println("El perimetro del circulo es : " + calcularPerimetro());
        
    }
    public int cambiarTamanio(){
        return 0;
        
    }

    
}
