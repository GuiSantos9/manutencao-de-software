package SegundoBimestre.Atividades.ativiadade14.ex8.StrategiesDesconto;

import SegundoBimestre.Atividades.ativiadade14.ex8.ConfiguracaoSistema;

public class DescontoCliente implements EstrategiaDesconto {
    private final double taxa;
    private final String nome;

    public DescontoCliente(String nome, double taxa) {
        this.nome = nome;
        this.taxa = taxa;
    }

    public double calcular(double preco) {
        double limite = ConfiguracaoSistema.getInstance().getDescontoMaximo();
        return preco * Math.min(taxa, limite);
    }

    public String getNome() { return nome; }
}
