package fatec.lanchoneteapp.domain.entity;

import java.util.List;

public class Historico {
    private List<Pedido> pedidos;
    private Cliente cliente;
    
    public List<Pedido> getPedidos() {
        return pedidos;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
