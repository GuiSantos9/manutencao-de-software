package SegundoBimestre.Atividades.ativiadade14.ex2;

public class Estado {
    private String estado;
    private Double valor;

    public Estado(String estado, Double valor) {
        this.estado = estado;
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
