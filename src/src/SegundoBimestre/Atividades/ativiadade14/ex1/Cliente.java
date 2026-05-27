package SegundoBimestre.Atividades.ativiadade14.ex1;

public class Cliente {
    private String tipoCliente;
    private Double valorCompra;

    public Cliente(String tipoCliente, Double valorCompra){
        this.tipoCliente = tipoCliente;
        this.valorCompra = valorCompra;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }
}
