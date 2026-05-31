package SegundoBimestre.Atividades.ativiadade14.ex3;

public class CanalSMS implements CanalNotificacaoStrategy {
    @Override
    public void enviarNotificacao(String mensagem){
        System.out.println("SMS: "+mensagem);
    }
}
