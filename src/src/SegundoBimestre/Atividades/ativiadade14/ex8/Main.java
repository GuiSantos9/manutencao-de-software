package SegundoBimestre.Atividades.ativiadade14.ex8;

import SegundoBimestre.Atividades.ativiadade14.ex8.StrategiesDesconto.DescontoCliente;
import SegundoBimestre.Atividades.ativiadade14.ex8.StrategiesDesconto.DescontoPromocional;
import SegundoBimestre.Atividades.ativiadade14.ex8.StrategiesFretes.FreteFixo;
import SegundoBimestre.Atividades.ativiadade14.ex8.StrategiesFretes.FretePorPeso;

public class Main {
    public static void main(String[] args) {

        System.out.println(">>> " + ConfiguracaoSistema.getInstance().getNomeAplicacao() + " iniciado\n");

        // Pedido 1 — cliente comum, frete padrão
        Pedido p1 = new Pedido("Ana Silva", 150.00);
        p1.setDesconto(new DescontoCliente("Cliente Comum (5%)", 0.05));
        p1.setFrete(new FreteFixo("PAC", 25.00));
        p1.finalizar();

        // Pedido 2 — cliente VIP, frete por peso
        Pedido p2 = new Pedido("Carlos VIP", 480.00);
        p2.setDesconto(new DescontoCliente("Cliente VIP (20%)", 0.20));
        p2.setFrete(new FretePorPeso(8.0, 4.50));
        p2.finalizar();

        // Pedido 3 — promoção, pedido acima do limite → frete grátis automático
        Pedido p3 = new Pedido("Beatriz Promo", 350.00);
        p3.setDesconto(new DescontoPromocional());
        p3.setFrete(new FreteFixo("SEDEX", 35.00));
        p3.finalizar();

        // Altera configuração global e cria novo pedido
        ConfiguracaoSistema.getInstance().setDescontoMaximo(0.10);
        LoggerSistema.getInstance().log("Configuração atualizada: desconto máximo agora é 10%");

        Pedido p4 = new Pedido("Diego Teste", 200.00);
        p4.setDesconto(new DescontoPromocional()); // 40% barrado → aplica 10%
        p4.setFrete(new FreteFixo("PAC", 25.00));
        p4.finalizar();

        LoggerSistema.getInstance().exibirHistorico();
    }
}
