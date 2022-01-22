
package Unidad5;


public class Triangulo extends Figura2D{
    private int base;
    private int altura;

    public Triangulo() {
      
    }

    public Triangulo(int base, int altura, String nombre, int grosorBorde,int color) {
        super(nombre, grosorBorde, color);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    @Override
     public double calcularArea(){
         double total=base*altura;
        return total ;
        
    }
    @Override
    public double calcularPerimetro(){
        double periTri=3*base;
        return periTri;
    }
    @Override
    public void dibujar(){
        
    }
    public int cambiarTamanio(){
       return 0;
    }
}
