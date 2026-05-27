package SegundoBimestre.Atividades.ativiadade14.ex1;

public class ComumStrategy implements DescontoStrategy{
    @Override
    public void calcularDesconto(String tipoCliente, Double valorCompra){
        System.out.println("Desconto para pessoas comuns" + valorCompra * 0.05);
    }
}
