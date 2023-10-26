public class ProcessamentoPedido {
    public double calcularDesconto(Pedido pedido) {
        return pedido.getValorTotal() * 0.1;
    }
}