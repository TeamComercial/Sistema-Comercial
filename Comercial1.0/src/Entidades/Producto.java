
package Entidades;

public class Producto {
    int Id_Producto,Marca_Id,proveedor_id,Inventario;
    String Producto,Serie,descripcion;
    Double Costo,Margen;

    public int getId_Producto() {
        return Id_Producto;
    }

    public void setId_Producto(int Id_Producto) {
        this.Id_Producto = Id_Producto;
    }

    public int getMarca_Id() {
        return Marca_Id;
    }

    public void setMarca_Id(int Marca_Id) {
        this.Marca_Id = Marca_Id;
    }

    public int getProveedor_id() {
        return proveedor_id;
    }

    public void setProveedor_id(int proveedor_id) {
        this.proveedor_id = proveedor_id;
    }

    public int getInventario() {
        return Inventario;
    }

    public void setInventario(int Inventario) {
        this.Inventario = Inventario;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getCosto() {
        return Costo;
    }

    public void setCosto(Double Costo) {
        this.Costo = Costo;
    }

    public Double getMargen() {
        return Margen;
    }

    public void setMargen(Double Margen) {
        this.Margen = Margen;
    }
    
    
}
