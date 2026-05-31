package SegundoBimestre.Atividades.ativiadade14.ex9;

public class PontuacaoComum implements EstrategiaPontuacao {
    public int    calcular(double valor) {
        return (int) (valor / 10);
    }
    public String getNome(){
        return "Comum (1 ponto a cada R$ 10,00)";
    }
}