package q06;

public class Produto {
    private String id;
    private String descricao;
    private double valor;
    private double taxa;

    public Produto(String id, String descricao, double valor, double taxa) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.taxa = taxa;
    }
    //métodos de leitura...
    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public double getTaxa() {
        return taxa;
    }
}
