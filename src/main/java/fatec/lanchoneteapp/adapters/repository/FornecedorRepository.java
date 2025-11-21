package fatec.lanchoneteapp.adapters.repository;

import fatec.lanchoneteapp.application.repository.RepositoryNoReturn;
import fatec.lanchoneteapp.domain.entity.Fornecedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FornecedorRepository implements RepositoryNoReturn<Fornecedor>{
    private Connection connection;

    public FornecedorRepository(Connection connection){
        this.connection = connection; 
    }

    @Override
    public void salvar(Fornecedor entidade) throws SQLException {
        String sql = "INSERT INTO Fornecedor(?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, entidade.getNome());
        ps.setString(2, entidade.getTel());
        ps.setString(3, entidade.getLogradouro());
        ps.setInt(4, entidade.getNumero());
        ps.setString(5, entidade.getCep());
        ps.setString(6, entidade.getComplemento());
        ps.execute();
        ps.close();
    }

    @Override
    public void atualizar(Fornecedor entidade) throws SQLException {
        String sql = "UPDATE Fornecedor SET Nome = ?, Telefone = ?, Logradouro = ?, " +
                    "Numero = ?, CEP = ?, Complemento = ? WHERE ID = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, entidade.getNome());
        ps.setString(2, entidade.getTel());
        ps.setString(3, entidade.getLogradouro());
        ps.setInt(4, entidade.getNumero());
        ps.setString(5, entidade.getCep());
        ps.setString(6, entidade.getComplemento());
        ps.setInt(7, entidade.getId());
        ps.execute();
        ps.close();
    }

    @Override
    public void excluir(Fornecedor entidade) throws SQLException {
        String sql = "DELETE FROM Fornecedor WHERE ID = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, entidade.getId());
        ps.execute();
        ps.close();
    }

    @Override
    public Fornecedor buscarPorID(Fornecedor entidade) throws SQLException {
        String sql = "SELECT ID, Nome, Telefone, Logradouro, Numero, CEP, Complemento FROM Fornecedor WHERE ID = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, entidade.getId());

        int cont = 0;
        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            entidade.setId(rs.getInt("ID"));
            entidade.setNome(rs.getString("Nome"));
            entidade.setTel(rs.getString("Telefone"));
            entidade.setLogradouro(rs.getString("Logradouro"));
            entidade.setNumero(rs.getInt("Numero"));
            entidade.setCep(rs.getString("CEP"));
            entidade.setComplemento(rs.getString("Complemento"));
            
            cont++;
        }

        if(cont == 0){
            entidade = new Fornecedor();
        }

        rs.close();
        ps.close();
        return entidade;
    }

    @Override
    public List<Fornecedor> listar() throws SQLException {
        String sql = "SELECT ID, Nome, Telefone, Logradouro, Numero, CEP, Complemento FROM Fornecedor";
        PreparedStatement ps = connection.prepareStatement(sql);

        List<Fornecedor> entidades = new ArrayList<>();
        ResultSet rs = ps.executeQuery();

        while(rs.next()){
            Fornecedor entidade = new Fornecedor();
            entidade.setId(rs.getInt("ID"));
            entidade.setNome(rs.getString("Nome"));
            entidade.setTel(rs.getString("Telefone"));
            entidade.setLogradouro(rs.getString("Logradouro"));
            entidade.setNumero(rs.getInt("Numero"));
            entidade.setCep(rs.getString("CEP"));
            entidade.setComplemento(rs.getString("Complemento"));

            entidades.add(entidade);
        }

        rs.close();
        ps.close();
        return entidades;
    }
}