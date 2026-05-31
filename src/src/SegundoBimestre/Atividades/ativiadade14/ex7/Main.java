package SegundoBimestre.Atividades.ativiadade14.ex7;

public class Main {
    public static void main(String[] args) {

        ProcessadorPagamento processador = new ProcessadorPagamento(
                new PagamentoCartaoCredito("**** **** **** 4321", 3));
        processador.executar(300.00);

        processador.setForma(new PagamentoPix("pagamentos@loja.com.br"));
        processador.executar(300.00);

        processador.setForma(new PagamentoBoleto());
        processador.executar(300.00);

        processador.setForma(new PagamentoValePresente("VALE-XYZ-2024", 500.00));
        processador.executar(300.00);

        // Vale com saldo insuficiente
        processador.setForma(new PagamentoValePresente("VALE-ABC-2024", 50.00));
        processador.executar(300.00);
    }
}
