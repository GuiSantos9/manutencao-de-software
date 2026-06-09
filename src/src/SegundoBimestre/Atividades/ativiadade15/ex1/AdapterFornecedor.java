package SegundoBimestre.Atividades.ativiadade15.ex1;

public class AdapterFornecedor extends Produto{
    public AdapterFornecedor(ProdutoFornecedor produtoFornecedor) {
        super(
                String.valueOf(produtoFornecedor.getIdProduto()),
                produtoFornecedor.getDescricao(),
                produtoFornecedor.getValorBase() + produtoFornecedor.getValorFrete(),
                produtoFornecedor.getQtdDisponivel(),
                "Fornecedor"
                );
    }
}
