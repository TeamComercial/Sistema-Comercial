package Controladores;

import java.sql.Connection;
import BaseDatos.Conexion;
import Entidades.Clientes;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MostrarCliente {
    private Connection con = new Conexion().ObtenerConeccion();
    
     public ArrayList<Clientes>BuscarClientes(Clientes cliente){
         ArrayList<Clientes> Clientes = new ArrayList<>();
         try {
       
             CallableStatement cb = con.prepareCall("call SP_BCliente(?)");
             cb.setString("Nomb",cliente.getNombre() );
             ResultSet rs = cb.executeQuery();
           
             while (rs.next()) {
                 Clientes c = new Clientes();
                 c.setId_Cliente(rs.getInt("Id_Cliente"));
                c.setNombre(rs.getString("Nombre"));
                c.setDui(rs.getString("Dui"));
                c.setEdad(rs.getInt("Edad"));
                c.setTelefono(rs.getString("Telefono"));
                c.setDireccion(rs.getString("Direccion"));
                Clientes.add(c);
              
             }
               
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
         }
     
     return Clientes;
     }
     public void InsertarPersona(Clientes cliente) throws SQLException
    {
        try {
            CallableStatement statement = con.prepareCall("call SP_ICliente(?,?,?,?,?)");
        statement.setString("Nomb",cliente.getNombre());
        statement.setString("Du", cliente.getDui());
           statement.setInt("eda", cliente.getEdad());
           statement.setString("tele", cliente.getTelefono());
               statement.setString("Dire", cliente.getDireccion());
        
        statement.execute();
        JOptionPane.showMessageDialog(null, "Registro Exitoso!!", "Mensaje de sistema", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!  " + e, "Mensaje de sistema", 1 );
        }
    }
     
}
