
package Controladores;

import BaseDatos.Conexion;
import Entidades.Marca;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MostrarMarca {
     private Connection con = new Conexion().ObtenerConeccion();
     
        public ArrayList<Marca>BuscarMarca(Marca Marcas){
         ArrayList<Marca> marca = new ArrayList<>();
         try {
             CallableStatement cb = con.prepareCall("call SP_BMarca(?)");
             cb.setString("marc",Marcas.getMarca() );
             ResultSet rs = cb.executeQuery();          
             while (rs.next()) {
                 Marca m = new Marca();
                 m.setId_marca(rs.getInt("Id_marca"));
                m.setMarca(rs.getString("marca"));
                m.setEstado(rs.getInt("Estado"));
                marca.add(m);
              
             }
               
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
         }
     
     return marca;
     }
         
        public void InsertarMarca(Marca marcas) throws SQLException{
        try {
            CallableStatement statement = con.prepareCall("call SP_IMarca(?,?)");
        statement.setString("marc",marcas.getMarca());
           statement.setInt("est", 1);
        
        statement.execute();
        JOptionPane.showMessageDialog(null, "Registro Exitoso!!", "Mensaje de sistema", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!  " + e, "Mensaje de sistema", 1 );
        }
    }
            
        public void EliminarMarca(Marca marca){
        try {    
            CallableStatement statement = con.prepareCall("{call SP_EMarca(?)}");
            statement.setInt("id", marca.getId_marca());
        statement.execute();
        JOptionPane.showMessageDialog(null, "Elimino Exitoso!!", "Mensaje de sistema", 1);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!" + e, "Mensaje de sistema", 1 );
        }
    }
          public void ActualizarMarca(Marca marca){
        try {
            CallableStatement statement = con.prepareCall("call SP_AMarca(?,?,?)");        
        statement.setString("mar",marca.getMarca());
        statement.setInt("es",1);
          statement.setInt("id", marca.getId_marca());
        
        statement.execute();
        JOptionPane.showMessageDialog(null, "Actualizo Exitoso!!", "Mensaje de sistema", 1);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!" + e, "Mensaje de sistema", 1 );
        }
    }
     
}
