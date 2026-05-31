package SegundoBimestre.Atividades.ativiadade14.ex10;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RecomendacaoCategoria implements EstrategiaRecomendacao {

    @Override
    public List<Produto> recomendar(Cliente cliente, List<Produto> catalogo, int limite) {
        return catalogo.stream()
                .filter(p -> p.getCategoria().equals(cliente.getCategoriaFavorita()))
                .sorted(Comparator.comparingInt(Produto::getVendas).reversed())
                .limit(limite)
                .collect(Collectors.toList());
    }

    @Override
    public String getNome() { return "Categoria Favorita (" + "?)"; }

    public String getNome(Cliente cliente) {
        return "Categoria Favorita (" + cliente.getCategoriaFavorita() + ")";
    }
}