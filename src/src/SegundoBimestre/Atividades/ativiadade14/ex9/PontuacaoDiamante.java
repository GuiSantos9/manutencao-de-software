package SegundoBimestre.Atividades.ativiadade14.ex9;

public class PontuacaoDiamante implements EstrategiaPontuacao {
    private static final double LIMITE_DOBRO = 500.00;

    public int calcular(double valor) {
        int pontos = (int) (valor / 2); // base ouro
        if (valor > LIMITE_DOBRO) pontos *= 2;
        return pontos;
    }

    public String getNome() { return "Diamante (dobrado acima de R$ 500,00)"; }
}
