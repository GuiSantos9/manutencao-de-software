package SegundoBimestre.Atividades.ativiadade14.ex10;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RecomendacaoHistorico implements EstrategiaRecomendacao {

    @Override
    public List<Produto> recomendar(Cliente cliente, List<Produto> catalogo, int limite) {
        Set<String> categoriasCompradas = cliente.getHistorico().stream()
                .map(Produto::getCategoria)
                .collect(Collectors.toSet());

        Set<String> nomesComprados = cliente.getHistorico().stream()
                .map(Produto::getNome)
                .collect(Collectors.toSet());

        return catalogo.stream()
                .filter(p -> categoriasCompradas.contains(p.getCategoria()))
                .filter(p -> !nomesComprados.contains(p.getNome()))
                .limit(limite)
                .collect(Collectors.toList());
    }

    @Override
    public String getNome() { return "Baseado no Histórico"; }
}
