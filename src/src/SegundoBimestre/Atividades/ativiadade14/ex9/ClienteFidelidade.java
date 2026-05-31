package SegundoBimestre.Atividades.ativiadade14.ex9;

public class ClienteFidelidade {
    private String              nome;
    private int                 pontosAcumulados;
    private EstrategiaPontuacao estrategia;

    public ClienteFidelidade(String nome, EstrategiaPontuacao estrategia) {
        this.nome       = nome;
        this.estrategia = estrategia;
    }

    public void registrarCompra(double valor) {
        int pontos = estrategia.calcular(valor);
        pontosAcumulados += pontos;

        System.out.printf("%-12s | %-42s | Compra: R$ %7.2f | +%4d pts | Total: %5d pts%n",
                nome, estrategia.getNome(), valor, pontos, pontosAcumulados);
    }

    public void setEstrategia(EstrategiaPontuacao estrategia) {
        this.estrategia = estrategia;
    }

    public int    getPontos() { return pontosAcumulados; }
    public String getNome()   { return nome; }
}
