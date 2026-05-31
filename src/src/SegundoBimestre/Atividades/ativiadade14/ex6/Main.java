package SegundoBimestre.Atividades.ativiadade14.ex6;

public class Main {
    public static void main(String[] args) {

        double preco = 200.00;

        Carrinho carrinho = new Carrinho(preco, new DescontoClienteComum());

        System.out.println("=== Limite de desconto: 30% ===");
        carrinho.exibirResumo();

        carrinho.setEstrategia(new DescontoClienteVip());
        carrinho.exibirResumo();

        carrinho.setEstrategia(new DescontoPromocional());
        carrinho.exibirResumo(); // 40% é barrado — aplica 30%

        // Altera o limite global via Singleton
        ConfiguracaoDesconto.getInstance().setDescontoMaximo(0.15);

        System.out.println("\n=== Limite reduzido para 15% ===");
        carrinho.setEstrategia(new DescontoClienteComum());
        carrinho.exibirResumo(); // 5% — abaixo do novo limite, sem alteração

        carrinho.setEstrategia(new DescontoClienteVip());
        carrinho.exibirResumo(); // 20% é barrado — aplica 15%

        carrinho.setEstrategia(new DescontoPromocional());
        carrinho.exibirResumo(); // 40% é barrado — aplica 15%
    }
}
