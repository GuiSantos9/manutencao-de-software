package SegundoBimestre.Atividades.ativiadade14.ex10;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RecomendacaoSimilares implements EstrategiaRecomendacao {

    @Override
    public List<Produto> recomendar(Cliente cliente, List<Produto> catalogo, int limite) {
        if (cliente.getHistorico().isEmpty()) return List.of();

        Produto referencia = cliente.getHistorico().get(cliente.getHistorico().size() - 1);

        return catalogo.stream()
                .filter(p -> p.getCategoria().equals(referencia.getCategoria()))
                .filter(p -> !p.getNome().equals(referencia.getNome()))
                .sorted(Comparator.comparingInt(Produto::getVendas).reversed())
                .limit(limite)
                .collect(Collectors.toList());
    }

    @Override
    public String getNome() { return "Produtos Similares"; }
}