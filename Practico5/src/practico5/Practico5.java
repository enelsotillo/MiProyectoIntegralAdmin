package practico5;

import javax.swing.JOptionPane;

public class Practico5 {
    public static void main(String[] args) {
     try{
        int a=0;
        int resultado;
       
        resultado = 19/a;
     }
     catch(ArithmeticException e){
         System.out.println("Error desconocido: " + e);
         JOptionPane.showMessageDialog(null,"Error desconocido: " + e);
     }   
        
    }
    
}
