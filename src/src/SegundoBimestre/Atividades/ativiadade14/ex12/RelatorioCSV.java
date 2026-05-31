package SegundoBimestre.Atividades.ativiadade14.ex12;

public class RelatorioCSV implements FormatoRelatorio {

    @Override
    public void gerar(String conteudo) {
        System.out.println("Iniciando geração do arquivo .csv");
        System.out.println("Separando campos por vírgula...");
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Arquivo gerado: relatorio.csv");
    }

    @Override
    public String getNome() { return "CSV"; }
}