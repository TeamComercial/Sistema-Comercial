package Controladores;
import BaseDatos.Conexion;
import Entidades.Venta;
import Entidades.VentaVista;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MostrarVenta{
    private Connection con = new Conexion().ObtenerConeccion();
    
    public ArrayList<VentaVista>MostrarVentas(VentaVista vista){
         ArrayList<VentaVista> Ventas = new ArrayList<>();
         try {
             CallableStatement cb = con.prepareCall("call SP_MVentas(?)");
             cb.setInt("id",vista.getClienteID() );
             ResultSet rs = cb.executeQuery();
           
             while (rs.next()) {
                VentaVista v = new VentaVista();
                 v.setId_Venta(rs.getInt("id_Venta"));
                v.setNombre(rs.getString("Nombre"));
                v.setTipo(rs.getString("Tipo"));
                v.setEstado(rs.getString("Estado"));
                v.setEmpleado(rs.getString("empleado"));
                v.setFecha(rs.getString("Fecha"));
                v.setClienteID(rs.getInt("ClienteID"));
                Ventas.add(v);
             }
               
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
         }
     
     return Ventas;
     }
    
    
    
    
    
    
    public int Insertarventa(Venta ventas) throws SQLException
    { ResultSet rs ;
    int id = 0 ;
        try {
           String sql = "SELECT @@identity AS id";
            PreparedStatement statement = con.prepareStatement(sql);
                 CallableStatement cb = con.prepareCall("call SP_IVenta(?,?,?,?,?)");
        cb.setString(1,ventas.getFecha());
        cb.setInt(2, ventas.getClienteId_fk());
           cb.setInt(3, ventas.getEmpleado_ID());
           cb.setInt(4, ventas.getTipo());
               cb.setInt(5,ventas.getEstado());        
        cb.executeUpdate();
        
       rs = statement.executeQuery();
       while(rs.next()){
          id = rs.getInt(1);
}
        JOptionPane.showMessageDialog(null, "Registro Exitoso!!", "Mensaje de sistema", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!  " + e, "Mensaje de sistema", 1 );
        }
    return id;
    } 
    
    
    
    }

