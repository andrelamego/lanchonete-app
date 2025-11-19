package fatec.lanchoneteapp.adapters.repository;

import fatec.lanchoneteapp.application.repository.RepositoryStrategy;
import fatec.lanchoneteapp.domain.entity.Cliente;

import java.util.List;

public class ClienteRepository implements RepositoryStrategy<Cliente> {

    @Override
    public void salvar(Cliente entidade) {

    }

    @Override
    public void atualizar(Cliente entidade) {

    }

    @Override
    public void excluir(Cliente entidade) {

    }

    @Override
    public Cliente buscar(Cliente entidade) {
        return null;
    }

    @Override
    public List<Cliente> listar() {
        return List.of();
    }
}
