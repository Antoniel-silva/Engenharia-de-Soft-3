package q06;

public class Servico {
    private String id;
    private String descricao;
    private double valor;
    private int horas;

    public Servico(String id, String descricao, double valor, int horas) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.horas = horas;
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
    
    public int getHoras() {
        return horas;
    }
}
