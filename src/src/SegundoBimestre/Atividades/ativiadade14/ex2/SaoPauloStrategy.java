package SegundoBimestre.Atividades.ativiadade14.ex2;

public class SaoPauloStrategy implements ImpostoStrategy{
    @Override
    public void calcularImposto(Double valor){
        System.out.println("O imposto de Sao Paulo é de "+valor * 0.18);
    }
}
