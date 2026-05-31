package SegundoBimestre.Atividades.ativiadade14.ex10;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RecomendacaoMaisVendidos implements EstrategiaRecomendacao {

    @Override
    public List<Produto> recomendar(Cliente cliente, List<Produto> catalogo, int limite) {
        return catalogo.stream()
                .sorted(Comparator.comparingInt(Produto::getVendas).reversed())
                .limit(limite)
                .collect(Collectors.toList());
    }

    @Override
    public String getNome() { return "Mais Vendidos"; }
}