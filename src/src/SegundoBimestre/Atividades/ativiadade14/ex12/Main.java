package SegundoBimestre.Atividades.ativiadade14.ex12;

public class Main {
    public static void main(String[] args) {

        GeradorRelatorio gerador = new GeradorRelatorio(new RelatorioPDF());
        gerador.gerar("Vendas do mês de maio");

        gerador.setFormato(new RelatorioCSV());
        gerador.gerar("Cadastro de clientes");

        gerador.setFormato(new RelatorioHTML());
        gerador.gerar("Resumo financeiro anual");

        LoggerSistema.getInstance().exibirHistorico();
    }
}
