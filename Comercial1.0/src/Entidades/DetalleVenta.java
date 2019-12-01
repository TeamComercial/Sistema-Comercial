
package Entidades;

public class DetalleVenta {
   int DetalleVentaId,ProductoId,cantidad,venta_id;
   double PrecioVenta,total;

    public int getDetalleVentaId() {
        return DetalleVentaId;
    }

    public void setDetalleVentaId(int DetalleVentaId) {
        this.DetalleVentaId = DetalleVentaId;
    }

    public int getProductoId() {
        return ProductoId;
    }

    public void setProductoId(int ProductoId) {
        this.ProductoId = ProductoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getVenta_id() {
        return venta_id;
    }

    public void setVenta_id(int venta_id) {
        this.venta_id = venta_id;
    }

    public double getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
   
   
}
