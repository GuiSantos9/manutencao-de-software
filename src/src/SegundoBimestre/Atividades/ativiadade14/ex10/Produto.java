package SegundoBimestre.Atividades.ativiadade14.ex10;

public class Produto {
    private String nome;
    private String categoria;
    private int    vendas;

    public Produto(String nome, String categoria, int vendas) {
        this.nome      = nome;
        this.categoria = categoria;
        this.vendas    = vendas;
    }

    public String getNome()      { return nome; }
    public String getCategoria() { return categoria; }
    public int    getVendas()    { return vendas; }

    @Override
    public String toString() {
        return String.format("%-28s [%s | %d vendas]", nome, categoria, vendas);
    }
}
