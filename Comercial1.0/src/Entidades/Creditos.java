
package Entidades;

public class Creditos {
    int idCredito,DetalleVentaId_fk;
    double Prima,Saldo,Letras,CuotaApagar;
    String FechaVencimiento;

    public int getIdCredito() {
        return idCredito;
    }

    public void setIdCredito(int idCredito) {
        this.idCredito = idCredito;
    }

    public int getDetalleVentaId_fk() {
        return DetalleVentaId_fk;
    }

    public void setDetalleVentaId_fk(int DetalleVentaId_fk) {
        this.DetalleVentaId_fk = DetalleVentaId_fk;
    }

    public double getPrima() {
        return Prima;
    }

    public void setPrima(double Prima) {
        this.Prima = Prima;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public double getLetras() {
        return Letras;
    }

    public void setLetras(double Letras) {
        this.Letras = Letras;
    }

    public double getCuotaApagar() {
        return CuotaApagar;
    }

    public void setCuotaApagar(double CuotaApagar) {
        this.CuotaApagar = CuotaApagar;
    }

    public String getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(String FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }
    
    
}
