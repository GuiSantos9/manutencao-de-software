package SegundoBimestre.Atividades.ativiadade14.ex12;

public class RelatorioPDF implements FormatoRelatorio {

    @Override
    public void gerar(String conteudo) {

        System.out.println("  Iniciando geração do arquivo .pdf");
        System.out.println("  Aplicando fontes e margens...");
        System.out.println("  Conteúdo: " + conteudo);

    }

    @Override
    public String getNome() { return "PDF"; }
}