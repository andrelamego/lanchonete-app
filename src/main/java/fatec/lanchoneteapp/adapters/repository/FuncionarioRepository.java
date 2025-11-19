package fatec.lanchoneteapp.adapters.repository;

import fatec.lanchoneteapp.application.repository.RepositoryStrategy;
import fatec.lanchoneteapp.domain.entity.Funcionario;

import java.util.List;

public class FuncionarioRepository implements RepositoryStrategy<Funcionario> {

    @Override
    public void salvar(Funcionario entidade) {

    }

    @Override
    public void atualizar(Funcionario entidade) {

    }

    @Override
    public void excluir(Funcionario entidade) {

    }

    @Override
    public Funcionario buscar(Funcionario entidade) {
        return null;
    }

    @Override
    public List<Funcionario> listar() {
        return List.of();
    }
}
