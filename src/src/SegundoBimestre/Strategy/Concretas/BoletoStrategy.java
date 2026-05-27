package SegundoBimestre.Strategy.Concretas;

import SegundoBimestre.Strategy.Estrategia.PagamentoStrategy;

public class BoletoStrategy implements PagamentoStrategy {

    @Override
    public void pagar(Double valor){
        System.out.println("Pagando "+valor+" via Boleto");
    }
}
