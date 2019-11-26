/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import BaseDatos.Conexion;
import Entidades.Producto;
import Entidades.Productovista;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ittov
 */
public class MostrarProductos {
     private Connection con = new Conexion().ObtenerConeccion();
    
     public ArrayList<Productovista>BuscarProducto(Productovista produtos){
         ArrayList<Productovista> Productos = new ArrayList<>();
         try {
       
             CallableStatement cb = con.prepareCall("call SP_MProductos (?)");
              cb.setString("ser",produtos.getSerie());
             ResultSet rs = cb.executeQuery();
           
             while (rs.next()) {
                 Productovista p = new Productovista();
                 p.setId_Producto(rs.getInt("Id_Producto"));
                p.setProducto(rs.getString("Producto"));
                p.setSerie(rs.getString("Serie"));
                 p.setCosto(rs.getDouble("Costo"));
                  p.setMargen(rs.getDouble("Margen"));
                p.setPrecio(rs.getDouble("precio"));
                p.setMarca(rs.getString("marca"));
                  p.setDescripcion(rs.getString("descripcion"));
                p.setProveedor(rs.getString("proveedor"));
                p.setInventario(rs.getInt("inventario"));
                Productos.add(p);
              
             }
               
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
         }
     
     return Productos;
     }
      public void ActualizarUsuario(Producto Productos)
    {
        try {

            CallableStatement statement = con.prepareCall("call SP_E_Producto(?,?)");        
        statement.setInt("inv",Productos.getInventario());
          statement.setInt("id", Productos.getId_Producto());
        
        statement.execute();
//        JOptionPane.showMessageDialog(null, "Actualizo Exitoso!!", "Mensaje de sistema", 1);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!" + e, "Mensaje de sistema", 1 );
        }
    }
}
