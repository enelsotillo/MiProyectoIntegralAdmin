
package menusaludo;

import javax.swing.JOptionPane;

public class MenuSaludo {
    public static void main(String[] args) {
        String opcion="";
        String nombre;
       int menu=0;
        opcion=JOptionPane.showInputDialog(null,"Ingrese Opcion del Menu");
        menu=Integer.parseInt(opcion);
        
         switch(menu){
            case 1:
                nombre=JOptionPane.showInputDialog(null,"Ingrese Nombre");
                JOptionPane.showMessageDialog(null,"Hola "+ nombre,"saludo",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                //opcion=JOptionPane.showInputDialog(null,"Ingrese Opcion del Menu");
                JOptionPane.showMessageDialog(null,"Adios ","Despedida",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                //opcion=JOptionPane.showInputDialog(null,"Ingrese Opcion del Menu");
                JOptionPane.showMessageDialog(null,"Salir ","Termina",JOptionPane.INFORMATION_MESSAGE);
                break;            
                default:
               // opcion=JOptionPane.showInputDialog(null,"Salir del menu,  salir ingrese 3");
                JOptionPane.showMessageDialog(null,"hasta luego ");
                System.exit(0);
                break;
                        
        }
        
    }
    
}
