package SegundoBimestre.Atividades.ativiadade14.ex12;

public class GeradorRelatorio {
    private FormatoRelatorio formato;

    public GeradorRelatorio(FormatoRelatorio formato) {
        this.formato = formato;
    }

    public void setFormato(FormatoRelatorio formato) {
        this.formato = formato;
    }

    public void gerar(String conteudo) {
        LoggerSistema.getInstance().log("Gerando relatório em " + formato.getNome()
                + " | Conteúdo: " + conteudo);
        formato.gerar(conteudo);
    }
}