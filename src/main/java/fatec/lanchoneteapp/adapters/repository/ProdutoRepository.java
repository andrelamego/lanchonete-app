package fatec.lanchoneteapp.adapters.repository;

import fatec.lanchoneteapp.application.repository.RepositoryStrategy;
import fatec.lanchoneteapp.domain.entity.Produto;

import java.util.List;

public class ProdutoRepository implements RepositoryStrategy<Produto> {

    @Override
    public void salvar(Produto entidade) {

    }

    @Override
    public void atualizar(Produto entidade) {

    }

    @Override
    public void excluir(Produto entidade) {

    }

    @Override
    public Produto buscar(Produto entidade) {
        return null;
    }

    @Override
    public List<Produto> listar() {
        return List.of();
    }
}
