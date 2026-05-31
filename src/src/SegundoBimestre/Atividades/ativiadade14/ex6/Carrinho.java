package SegundoBimestre.Atividades.ativiadade14.ex6;

public class Carrinho {

    private double preco;
    private EstrategiaDesconto estrategia;

    public Carrinho(double preco, EstrategiaDesconto estrategia) {
        this.preco      = preco;
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaDesconto estrategia) {
        this.estrategia = estrategia;
    }

    public void exibirResumo() {
        double desconto  = estrategia.calcular(preco);
        double total     = preco - desconto;
        double limite    = ConfiguracaoDesconto.getInstance().getDescontoMaximo();

        System.out.printf("%-30s | Preço: R$ %6.2f | Desconto: R$ %5.2f | Total: R$ %6.2f | Limite: %.0f%%%n",
                estrategia.getNome(), preco, desconto, total, limite * 100);
    }
}
