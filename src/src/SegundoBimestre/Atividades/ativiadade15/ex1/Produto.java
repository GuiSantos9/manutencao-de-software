package SegundoBimestre.Atividades.ativiadade15.ex1;

public class Produto {
    private String codigo;
    private String nome;
    private double precoFinal;
    private int quantidadeEstoque;
    private String nomeFornecedor;

    public Produto(String codigo, String nome, double precoFinal, int quantidadeEstoque, String nomeFornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoFinal = precoFinal;
        this.quantidadeEstoque = quantidadeEstoque;
        this.nomeFornecedor = nomeFornecedor;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public boolean isDisponivel() {
        return this.quantidadeEstoque > 0;
    }

}
