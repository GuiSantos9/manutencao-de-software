package SegundoBimestre.Atividades.ativiadade14.ex7;

public class PagamentoBoleto implements FormaPagamento {
    @Override
    public boolean processar(double valor) {
        String codigo = gerarCodigo();
        System.out.printf("  Boleto gerado: %s%n", codigo);
        System.out.printf("  Valor: R$ %.2f | Vencimento: em 3 dias úteis%n", valor);
        System.out.println("  Aguardando confirmação do pagamento.");
        return true;
    }

    private String gerarCodigo() {
        return "34191.09008 12345.678901 23456.789012 1 00000" +
                String.format("%010.0f", Math.random() * 1_000_000_000);
    }

    @Override
    public String getNome() { return "Boleto Bancário"; }
}