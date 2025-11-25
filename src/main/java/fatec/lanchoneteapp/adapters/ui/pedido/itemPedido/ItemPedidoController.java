package fatec.lanchoneteapp.adapters.ui.pedido.itemPedido;

import fatec.lanchoneteapp.adapters.ui.controller.Controller;
import fatec.lanchoneteapp.adapters.ui.controller.IFormController;
import fatec.lanchoneteapp.application.dto.ItemPedidoDTO;
import fatec.lanchoneteapp.application.facade.PedidoFacade;

public class ItemPedidoController extends Controller implements IFormController<ItemPedidoDTO> {

    private PedidoFacade pedidoFacade;

    @Override
    public void onVoltarClick() {

    }

    @Override
    public void onSalvarClick() {

    }

    @Override
    public void setCampos(ItemPedidoDTO itemPedidoDTO) {

    }

    @Override
    public boolean validarCampos() {
        return false;
    }

    public void setPedidoFacade(PedidoFacade pedidoFacade) {
        this.pedidoFacade = pedidoFacade;
    }
}
