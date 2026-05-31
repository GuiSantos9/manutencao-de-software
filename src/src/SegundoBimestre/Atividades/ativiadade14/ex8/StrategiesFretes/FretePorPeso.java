package SegundoBimestre.Atividades.ativiadade14.ex8.StrategiesFretes;

import SegundoBimestre.Atividades.ativiadade14.ex8.ConfiguracaoSistema;

public class FretePorPeso implements EstrategiaFrete {
    private final double taxaPorKg;
    private final double pesoKg;

    public FretePorPeso(double pesoKg, double taxaPorKg) {
        this.pesoKg    = pesoKg;
        this.taxaPorKg = taxaPorKg;
    }

    public double calcular(double valorPedido) {
        double limiteGratuito = ConfiguracaoSistema.getInstance().getFreteGratuito();
        if (valorPedido >= limiteGratuito) return 0;
        return pesoKg * taxaPorKg;
    }

    public String getNome() { return "Frete por Peso (" + pesoKg + "kg)"; }
}
