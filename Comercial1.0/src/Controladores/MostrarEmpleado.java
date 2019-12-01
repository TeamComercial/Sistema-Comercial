package Controladores;

import BaseDatos.Conexion;
import Entidades.Empleado;
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

