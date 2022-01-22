
package reposoej3;

import java.util.Scanner;

public class ReposoEj3 {

    public static void main(String[] args) {
    int datos;
    boolean correcto;
    Scanner teclado = new Scanner(System.in);
    do
    {
    System.out.print("Ingrese un Valor entero desde 0 al 10: ");
    datos=teclado.nextInt();
    correcto=true;
    if(datos<0)
    correcto=false;
    if(datos>10)
    correcto=false;
    if(! correcto)
        System.out.println("Valor con error");
    
        }   
        while(! correcto);
    System.out.println("El programa termino");
    }
    
}
