package SegundoBimestre.Atividades.ativiadade14.ex9;

public class PontuacaoOuro implements EstrategiaPontuacao {
    public int    calcular(double valor) {
        return (int) (valor / 2);
    }
    public String getNome(){
        return "Ouro (1 ponto a cada R$ 2,00)";
    }
}