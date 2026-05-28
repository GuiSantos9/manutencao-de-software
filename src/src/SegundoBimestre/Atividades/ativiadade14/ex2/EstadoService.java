package SegundoBimestre.Atividades.ativiadade14.ex2;

public class EstadoService {
    public void finalizar(Estado estado, ImpostoStrategy impostoStrategy){
        if (impostoStrategy == null){
            System.out.println("Valor inválido para imposto!");
            return;
        }
        impostoStrategy.calcularImposto(estado.getValor());
    }
}
