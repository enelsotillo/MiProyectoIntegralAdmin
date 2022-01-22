
package jdbcejercicio1;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JdbcEjercicio1 {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost/repasomysql";
            //String driver;
            String usuario="root";
            String clave="";
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion=(Connection)DriverManager.getConnection(url,usuario,clave);
            JOptionPane.showMessageDialog(null,"Conexion exitosa");
            
            Statement instruccion=conexion.createStatement();
            String sql="select idpersonas,nombre,apellido,direccion,email,celular,idpais from personas";
            ResultSet resultado=instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.println("-----------------------------------");
                System.out.println("Id Persona: "+resultado.getInt(1));
                System.out.println("nombre : "+resultado.getString(2));
                System.out.println("apellido : "+resultado.getString(3));
                System.out.println("direccion : "+resultado.getString(4));
                System.out.println("email : "+resultado.getString(5));
                System.out.println("celular : "+resultado.getString(6));
                System.out.println("Id pais: "+resultado.getInt(7));
            }
            resultado.close();
            instruccion.close();
            conexion.close();
            
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
         JOptionPane.showMessageDialog(null,"Error de Conexion "+ e);
        }
        
        
    }
    
}
