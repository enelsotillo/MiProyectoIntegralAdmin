
package javaapplication42;
import java.util.Scanner;
public class JavaApplication42 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
String nom;
String opcion="";
double valor, acumulador=0, bono;
System.out.println("Ingrese el nombre del vendedor");   
nom=leer.nextLine();
System.out.println("Desea Iniciar \n s si y n no");
opcion=leer.nextLine();
while(opcion.equalsIgnoreCase("s")){

System.out.println("Ingrese el Valor del producto");
valor=leer.nextDouble();
bono=valor*0.005;
acumulador=acumulador+bono+150;
System.out.println("Desea seguir ingresando\n s si y n no");
opcion=leer.next();
}
System.out.println("Total General es: "+acumulador);
    }
    
}
