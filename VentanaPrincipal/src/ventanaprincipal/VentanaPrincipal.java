
package ventanaprincipal;
import java.awt.Container;
import javax.swing.JFrame;
public class VentanaPrincipal {
  
    public static void main(String[] args) {

        Ventana pp=new Ventana();
        pp.setVisible(true);
        pp.setTitle("Codo a Codo");
        pp.setSize(400,200);
        pp.SetLocationRelativeTo(null);
        
    }
    
}
