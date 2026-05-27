package SegundoBimestre.Atividades.ativiadade14.ex1;

public class VIPStrategy implements DescontoStrategy{
    @Override
    public void calcularDesconto(String tipoCliente, Double valorCompra){
        System.out.println("Desconto para VIPs" + valorCompra * 0.10);
    }
}
