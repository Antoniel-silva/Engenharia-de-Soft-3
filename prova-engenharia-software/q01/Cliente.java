

import java.util.List;
public class Cliente {
    private String nome;
    private List<Pedido> pedidos;
    private ProcessamentoPedido processaPedidos;

    public Cliente(String nome) {
        this.nome = nome;
        this.processaPedidos = new ProcessamentoPedido();
    }

    public String getNome() {
        return this.nome;
    }

    public void processarPedido(Pedido pedido) {
        pedidos.add(pedido);
        processaPedidos.calcularDesconto(pedido);
    }
}

