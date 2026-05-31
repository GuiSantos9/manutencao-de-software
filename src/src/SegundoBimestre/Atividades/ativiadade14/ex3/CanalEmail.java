package SegundoBimestre.Atividades.ativiadade14.ex3;

public class CanalEmail implements CanalNotificacaoStrategy {
    @Override
    public void enviarNotificacao(String mensagem){
        System.out.println("E-mail: "+mensagem);
    }
}
