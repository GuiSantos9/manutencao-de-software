package SegundoBimestre.Atividades.ativiadade14.ex7;

public class PagamentoValePresente implements FormaPagamento {
    private String  codigo;
    private double  saldo;

    public PagamentoValePresente(String codigo, double saldo) {
        this.codigo = codigo;
        this.saldo  = saldo;
    }

    @Override
    public boolean processar(double valor) {
        System.out.printf("  Vale-presente: %s | Saldo disponível: R$ %.2f%n", codigo, saldo);

        if (saldo < valor) {
            double restante = valor - saldo;
            System.out.printf("  Saldo insuficiente. Faltam R$ %.2f.%n", restante);
            System.out.println("  Pagamento recusado.");
            return false;
        }

        saldo -= valor;
        System.out.printf("  Valor debitado. Saldo restante: R$ %.2f%n", saldo);
        System.out.println("  Pagamento aprovado.");
        return true;
    }

    @Override
    public String getNome() { return "Vale-Presente"; }
}