//Resolução:

//Explique por que motivo a herança entre as classes não é justificada e proponha uma solução.

/*Se houver necessidade de adicionar outro tipo de conta que compartilhe 
características com ContaBancaria mas não 
seja uma ContaPoupanca, a herança pode não ser a melhor escolha.
porque se a hierarquia de classes se tornar muito rígida, pode ser difícil fazer alterações. */

//Solução possivel

public interface OperacoesBancarias {
    void depositar(double valor);
    void sacar(double valor);
}

public class ContaBancaria implements OperacoesBancarias {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class ContaPoupanca implements OperacoesBancarias {
    private ContaBancaria conta;

    public ContaPoupanca(double saldoInicial) {
        this.conta = new ContaBancaria(saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        conta.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 1000) {
            throw new RuntimeException("Não pode sacar mais de 1000 em uma poupança");
        }
        conta.sacar(valor);
    }

    public double getSaldo() {
        return conta.getSaldo();
    }
}


// Nesse exemplo, foi criada a interface chamada operações bancárias
// oferecendo maior flexibilidade e menor acoplamento do que a herança direta.
