package SegundoBimestre.Atividades.ativiadade14.ex4;

public class Main {
    public static void main(String[] args) {
        ConfiguracaoSistema config1 = ConfiguracaoSistema.getInstancia();
        ConfiguracaoSistema config2 = ConfiguracaoSistema.getInstancia();

        System.out.println(config1 == config2);
        System.out.println(config1.getNomeAplicacao());
        System.out.println(config1.getAmbienteExecucao());

        config1.setAmbienteExecucao("producao");
        System.out.println(config2.getAmbienteExecucao());

        System.out.println(config1);
    }
}
