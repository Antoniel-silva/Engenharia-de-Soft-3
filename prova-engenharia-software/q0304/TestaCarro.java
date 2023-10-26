package q0304;

class TestaCarro {
    public static void reabastecerSeNecessario(Carro c, int quantidade) {
        if (c.getQuantidadeCombustivel() < c.getCapacidadeMaxima() * 0.1) {
            if ((c.getQuantidadeCombustivel() + quantidade) <= c.capacidadeMaxima) {
                c.quantidadeCombustivel += quantidade;
            } else {
                System.out.println("Capacidade máxima do tanque ultrapassada.");
            }
        }
    }
}