package fatec.lanchoneteapp.application.repository;

import java.util.List;

public interface RepositoryStrategy<T> {

    /**
     * Salva a entidade especificada no banco de dados.
     *
     * @param entidade Entidade a ser salva.
     */
    void salvar(T entidade);

    /**
     * Atualiza a entidade especificada no banco de dados.
     *
     * @param entidade Entidade a ser atualizada.
     */
    void atualizar(T entidade);

    /**
     * Remove a entidade especificada do banco de dados.
     *
     * @param entidade Entidade a ser excluída
     */
    void excluir(T entidade);

    /**
     * Realiza a busca de uma entidade no banco de dados com base nos parâmetros fornecidos.
     *
     * @param entidade Entidade utilizada como parâmetro de busca.
     * @return A entidade correspondente encontrada ou null caso não seja localizada.
     */
    T buscar(T entidade);

    /**
     * Retorna uma lista contendo todas as entidades armazenadas em determinada tabela no banco de dados.
     *
     * @return Uma lista de entidades do tipo T.
     */
    List<T> listar();
}
