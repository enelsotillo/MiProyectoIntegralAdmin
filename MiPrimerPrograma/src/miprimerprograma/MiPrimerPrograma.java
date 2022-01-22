
package miprimerprograma;
import static java.lang.Class.forName;
import java.sql.SQLException;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.awt.SystemColor.window;
public class MiPrimerPrograma {
    Connection con = null;
    public Connection conexion(){
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://C:/TablaDatos/Servicios.accdb");
            JOptionPane.showMessageDialog(null, "Conectado BD");
            //C:\TablaDatos
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null, e);
        }
     return con;   
    }
    public static void main(String[] args) {
       Cliente Unico=new Cliente();
       Ventas UniVenta=new Ventas();
       Productos UniProducto=new Productos();
       String minombre;
       String miDNI;
       String miproducto;
       double miventa;
       double miiva;
       double miimpuesto;
       double mineto;
       minombre=Unico.Nombre;
       miDNI=Unico.DNI;
       miproducto=UniProducto.nombre_producto;
       miventa=UniVenta.valor_venta;
       miiva=UniVenta.getIva();
       miimpuesto=UniVenta.getImpuesto();
       mineto=UniVenta.getSuma();
        System.out.println("Cliente: "+minombre);
        System.out.println("DNI: "+miDNI);
        System.out.println("Producto: "+miproducto);
        System.out.println("Precio Venta: "+miventa);
        System.out.println("Iva: "+miiva);
        System.out.println("Impuesto: "+miimpuesto);
        System.out.println("Total Venta: "+mineto);
    }
    
}
