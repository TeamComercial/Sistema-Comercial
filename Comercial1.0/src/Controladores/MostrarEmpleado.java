package Controladores;

import BaseDatos.Conexion;
import Entidades.Clientes;
import Entidades.Empleado;
import Entidades.Marca;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MostrarEmpleado {
    private Connection con = new Conexion().ObtenerConeccion();
    
    
     public ArrayList<Empleado>MostrarEmpleados(){
         ArrayList<Empleado> Empleados = new ArrayList<>();
         try {
       
             CallableStatement cb = con.prepareCall("call SP_MEmpleado");
             ResultSet rs = cb.executeQuery();
           
             while (rs.next()) {
                Empleado e = new Empleado();
                 e.setID_empleado(rs.getInt("ID_empleado"));
                e.setEmpleado(rs.getString("empleado"));
                e.setTelefono(rs.getString("telefono"));
                e.setEdad(rs.getInt("Edad"));
                e.setDireccion(rs.getString("Direccion"));
                Empleados.add(e);
             }
               
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
         }
     
     return Empleados;
     }
     
     
     public void InsertarPersona(Empleado empleado) throws SQLException
    {
        try {
            CallableStatement statement = con.prepareCall("call SP_IEmpleado(?,?,?,?,?)");
        statement.setInt("ed",empleado.getEdad());
        statement.setString("tele", empleado.getTelefono());
           statement.setString("emple", empleado.getEmpleado());
           statement.setString("Estad", empleado.getEstado());
               statement.setString("direc", empleado.getDireccion());
        
        statement.execute();
        JOptionPane.showMessageDialog(null, "Registro Exitoso!!", "Mensaje de sistema", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!  " + e, "Mensaje de sistema", 1 );
        }
    }
     
     
     public void EliminarEmpleado(Empleado empleado){
        try {    
            CallableStatement statement = con.prepareCall("{call SP_Empleado(?)}");
            statement.setInt("id", empleado.getID_empleado());
        statement.execute();
        JOptionPane.showMessageDialog(null, "Elimino Exitoso!!", "Mensaje de sistema", 1);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!" + e, "Mensaje de sistema", 1 );
        }
    }
     
     
     public void ActualizarEmpleado(Empleado empleado){
        try {
            CallableStatement statement = con.prepareCall("call SP_AMarca(?,?,?)");        
        statement.setString("emple",empleado.getEmpleado());
        statement.setString("es",empleado.getEstado());
          statement.setInt("ed", empleado.getEdad());
           statement.setString("tele", empleado.getTelefono());
            statement.setString("direc", empleado.getDireccion());
             statement.setInt("id", empleado.getID_empleado ());
        
        statement.execute();
        JOptionPane.showMessageDialog(null, "Actualizo Exitoso!!", "Mensaje de sistema", 1);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!" + e, "Mensaje de sistema", 1 );
        }
    }
     
     
     
     
   public int countEmpleados(){
   int count =0;
       try {
       PreparedStatement pr =con.prepareStatement("select count(*) from empleado");
       ResultSet rs =  pr.executeQuery();
       if(rs.next()){
       count = rs.getInt(1);
       }
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Error!!  " + e, "Mensaje de sistema", 1 );
       }
   return count;
   }
}

