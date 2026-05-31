package SegundoBimestre.Atividades.ativiadade14.ex9;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Programa de Fidelidade ===\n");
        System.out.printf("%-12s | %-42s | %-20s | %-8s | %s%n",
                "Cliente", "Categoria", "Compra", "Pontos", "Total");
        System.out.println("-".repeat(105));

        ClienteFidelidade ana    = new ClienteFidelidade("Ana",    new PontuacaoComum());
        ClienteFidelidade bruno  = new ClienteFidelidade("Bruno",  new PontuacaoPrata());
        ClienteFidelidade carla  = new ClienteFidelidade("Carla",  new PontuacaoOuro());
        ClienteFidelidade daniel = new ClienteFidelidade("Daniel", new PontuacaoDiamante());

        // Compras abaixo de R$ 500
        ana.registrarCompra(100.00);
        bruno.registrarCompra(100.00);
        carla.registrarCompra(100.00);
        daniel.registrarCompra(100.00); // sem dobro

        System.out.println();

        // Compras acima de R$ 500 — Daniel dobra
        ana.registrarCompra(600.00);
        bruno.registrarCompra(600.00);
        carla.registrarCompra(600.00);
        daniel.registrarCompra(600.00); // dobro ativado

        System.out.println();

        // Ana é promovida para Prata
        System.out.println(">>> Ana promovida para Prata!\n");
        ana.setEstrategia(new PontuacaoPrata());
        ana.registrarCompra(200.00);
    }
}
