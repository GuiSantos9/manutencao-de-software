package SegundoBimestre.Atividades.ativiadade14.ex6;

public class DescontoClienteComum implements EstrategiaDesconto {
    @Override
    public double calcular(double preco) {
        double desconto = 0.05; // 5%
        double limite   = ConfiguracaoDesconto.getInstance().getDescontoMaximo();
        return preco * Math.min(desconto, limite);
    }

    @Override
    public String getNome() { return "Cliente Comum (5%)"; }
}