
package Unidad5;


public class Esfera extends Figura3D{
    private int radio;

    public Esfera() {
        
    }

    public Esfera(int radio, String nombre, int grosorBorde, int color) {
        super(nombre, grosorBorde, color);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    @Override
      public double calcularVolumen(){
          
         double total=(4 *Math.PI*radio*radio*radio)/3;
         return total;
             
}
 
    @Override
    public void dibujar() {
      
    }
}
