package fatec.lanchoneteapp.adapters.repository;

import fatec.lanchoneteapp.application.repository.RepositoryStrategy;
import fatec.lanchoneteapp.domain.entity.Historico;

import java.util.List;

public class HistoricoRepository implements RepositoryStrategy<Historico> {

    @Override
    public void salvar(Historico entidade) {

    }

    @Override
    public void atualizar(Historico entidade) {

    }

    @Override
    public void excluir(Historico entidade) {

    }

    @Override
    public Historico buscar(Historico entidade) {
        return null;
    }

    @Override
    public List<Historico> listar() {
        return List.of();
    }
}
