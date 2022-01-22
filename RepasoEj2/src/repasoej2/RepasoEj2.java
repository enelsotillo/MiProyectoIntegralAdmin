
package repasoej2;

import java.util.Scanner;

public class RepasoEj2 {

    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    int datos[]=new int[5];
        for (int i = 0; i < 5; i++) {
        System.out.print("Ingrese un numero:");
        datos[i]=teclado.nextInt();
            
        }
    System.out.println("-------------------------");
        for (int i = 4; i >= 0; i--) {
        System.out.print("El Valor es:");
        System.out.println(datos[i]);
        }
    
    
    
    }
    
}
