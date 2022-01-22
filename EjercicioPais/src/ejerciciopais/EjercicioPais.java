
package ejerciciopais;

import capaclases.Pais;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EjercicioPais {
    public static void main(String[] args) throws SQLException {
        
        String url="jdbc:mysql://localhost/repasomysql";
        String usuario="root";
        String clave="";
        
        try {
              
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection)DriverManager.getConnection(url,usuario,clave);
            JOptionPane.showMessageDialog(null,"Conexion Exitosa");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EjercicioPais.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error de Conexion "+ex);
        }
        
        Pais pp=new Pais();
        
    }
}
