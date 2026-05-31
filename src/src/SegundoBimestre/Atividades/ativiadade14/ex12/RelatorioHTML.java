package SegundoBimestre.Atividades.ativiadade14.ex12;

public class RelatorioHTML implements FormatoRelatorio {

    @Override
    public void gerar(String conteudo) {
        System.out.println("Iniciando geração do arquivo .html");
        System.out.println("Aplicando tags e estrutura...");
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Arquivo gerado: relatorio.html");
    }

    @Override
    public String getNome() { return "HTML"; }
}
