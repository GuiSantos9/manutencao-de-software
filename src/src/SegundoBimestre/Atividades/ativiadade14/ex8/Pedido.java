package SegundoBimestre.Atividades.ativiadade14.ex8;

import SegundoBimestre.Atividades.ativiadade14.ex8.StrategiesDesconto.EstrategiaDesconto;
import SegundoBimestre.Atividades.ativiadade14.ex8.StrategiesDesconto.SemDesconto;
import SegundoBimestre.Atividades.ativiadade14.ex8.StrategiesFretes.EstrategiaFrete;
import SegundoBimestre.Atividades.ativiadade14.ex8.StrategiesFretes.FreteGratis;

public class Pedido {
    private static int contador = 1;

    private final int    id;
    private final String cliente;
    private final double valorBruto;
    private EstrategiaDesconto desconto;
    private EstrategiaFrete    frete;

    public Pedido(String cliente, double valorBruto) {
        this.id         = contador++;
        this.cliente    = cliente;
        this.valorBruto = valorBruto;
        this.desconto   = new SemDesconto();
        this.frete      = new FreteGratis();

        LoggerSistema.getInstance().log(
                String.format("Pedido #%d criado | Cliente: %s | Valor bruto: R$ %.2f", id, cliente, valorBruto));
    }

    public void setDesconto(EstrategiaDesconto desconto) {
        this.desconto = desconto;
        LoggerSistema.getInstance().log(
                String.format("Pedido #%d | Desconto definido: %s", id, desconto.getNome()));
    }

    public void setFrete(EstrategiaFrete frete) {
        this.frete = frete;
        LoggerSistema.getInstance().log(
                String.format("Pedido #%d | Frete definido: %s", id, frete.getNome()));
    }

    public void finalizar() {
        double valorDesconto = desconto.calcular(valorBruto);
        double valorFrete    = frete.calcular(valorBruto - valorDesconto);
        double valorFinal    = valorBruto - valorDesconto + valorFrete;

        LoggerSistema.getInstance().log(
                String.format("Pedido #%d finalizado | Desconto: R$ %.2f | Frete: R$ %.2f | Total: R$ %.2f",
                        id, valorDesconto, valorFrete, valorFinal));

        System.out.println("\n┌─ Resumo do Pedido #" + id + " ─────────────────────────");
        System.out.printf( "│  Cliente  : %s%n",        cliente);
        System.out.printf( "│  Valor    : R$ %.2f%n",   valorBruto);
        System.out.printf( "│  Desconto : R$ %.2f  (%s)%n", valorDesconto, desconto.getNome());
        System.out.printf( "│  Frete    : R$ %.2f  (%s)%n", valorFrete, frete.getNome());
        System.out.println("│  ─────────────────────────────────────────");
        System.out.printf( "│  TOTAL    : R$ %.2f%n",   valorFinal);
        System.out.println("└───────────────────────────────────────────");
    }
}