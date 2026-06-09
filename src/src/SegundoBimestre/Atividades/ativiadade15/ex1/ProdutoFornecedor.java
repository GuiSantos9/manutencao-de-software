package SegundoBimestre.Atividades.ativiadade15.ex1;

public class ProdutoFornecedor {
    private long idProduto;
    private String descricao;
    private double valorBase;
    private double valorFrete;
    private int qtdDisponivel;

    public ProdutoFornecedor(long idProduto, String descricao, double valorBase, double valorFrete, int qtdDisponivel) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.valorBase = valorBase;
        this.valorFrete = valorFrete;
        this.qtdDisponivel = qtdDisponivel;
    }

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public int getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void setQtdDisponivel(int qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }
}
