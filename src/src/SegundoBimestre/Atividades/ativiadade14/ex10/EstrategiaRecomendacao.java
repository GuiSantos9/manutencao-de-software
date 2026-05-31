package SegundoBimestre.Atividades.ativiadade14.ex10;

import java.util.List;

public interface EstrategiaRecomendacao {
    List<Produto> recomendar(Cliente cliente, List<Produto> catalogo, int limite);
    String getNome();
}
