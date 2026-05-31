package SegundoBimestre.Atividades.ativiadade14.ex9;

public class PontuacaoPrata implements EstrategiaPontuacao {
    public int calcular(double valor) {
        return (int) (valor / 5);
    }
    public String getNome() {
        return "Prata (1 ponto a cada R$ 5,00)";
    }
}