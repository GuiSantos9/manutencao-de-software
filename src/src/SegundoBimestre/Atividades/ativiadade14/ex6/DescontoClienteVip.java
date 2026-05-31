package SegundoBimestre.Atividades.ativiadade14.ex6;

public class DescontoClienteVip implements EstrategiaDesconto {
    @Override
    public double calcular(double preco) {
        double desconto = 0.20; // 20%
        double limite   = ConfiguracaoDesconto.getInstance().getDescontoMaximo();
        return preco * Math.min(desconto, limite);
    }

    @Override
    public String getNome() { return "Cliente VIP (20%)"; }
}
