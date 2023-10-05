//Para resolver o problema de violação do SRP
//nas classes ContaCorrente, Investimento, e Transacao, podemos criar classes de serviço separadas 
//para lidar com as responsabilidades que estão sendo violadas.

import java.util.List;

// Classe de serviço para lidar com operações relacionadas à Conta Corrente
class ContaCorrenteService {
    public List<Transacao> filtrarTransacoesInvalidas(ContaCorrente contaCorrente) {
        // Implemente a lógica para filtrar transações inválidas
        return contaCorrente.getTransacoes(); // Retorna todas as transações por padrão
    }
}

// Classe de serviço para lidar com operações relacionadas a Investimentos
class InvestimentoService {
    public String avaliarRisco(Investimento investimento) {
        // Implemente a lógica para avaliar o risco do investimento
        return investimento.getStatusRisco(); // Retorna o status de risco por padrão
    }
}

// Classe de serviço para lidar com operações relacionadas a Transações
class TransacaoService {
    public boolean verificarFraude(Transacao transacao) {
        // Implemente a lógica para verificar se a transação é fraudulenta
        return false; // Retorna falso por padrão
    }
}

enum TipoInvestimento {
    RENDA_FIXA, RENDA_VARIAVEL
}

enum TipoTransacao {
    CREDITO, DEBITO
}

class ContaCorrente {
    private String numero;
    private double saldo;
    private List<Transacao> transacoes;

    public ContaCorrente(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}

class Investimento {
    private int id;
    private double valor;
    private TipoInvestimento tipo;
    private String statusRisco;

    public Investimento(int id, double valor, TipoInvestimento tipo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public TipoInvestimento getTipo() {
        return tipo;
    }

    public String getStatusRisco() {
        return statusRisco;
    }
}

class Transacao {
    private int id;
    private double valor;
    private TipoTransacao tipo;

    public Transacao(int id, double valor, TipoTransacao tipo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }
}
