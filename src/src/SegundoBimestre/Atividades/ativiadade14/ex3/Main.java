package SegundoBimestre.Atividades.ativiadade14.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CanalNotificacaoStrategy canalNotificacaoStrategy = null;

        System.out.println("Escreva a sua mensagem:");
        String textoMensagem = scanner.nextLine();
        SistemaNotificacao mensagem = new SistemaNotificacao(textoMensagem);


        System.out.println("Escolha o canal da mensagem:");
        String tipoMensagem = scanner.next();

        if(tipoMensagem.equals("E-mail")){
            canalNotificacaoStrategy = new CanalEmail();
        } else if (tipoMensagem.equals("SMS")){
            canalNotificacaoStrategy = new CanalSMS();
        } else if (tipoMensagem.equals("WhatsApp")){
            canalNotificacaoStrategy = new CanalWhatsApp();
        }else if (tipoMensagem.equals("Push")){
            canalNotificacaoStrategy = new CanalPush();
        }

        SistemaNotificacaoService service = new SistemaNotificacaoService();
        service.finalizar(mensagem, canalNotificacaoStrategy);

        scanner.close();
    }
}
