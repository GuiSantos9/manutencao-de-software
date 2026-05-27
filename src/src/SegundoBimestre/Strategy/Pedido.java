package SegundoBimestre.Strategy;

public class Pedido {

    private String cliente;
    private Double valor;

    public Pedido(String clente, Double valor){
        this.cliente = cliente;
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


}
