package SegundoBimestre.Atividades.ativiadade14.ex10;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produto> catalogo = List.of(
                new Produto("Notebook Gamer",        "Eletrônicos",  980),
                new Produto("Mouse Sem Fio",          "Eletrônicos",  750),
                new Produto("Teclado Mecânico",       "Eletrônicos",  630),
                new Produto("Monitor 4K",             "Eletrônicos",  420),
                new Produto("Tênis de Corrida",       "Esportes",     870),
                new Produto("Camiseta Dry-Fit",       "Esportes",     640),
                new Produto("Mochila Esportiva",      "Esportes",     310),
                new Produto("Livro: Clean Code",      "Livros",       560),
                new Produto("Livro: Design Patterns", "Livros",       390),
                new Produto("Fone Bluetooth",         "Eletrônicos",  820)
        );

        Cliente cliente = new Cliente(
                "Guilherme",
                "Eletrônicos",
                List.of(
                        new Produto("Mouse Sem Fio",    "Eletrônicos", 750),
                        new Produto("Tênis de Corrida", "Esportes",    870)
                )
        );

        MotorRecomendacao motor = new MotorRecomendacao(new RecomendacaoMaisVendidos());
        motor.exibirRecomendacoes(cliente, catalogo, 4);

        motor.setEstrategia(new RecomendacaoHistorico());
        motor.exibirRecomendacoes(cliente, catalogo, 4);

        motor.setEstrategia(new RecomendacaoCategoria());
        motor.exibirRecomendacoes(cliente, catalogo, 4);

        motor.setEstrategia(new RecomendacaoSimilares());
        motor.exibirRecomendacoes(cliente, catalogo, 3);
    }
}
