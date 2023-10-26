package q05;

import java.util.Date;

public class Transacao {
    private double valor;
    private Date data;
    private TipoTransacao tipo; // Tipos: DEPOSITO, RETIRADA, TRANSFERENCIA...

    public Transacao(double valor, TipoTransacao tipo) {
        this.valor = valor;
        this.tipo = tipo;
        this.data = new Date();
    }

    public double getValor() {
        return this.valor;
    }

    public TipoTransacao getTipo() {
        return this.tipo;
    }

    public Date getDate() {
        return new Date();
    }
}
