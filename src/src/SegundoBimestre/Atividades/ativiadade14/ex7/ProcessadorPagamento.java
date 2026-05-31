package SegundoBimestre.Atividades.ativiadade14.ex7;

public class ProcessadorPagamento {

    private FormaPagamento forma;

    public ProcessadorPagamento(FormaPagamento forma) {
        this.forma = forma;
    }

    public void setForma(FormaPagamento forma) {
        this.forma = forma;
    }

    public void executar(double valor) {
        System.out.printf( "  Forma:  %s%n", forma.getNome());
        System.out.printf( "  Valor:  R$ %.2f%n", valor);

        boolean sucesso = forma.processar(valor);

        System.out.println("  Status: " + (sucesso ? " APROVADO" : " RECUSADO"));

    }
}