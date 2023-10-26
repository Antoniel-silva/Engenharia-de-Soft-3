
public class Teste {
    public static void main(String[] args) {
        Cliente c = new Cliente("Antoniel");   
        Pedido p = new Pedido(145.66, c);

        c.processarPedido(p);
    }
}
