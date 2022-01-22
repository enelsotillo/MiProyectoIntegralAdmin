
package producto;

import static java.lang.Class.forName;
import java.sql.SQLException;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.awt.SystemColor.window;
import java.sql.Connection;

public class Producto {
    //Atributos de Conexion a la base de Datos
    Connection accsesoDB= null;
        String usuario="root";
        String clave="";
        String URL="jdbc:mysql://localhost:3306/enel";
                   
    //Metodo Conexion a la base de datos Driver y Direccion locación
    // de la base de datos    
    public Connection conexion(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            accsesoDB= DriverManager.getConnection(URL,usuario,clave);
            JOptionPane.showMessageDialog(null, "Base de Datos Conectada");
            
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,"Error de Conexion "+ e);
        }
        return accsesoDB;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        IngresoProducto pp=new IngresoProducto();
        pp.setVisible(true);
    }
    
}
