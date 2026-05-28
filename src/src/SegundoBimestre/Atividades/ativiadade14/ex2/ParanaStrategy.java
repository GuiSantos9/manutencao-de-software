package SegundoBimestre.Atividades.ativiadade14.ex2;

public class ParanaStrategy implements ImpostoStrategy{
    @Override
    public void calcularImposto(Double valor){
        System.out.println("O imposto do Paraná é de "+valor * 0.12);
    }
}
