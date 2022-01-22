
package pruebaenumunidad3;

public class PruebaEnumUnidad3 {
enum Madera { ROBLE, CAOBA, NOGAL, CEREZO, BOJ }; 
    public static void main(String[] args) {
    Madera maderaUsuario;
    maderaUsuario = Madera.ROBLE; 
    
    System.out.println ("La madera elegida es: " + maderaUsuario );  
    System.out.println ("¿Eligió caoba? Resultado: " + (maderaUsuario==Madera.CAOBA) );  
    System.out.println ("¿Eligió roble? Resultado: " + (maderaUsuario==Madera.ROBLE) ); 
    } 
        
    }
    

