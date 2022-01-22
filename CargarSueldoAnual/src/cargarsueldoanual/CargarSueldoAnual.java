
package cargarsueldoanual;

import javax.swing.JOptionPane;

public class CargarSueldoAnual {

    public static void main(String[] args) {
        int mes[]=new int[12];
        int contador=0, var1=0,i,j;
        int ingreso=0;
        String sueldo;
        for (i = 0; i <mes.length; i++) {
            sueldo=JOptionPane.showInputDialog(null, "Ingrese sueldo mes: ");
            contador++;
            ingreso=Integer.parseInt(sueldo);
            mes[i]=(ingreso);
            
            if ((mes[i]=ingreso)<=0){
                JOptionPane.showMessageDialog(null, "Vuelve Ingresar Sueldo Mes");
                sueldo=JOptionPane.showInputDialog(null, "Ingrese sueldo pendiente: ");
                 ingreso=Integer.parseInt(sueldo);
                 mes[i]=(ingreso);
            }
            var1=var1+ingreso;
            System.out.println("mes:J "+contador+" sueldo: "+mes[i]);
        }
        
        JOptionPane.showMessageDialog(null, "Total sueldo anual: "+var1);
            
        
    }
    
}
