
import java.awt.Frame;
import java.awt.Label;
import javafx.scene.control.Button;


public class Muestra extends Frame {
Button si;
Button no;
public Muestra(){
    Label comentario=new Label("Presiones un Boton",Label.CENTER);
    si=new Button("Si");
    no=new Button("No");
    add("North",comentario);
    add("Aest", si);
    add("West", no);
    
}

    private void add(String Aest, Button si) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
