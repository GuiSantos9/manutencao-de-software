package SegundoBimestre.Atividades.ativiadade14.ex4;

public class ConfiguracaoSistema {

    private static ConfiguracaoSistema instancia;

    private String urlBancoDeDados;
    private String nomeAplicacao;
    private String ambienteExecucao;
    private String chaveApi;

    public ConfiguracaoSistema(){
        this.urlBancoDeDados = "postgresql://localhost:5432/meu_banco";
        this.nomeAplicacao = "Sistema de Vendas";
        this.ambienteExecucao = "Desenvolvimento";
        this.chaveApi = "sk-1234567890abcdef";
    }

    public static ConfiguracaoSistema getInstancia(){
        if (instancia == null) {
            instancia = new ConfiguracaoSistema();
        }
        return instancia;
    }

    public String getUrlBancoDeDados() {return this.urlBancoDeDados;}
    public String getNomeAplicacao() {return this.nomeAplicacao;}
    public String getAmbienteExecucao() {return this.ambienteExecucao;}
    public String getChaveApi() {return this.chaveApi;}

    public void setUrlBancoDeDados(String urlBancoDeDados){this.urlBancoDeDados = urlBancoDeDados;}
    public void setNomeAplicacao(String nomeAplicacao) {this.nomeAplicacao = nomeAplicacao;}
    public void setAmbienteExecucao(String ambienteExecucao){this.ambienteExecucao = ambienteExecucao;}
    public void setChaveApi(String chaveApi){this.chaveApi = chaveApi;}

    @Override
    public String toString(){
        return "ConfiguracaoSistema{" +
                "urlBancoDeDados='"  + urlBancoDeDados  + '\'' +
                ", nomeAplicacao='"  + nomeAplicacao    + '\'' +
                ", ambienteExecucao='" + ambienteExecucao + '\'' +
                ", chaveApi='"       + chaveApi         + '\'' +
                '}';
    }
}
