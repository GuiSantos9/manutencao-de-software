package SegundoBimestre.Atividades.ativiadade14.ex3;

public class SistemaNotificacaoService {
    public void finalizar(SistemaNotificacao mensagem, CanalNotificacaoStrategy canalNotificacao){
        if(canalNotificacao == null){
            System.out.println("Tipo invalido de mensagem!");
            return;
        }
        canalNotificacao.enviarNotificacao(mensagem.getMensagem());
    }
}
