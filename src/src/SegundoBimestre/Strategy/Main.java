package SegundoBimestre.Strategy;

import SegundoBimestre.Strategy.Concretas.BoletoStrategy;
import SegundoBimestre.Strategy.Concretas.CartaoCreditoStrategy;
import SegundoBimestre.Strategy.Concretas.PIXStrategy;
import SegundoBimestre.Strategy.Estrategia.PagamentoStrategy;

public class Main {
    public static void main(String[]args) {
        Pedido pedido = new Pedido("Guilherme", 23.34);

        String tipoPagamento = "PIX";

        PagamentoStrategy pagamentoStrategy = null;

        if(tipoPagamento.equals("PIX")){
            pagamentoStrategy = new PIXStrategy();
        } else if (tipoPagamento.equals("Boleto")){
            pagamentoStrategy = new BoletoStrategy();
        } else if (tipoPagamento.equals("Cartão de Credito")){
            pagamentoStrategy = new CartaoCreditoStrategy();
        }

    }
}
