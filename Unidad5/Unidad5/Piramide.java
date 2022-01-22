
package Unidad5;


public class Piramide extends Figura3D{
   private int altura;
   private Triangulo triangulo;//Lo utilizo para sacar el volumen 

    public Piramide() {
      
    }

    public Piramide(int altura, Triangulo triangulo, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.altura = altura;
        this.triangulo = triangulo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Triangulo getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }
   
   
    @Override
    public double calcularVolumen() {
    double totalArea=triangulo.calcularArea();
     double totalVolumen= (1*totalArea*getAltura())/3;
    
    return totalVolumen;
    }
    @Override
    public void dibujar() {
      
   
}
}