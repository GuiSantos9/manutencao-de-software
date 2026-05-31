package SegundoBimestre.Atividades.ativiadade14.ex5;

public class Main {
    public static void main(String[] args) {
        LoggerSistema.getInstance().log("Pedido criado com sucesso");
        LoggerSistema.getInstance().log("Pagamento aprovado");
        LoggerSistema.getInstance().log("Erro ao calcular frete");

        LoggerSistema.getInstance().exibirHistorico();

        LoggerSistema a = LoggerSistema.getInstance();
        LoggerSistema b = LoggerSistema.getInstance();
        System.out.println("\nMesma instância: " + (a == b));
    }
}
