package SegundoBimestre.Atividades.ativiadade14.ex1;

public class ClienteService {
    public void finalizar(Cliente cliente, DescontoStrategy descontoStrategy){
        if(descontoStrategy == null){
            System.out.println("Desconto Inválido!");
        }
        descontoStrategy.calcularDesconto(cliente.getTipoCliente(),cliente.getValorCompra());
    }
}
