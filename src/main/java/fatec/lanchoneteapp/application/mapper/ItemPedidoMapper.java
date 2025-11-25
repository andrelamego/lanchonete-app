package fatec.lanchoneteapp.application.mapper;

import fatec.lanchoneteapp.application.dto.ItemPedidoDTO;
import fatec.lanchoneteapp.domain.entity.ItemPedido;

public class ItemPedidoMapper {
    public void toDTO(ItemPedido itemPedido) {

    }

    public ItemPedido toEntity(ItemPedidoDTO dto) {
        if(dto == null)
            return null;

        return new ItemPedido(
                dto.nPedido(),
                dto.produto(),
                dto.qtd(),
                dto.valorUn(),
                dto.valorTotal()
        );
    }
}
