
package manejoerror;
import java.io.IOException;
import javax.swing.JOptionPane;
public class ManejoError {
    public static void main(String[] args) {
        int i=0;
        String [] palabra={"Dios", "Te Bendiga", "Hija"};
        while(i<4){
            try {
                JOptionPane.showMessageDialog(null,"Arraglo: "+ palabra[i],"Recorre el Arreglo", JOptionPane.INFORMATION_MESSAGE);
                i++;
            }
            catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,"Array fuera de rango","Error",JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }
    }
}
