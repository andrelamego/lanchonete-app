package fatec.lanchoneteapp.application.dto;

import fatec.lanchoneteapp.application.mapper.ProdutoMapper;
import fatec.lanchoneteapp.domain.entity.Produto;

public record ItemPedidoDTO(
        int nPedido,
        Produto produto,
        int qtd,
        double valorUn,
        double valorTotal
) {
    static ProdutoMapper produtoMapper = new ProdutoMapper();

    public int getNPedido() {
        return nPedido;
    }

    public ProdutoDTO getProdutoDTO() {
        return produtoMapper.toDTO(produto);
    }

    public int getQtd() {
        return qtd;
    }

    public double getValorUn(){
        return valorUn;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
