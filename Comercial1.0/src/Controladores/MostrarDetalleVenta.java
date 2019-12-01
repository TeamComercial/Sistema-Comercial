package Controladores;

import static BaseDatos.Conexion.con;
import Entidades.DetalleVenta;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MostrarDetalleVenta {
     public int Insertarventa(DetalleVenta DVenta) throws SQLException
    { ResultSet rs = null;
    int id = 0 ;
        try {
           String sql = "SELECT @@identity AS id";
            PreparedStatement statement = con.prepareStatement(sql);
                 CallableStatement cb = con.prepareCall("call SP_IDVenta(?,?,?,?,?)");
        cb.setInt("Pro",DVenta.getProductoId());
        cb.setInt("Can", DVenta.getCantidad());
           cb.setDouble("Prv", DVenta.getPrecioVenta());
           cb.setDouble("tot",DVenta.getTotal() );
               cb.setInt("idventa",DVenta.getVenta_id());        
        cb.executeUpdate();
        
       rs = statement.executeQuery();
       while(rs.next()){
          id = rs.getInt(1);
}
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!  " + e, "Mensaje de sistema", 1 );
        }
    return id;
    } 
}
