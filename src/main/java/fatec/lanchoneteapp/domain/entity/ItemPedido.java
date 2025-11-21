package fatec.lanchoneteapp.domain.entity;

public class ItemPedido {
    private int NumPedido;
    private int IdProduto;
    private int qtd;
    private double valorUnit;
    private double valorTotal;

    public int getNumPedido() {
        return NumPedido;
    }
    public int getIdProduto() {
        return IdProduto;
    }
    public int getQtd() {
        return qtd;
    }
    public double getValorUnit() {
        return valorUnit;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setNumPedido(int numPedido) {
        NumPedido = numPedido;
    }
    public void setIdProduto(int idProduto) {
        IdProduto = idProduto;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void calcularValorTotal(){
        this.valorTotal = this.valorUnit * this.qtd;
    }
}
