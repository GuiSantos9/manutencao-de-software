package SegundoBimestre.Atividades.ativiadade15.ex1;

// Main.java
public class Main {
    public static void main(String[] args) {
        ProdutoFornecedor produtoExterno = new ProdutoFornecedor(102030L, "Teclado Mecânico RGB", 250.00, 25.00, 15);

        Produto produtoAdaptado = new AdapterFornecedor(produtoExterno);

        System.out.println("=== PRODUTO ADAPTADO PARA A LOJA ===");
        System.out.println("Código: " + produtoAdaptado.getCodigo());
        System.out.println("Nome: " + produtoAdaptado.getNome());
        System.out.println("Preço Final (com frete): R$ " + produtoAdaptado.getPrecoFinal());
        System.out.println("Estoque: " + produtoAdaptado.getQuantidadeEstoque());
        System.out.println("Fornecedor: " + produtoAdaptado.getNomeFornecedor());
        System.out.println("Está disponível? " + (produtoAdaptado.isDisponivel() ? "Sim" : "Não"));
    }
}