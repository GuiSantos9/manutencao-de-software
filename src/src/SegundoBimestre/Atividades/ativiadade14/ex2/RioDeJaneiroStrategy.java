package SegundoBimestre.Atividades.ativiadade14.ex2;

public class RioDeJaneiroStrategy implements ImpostoStrategy{
    @Override
    public void calcularImposto(Double valor){
        System.out.println("O imposto do Rio de Janeiro é de "+valor * 0.20);
    }
}
