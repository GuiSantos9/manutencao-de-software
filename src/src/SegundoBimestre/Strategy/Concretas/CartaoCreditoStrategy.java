package SegundoBimestre.Strategy.Concretas;

import SegundoBimestre.Strategy.Estrategia.PagamentoStrategy;

public class CartaoCreditoStrategy implements PagamentoStrategy {
    @Override
    public void pagar(Double valor){
        System.out.println("Pagando "+valor+" via Cartão de Crédito" + "");
    }
}
