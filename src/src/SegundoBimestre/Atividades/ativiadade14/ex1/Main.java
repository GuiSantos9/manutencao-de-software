package SegundoBimestre.Atividades.ativiadade14.ex1;

public class Main {
    public static void main() {

    Cliente cliente1 = new Cliente("Funcionario", 200.00);

    String tipoCliente = "COMUM";

    DescontoStrategy descontoStrategy = null;

        if (tipoCliente.equals("COMUM")) {
            descontoStrategy = new ComumStrategy();
        } else if (tipoCliente.equals("VIP")) {
            descontoStrategy = new VIPStrategy();
        } else if (tipoCliente.equals("FUNCIONARIO")) {
            descontoStrategy = new FuncionarioStrategy();
        }

    }
}
