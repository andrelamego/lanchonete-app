package fatec.lanchoneteapp.adapters.repository;

import fatec.lanchoneteapp.application.repository.RepositoryStrategy;
import fatec.lanchoneteapp.domain.entity.Cargo;

import java.util.List;

public class CargoRepository implements RepositoryStrategy<Cargo> {
    @Override
    public void salvar(Cargo entidade) {

    }

    @Override
    public void atualizar(Cargo entidade) {

    }

    @Override
    public void excluir(Cargo entidade) {

    }

    @Override
    public Cargo buscar(Cargo entidade) {
        return null;
    }

    @Override
    public List<Cargo> listar() {
        return List.of();
    }
}
