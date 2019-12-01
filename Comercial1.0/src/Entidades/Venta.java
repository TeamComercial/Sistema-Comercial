package Entidades;
public class Venta {
  int id_Venta,ClienteId_fk,Empleado_ID,tipo,estado;

    public int getId_Venta() {
        return id_Venta;
    }

    public void setId_Venta(int id_Venta) {
        this.id_Venta = id_Venta;
    }

    public int getClienteId_fk() {
        return ClienteId_fk;
    }

    public void setClienteId_fk(int ClienteId_fk) {
        this.ClienteId_fk = ClienteId_fk;
    }

    public int getEmpleado_ID() {
        return Empleado_ID;
    }

    public void setEmpleado_ID(int Empleado_ID) {
        this.Empleado_ID = Empleado_ID;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
          String Fecha;
}
