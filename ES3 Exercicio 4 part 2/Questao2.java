//Resolução da questão 2:

public class Conta {
    private double saldo;
    private String numeroConta;

    public Conta(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        saldo -= valor;
    }

    // Outros métodos relevantes...
}

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    // Métodos específicos do cliente...
}

public class ContaCliente {
    private Conta conta;
    private Cliente cliente;

    public ContaCliente(String numeroConta, double saldoInicial,
                       String nome, String cpf, String endereco) {
        this.conta = new Conta(numeroConta, saldoInicial);
        this.cliente = new Cliente(nome, cpf, endereco);
    }

    // Métodos específicos da conta do cliente...

    public double getSaldo() {
        return conta.getSaldo();
    }
}




//A classe Conta fica sendo a responsável pelas operações financeiras.
//A classe Cliente armazena as informações específicas só de cliente.
//A classe ContaCliente contém instâncias de Conta e Cliente através de composição.

//isso evita fazer herança diretamente.