
package Unidad5;



public class FiguraTest {

   

    
    public static void main(String[] args) {
       Circulo circulo1=new Circulo(5,"Circulo1",3, 56);
       circulo1.calcularPerimetro();
       circulo1.calcularArea();
       circulo1.dibujar();
        
        System.out.println("============================");
        
       Cuadrado cuadrado1=new Cuadrado(4,"Cuadrado1", 6,23);
       cuadrado1.dibujar();
        System.out.println("============================");
        
        Cubo cubo1=new Cubo(cuadrado1, "Cubo1", 5, 50);
        cubo1.dibujar();
        
        System.out.println("============================");
        Esfera esfera=new Esfera();
        esfera.setRadio(6);
        System.out.println("El volumen de la esfera es : " +esfera.calcularVolumen());
        
        System.out.println("=====================================");
        
        Triangulo triangulo=new Triangulo();
        triangulo.setAltura(15);
        triangulo.setBase(10);
        System.out.println("El area del triangulo es : " + triangulo.calcularArea());
        
        System.out.println("=========================================");
       Piramide piramide=new Piramide();
       piramide.setAltura(20);
       piramide.setTriangulo(triangulo);

       System.out.println("El volumen de la piramide es : " + piramide.calcularVolumen());
     
        
    }
    
}
