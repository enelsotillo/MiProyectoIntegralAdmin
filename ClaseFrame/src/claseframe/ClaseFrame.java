
package claseframe;
import java.awt.Container;
import javax.swing.JDialog;
    


public class ClaseFrame {

    public static void main(String[] args) {
        JDialog pp = new JDialog();
        pp.setSize(400,200);
        pp.setTitle("Pantalla Principal");
        pp.setVisible(true);
        pp.setLocationRelativeTo(pp);
        
    }
    
}
