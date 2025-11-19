package fatec.lanchoneteapp.adapters.repository;

import fatec.lanchoneteapp.application.repository.RepositoryStrategy;
import fatec.lanchoneteapp.domain.entity.Pedido;

import java.util.List;

public class PedidoRepository implements RepositoryStrategy<Pedido> {

    @Override
    public void salvar(Pedido entidade) {

    }

    @Override
    public void atualizar(Pedido entidade) {

    }

    @Override
    public void excluir(Pedido entidade) {

    }

    @Override
    public Pedido buscar(Pedido entidade) {
        return null;
    }

    @Override
    public List<Pedido> listar() {
        return List.of();
    }
}
