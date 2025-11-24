package fatec.lanchoneteapp.application.service;

import fatec.lanchoneteapp.application.repository.RepositoryNoReturn;
import fatec.lanchoneteapp.domain.entity.ProdutoFornecedor;

public class ProdutoFornecedorService {
    private final RepositoryNoReturn<ProdutoFornecedor> repository;

    public ProdutoFornecedorService(RepositoryNoReturn<ProdutoFornecedor> repository) {
        this.repository = repository;
    }
}
