package Controladores;

import BaseDatos.Conexion;
import Entidades.Creditos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MostrarCreditos {
      private Connection con = new Conexion().ObtenerConeccion();
 public void Insertarventa(Creditos credito) throws SQLException
    { ResultSet rs = null;
        try {
                 CallableStatement cb = con.prepareCall("call SP_ICredito(?,?,?,?,?,?)");
        cb.setDouble("Pri",credito.getPrima());
        cb.setDouble("sal", credito.getSaldo());
           cb.setDouble("le", credito.getLetras());
           cb.setDouble("Cu",credito.getCuotaApagar() );
               cb.setString("fec",credito.getFechaVencimiento());
               cb.setInt("vent", credito.getDetalleVentaId_fk());
        cb.executeUpdate();
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!  " + e, "Mensaje de sistema", 1 );
        }
    }    
}
