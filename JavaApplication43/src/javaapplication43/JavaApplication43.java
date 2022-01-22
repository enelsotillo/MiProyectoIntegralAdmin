
package javaapplication43;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaApplication43 {

    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        String respuesta;
        double venta=0, total=0, iva=0;
         respuesta=JOptionPane.showInputDialog(null, "Iniciar compras: s (Si) o n (No)");
                //respuesta=leer.nextLine();
                while(respuesta.equalsIgnoreCase("s")){
                     String valor=JOptionPane.showInputDialog(null, "Ingrese Valor del Producto");
                      //respuesta=leer.next();
                      double suma = Double.parseDouble(valor);
                      venta=venta+suma;
                      iva=iva+(venta*.011);
                      respuesta=JOptionPane.showInputDialog(null, "Seguir con la compra: s (Si) o n (No)");
                      //respuesta=leer.next();
                }
                
                   JOptionPane.showMessageDialog(null, "Total compras es: "+venta);
                   System.out.println("verificacion Total Ventas: "+venta);
        
        
        
    }
    
}
