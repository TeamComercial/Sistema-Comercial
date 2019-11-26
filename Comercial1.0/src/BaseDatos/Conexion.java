        package BaseDatos;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    public static Connection con = null;
    
    public Connection ObtenerConeccion()
    {
        try {
            String url = "jdbc:mysql://localhost:3306/Comercial";
            String UsuarioBD = "Alvaro";
            String ContraseñaBD= "1234";
            
            con = DriverManager.getConnection(url, UsuarioBD, ContraseñaBD);
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error en la conecion!" + e);
        }
        
        return con;
    }
    
}
