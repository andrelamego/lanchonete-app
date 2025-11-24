package fatec.lanchoneteapp.application.dto;

public record ClienteDTO(
        int id,
        String nome,
        String tel,
        String cpf,
        String logradouro,
        int numero,
        String cep,
        String complemento
) { }
