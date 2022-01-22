
package Unidad5;


public class Circulo extends Figura2D{
    private int radio;

    public Circulo() {
        
    }

    public Circulo(int radio, String nombre, int grosorBorde,int color) {
        super(nombre, grosorBorde, color);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
     public double calcularArea(){
        double total= Math.PI*radio*radio;
        return total  ;
        
    }
    public double calcularPerimetro(){
        double periTotal=2*Math.PI*radio;
        return periTotal;
    }
    public void dibujar(){
        System.out.println("Radio : " + getRadio());
        System.out.println("Nombre Figura : " + getNombre());
        System.out.println("Grosor de linea : "+ getGrosorBorde());
        System.out.println("Color : " + getColor());
        System.out.println("El area del circulo es : " + calcularArea());
        System.out.println("El perimetro del circulo es  : " + calcularPerimetro());
    }
    public int cambiarTamanio(){
        return 0;
    }
}
