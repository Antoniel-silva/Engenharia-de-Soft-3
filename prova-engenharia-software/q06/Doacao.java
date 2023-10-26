package q06;

public class Doacao {
    private String id;
    private String descricao;
    private double valor;
    private double bonus;

    public Doacao(String id, String descricao, double valor, double bonus) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.bonus = bonus;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public double getBonus() {
        return bonus;
    }
}