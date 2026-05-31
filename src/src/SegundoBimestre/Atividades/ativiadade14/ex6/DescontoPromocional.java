package SegundoBimestre.Atividades.ativiadade14.ex6;

public class DescontoPromocional implements EstrategiaDesconto {
    @Override
    public double calcular(double preco) {
        double desconto = 0.40; // 40% — pode ultrapassar o limite
        double limite   = ConfiguracaoDesconto.getInstance().getDescontoMaximo();
        return preco * Math.min(desconto, limite);
    }

    @Override
    public String getNome() { return "Promocional (40% → limitado)"; }
}