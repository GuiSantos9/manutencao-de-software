package SegundoBimestre.Atividades.ativiadade14.ex8.StrategiesDesconto;

import SegundoBimestre.Atividades.ativiadade14.ex8.ConfiguracaoSistema;

public class DescontoPromocional implements EstrategiaDesconto {
    public double calcular(double preco) {
        double limite = ConfiguracaoSistema.getInstance().getDescontoMaximo();
        return preco * Math.min(0.40, limite);
    }
    public String getNome() { return "Promocional (40% → limitado pelo sistema)"; }
}
