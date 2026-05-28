package SegundoBimestre.Atividades.ativiadade14.ex2;

public class Main {
    public static void main(String[] args) {
        Estado estado = new Estado("PR", 1300.0);

        String tipoEstado = estado.getEstado();

        ImpostoStrategy impostoStrategy = null;

        if(tipoEstado.equals("PR")){
            impostoStrategy = new ParanaStrategy();
        } else if (tipoEstado.equals("SP")){
            impostoStrategy = new SaoPauloStrategy();
        } else if (tipoEstado.equals("RJ")){
            impostoStrategy = new RioDeJaneiroStrategy();
        }

        EstadoService service = new EstadoService();
        service.finalizar(estado, impostoStrategy);

    }
}
