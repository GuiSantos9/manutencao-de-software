package SegundoBimestre.Atividades.ativiadade14.ex7;

public class PagamentoPix implements FormaPagamento {
    private String chave;

    public PagamentoPix(String chave) {
        this.chave = chave;
    }

    @Override
    public boolean processar(double valor) {
        System.out.printf("  Chave Pix: %s%n", chave);
        System.out.printf("  Transferindo R$ %.2f via Pix...%n", valor);
        System.out.println("  Pagamento confirmado instantaneamente.");
        return true;
    }

    @Override
    public String getNome() { return "Pix"; }
}