package SegundoBimestre.Atividades.ativiadade14.ex6;

public class ConfiguracaoDesconto {
    private static ConfiguracaoDesconto instancia;

    private double descontoMaximo;

    private ConfiguracaoDesconto() {
        this.descontoMaximo = 0.30; // 30% como limite padrão
    }

    public static ConfiguracaoDesconto getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracaoDesconto();
        }
        return instancia;
    }

    public double getDescontoMaximo()              { return descontoMaximo; }
    public void   setDescontoMaximo(double limite) { this.descontoMaximo = limite; }
}
