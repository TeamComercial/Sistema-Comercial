
package Controladores;
import Entidades.Usuario;
import BaseDatos.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author ittov
 */
public class MostrarUsuario {
    private Connection con = new Conexion().ObtenerConeccion();
    public ArrayList <Usuario> MostrarPersonaLista(){
        ArrayList < Usuario> usuarios = new ArrayList<>();
        try {
            CallableStatement cb = con.prepareCall("call mostrar");
            ResultSet rs = cb.executeQuery();
            while (rs.next())
            {
                Usuario u = new Usuario();
                u.setId_usuario(rs.getInt("ID_Usuario"));
                u.setUsuario(rs.getString("Usuario"));
                u.setCorreo(rs.getString("Correo"));
                u.setContraseña(rs.getString("Contraseña"));
                usuarios.add(u);
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error en la consulta!!" + e);
        }
        return usuarios;
   }
    
    public int logear(Usuario usuarios) throws SQLException{
    int resultado = 0 ;
        try {
         CallableStatement statement = con.prepareCall("call Sp_Logear(?,?)");
         statement.setString("usu", usuarios.getUsuario());
         statement.setString("pass", usuarios.getContraseña());
         
        ResultSet rs =  statement.executeQuery();
         if(rs.next()){
         resultado = rs.getInt(1);
         usuarios.setTipoUsuario_id(rs.getInt(2));
         }    
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, "Error!!" + e, "Mensaje de sistema", 1 );
    }
     return resultado;
    }
      
}

