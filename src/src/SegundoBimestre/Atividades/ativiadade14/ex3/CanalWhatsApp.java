package SegundoBimestre.Atividades.ativiadade14.ex3;

public class CanalWhatsApp implements CanalNotificacaoStrategy {
    @Override
    public void enviarNotificacao(String mensagem){
        System.out.println("WhatsApp: "+mensagem);
    }
}
