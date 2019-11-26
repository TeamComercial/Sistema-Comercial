package Entidades;



public class Usuario {
    int id_usuario,empleado_id,Cliente_id,tipoUsuario_id;
    String usuario,correo,contraseña;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(int empleado_id) {
        this.empleado_id = empleado_id;
    }

    public int getCliente_id() {
        return Cliente_id;
    }

    public void setCliente_id(int Cliente_id) {
        this.Cliente_id = Cliente_id;
    }

    public int getTipoUsuario_id() {
        return tipoUsuario_id;
    }

    public void setTipoUsuario_id(int tipoUsuario_id) {
        this.tipoUsuario_id = tipoUsuario_id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    
   
    
    
}
