package SegundoBimestre.Atividades.ativiadade14.ex8.StrategiesFretes;

import SegundoBimestre.Atividades.ativiadade14.ex8.ConfiguracaoSistema;

public class FreteFixo implements EstrategiaFrete {
    private final double taxa;
    private final String nome;

    public FreteFixo(String nome, double taxa) {
        this.nome = nome;
        this.taxa = taxa;
    }

    public double calcular(double valorPedido) {
        double limiteGratuito = ConfiguracaoSistema.getInstance().getFreteGratuito();
        if (valorPedido >= limiteGratuito) return 0;
        return taxa;
    }

    public String getNome() { return nome; }
}