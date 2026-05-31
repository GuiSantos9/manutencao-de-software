package SegundoBimestre.Atividades.ativiadade14.ex8;

public class ConfiguracaoSistema {
    private static ConfiguracaoSistema instancia;

    private String nomeAplicacao   = "SistemaPedidos";
    private double descontoMaximo  = 0.30;
    private double freteGratuito   = 300.00; // pedidos acima disso ganham frete grátis

    private ConfiguracaoSistema() {}

    public static ConfiguracaoSistema getInstance() {
        if (instancia == null) instancia = new ConfiguracaoSistema();
        return instancia;
    }

    public String getNomeAplicacao()            { return nomeAplicacao; }
    public double getDescontoMaximo()           { return descontoMaximo; }
    public double getFreteGratuito()            { return freteGratuito; }
    public void   setDescontoMaximo(double v)   { this.descontoMaximo = v; }
    public void   setFreteGratuito(double v)    { this.freteGratuito = v; }

}
