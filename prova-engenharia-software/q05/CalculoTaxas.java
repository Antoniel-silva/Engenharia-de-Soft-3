package q05;

public class CalculoTaxas {
    Transacao t;
    public CalculoTaxas(Transacao transacao) {
        this.t = transacao;
    }

    public double calcularTaxas() {
        switch (t.getTipo()) {
            case DEPOSITO:  
                return t.getValor() * 0.01;

            case RETIRADA:
                return t.getValor() * 0.02;

            case TRANSFERENCIA:
                return t.getValor() * 0.015;

             default:
                return 0;
        }
    }
}
