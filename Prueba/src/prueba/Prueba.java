
package prueba;
import static java.lang.Class.forName;
import java.sql.SQLException;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.awt.SystemColor.window;


public class Prueba {

    Connection con = null;
    public Connection conexion(){
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://C:/TablaDatos/Personal.accdb");
            JOptionPane.showMessageDialog(null, "Conectado BD");
            //C:\TablaDatos
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null,e);
        }
     return con;   
    }
    
    public static void main(String[] args) {
        Peliculas Window =new Peliculas();
        Window.setTitle("Pantalla de Peliculas");
        Window.setVisible(true);
        Window.setLocationRelativeTo(null);
    }
    
    
}
