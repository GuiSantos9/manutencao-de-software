package SegundoBimestre.Atividades.ativiadade14.ex1;

public class FuncionarioStrategy implements DescontoStrategy{
    @Override
    public void calcularDesconto(String tipoCliente, Double valorCompra){
        System.out.println("Desconto para funcionarios" + valorCompra * 0.20);
    }
}
