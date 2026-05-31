package SegundoBimestre.Atividades.ativiadade14.ex10;

import java.util.List;

public class MotorRecomendacao {
    private EstrategiaRecomendacao estrategia;

    public MotorRecomendacao(EstrategiaRecomendacao estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaRecomendacao estrategia) {
        this.estrategia = estrategia;
    }

    public void exibirRecomendacoes(Cliente cliente, List<Produto> catalogo, int limite) {
        List<Produto> resultado = estrategia.recomendar(cliente, catalogo, limite);

        System.out.println("\n┌─ Recomendações para " + cliente.getNome()
                + " ── Algoritmo: " + estrategia.getNome());
        if (resultado.isEmpty()) {
            System.out.println("│  Nenhum produto encontrado.");
        } else {
            resultado.forEach(p -> System.out.println("│  → " + p));
        }
        System.out.println("└" + "─".repeat(55));
    }
}