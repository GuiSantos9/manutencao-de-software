package SegundoBimestre.Strategy;

import SegundoBimestre.Strategy.Estrategia.PagamentoStrategy;

public class PedidoService {

    public void finalizar(Pedido pedido, PagamentoStrategy pagamentoStrategy){
        if(pagamentoStrategy == null){
            System.out.println("pagamento invalido!");
        }

        pagamentoStrategy.pagar(pedido.getValor());
    }

}
