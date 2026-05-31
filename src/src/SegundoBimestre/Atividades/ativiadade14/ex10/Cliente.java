package SegundoBimestre.Atividades.ativiadade14.ex10;

import java.util.List;

public class Cliente {
    private String        nome;
    private String        categoriaFavorita;
    private List<Produto> historico;

    public Cliente(String nome, String categoriaFavorita, List<Produto> historico) {
        this.nome              = nome;
        this.categoriaFavorita = categoriaFavorita;
        this.historico         = historico;
    }

    public String        getNome()              { return nome; }
    public String        getCategoriaFavorita() { return categoriaFavorita; }
    public List<Produto> getHistorico()         { return historico; }
}