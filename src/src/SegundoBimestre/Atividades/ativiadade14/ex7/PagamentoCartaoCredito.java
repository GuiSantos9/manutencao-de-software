package SegundoBimestre.Atividades.ativiadade14.ex7;

public class PagamentoCartaoCredito implements FormaPagamento {
    private String numero;
    private int    parcelas;

    public PagamentoCartaoCredito(String numero, int parcelas) {
        this.numero   = numero;
        this.parcelas = parcelas;
    }

    @Override
    public boolean processar(double valor) {
        double parcela = valor / parcelas;
        System.out.printf("  Cartão %s | %dx de R$ %.2f%n", numero, parcelas, parcela);
        System.out.println("  Autorizando junto à operadora...");
        System.out.println("  Pagamento autorizado.");
        return true;
    }

    @Override
    public String getNome() { return "Cartão de Crédito"; }
}
