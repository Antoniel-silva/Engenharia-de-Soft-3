// a) Crie uma interface Operacao que possui um método executar() onde dois
//parâmetros são recebidos;

public interface Operacao {
    double executar(double a, double b);
}


// b) Implemente a interface para cada uma das operações possíveis;


public class Soma implements Operacao {
    @Override
    public double executar(double a, double b) {
        return a + b;
    }
}

public class Subtracao implements Operacao {
    @Override
    public double executar(double a, double b) {
        return a - b;
    }
}

public class Multiplicacao implements Operacao {
    @Override
    public double executar(double a, double b) {
        return a * b;
    }
}

public class Divisao implements Operacao {
    @Override
    public double executar(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return a / b;
    }
}


//c) Refatore o método calcular para coerente com o OCP recebendo uma lista de
//operações e adicionando à lista de resultados o resultado de cada método
//executar da Operacao em questão.

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    private final double a;
    private final double b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public List<Double> calcular(List<Operacao> operacoes) {
        List<Double> resultados = new ArrayList<>();
        for (Operacao operacao : operacoes) {
            resultados.add(operacao.executar(this.a, this.b));
        }
        return resultados;
    }

    public static void main(String[] args) {
        double a = 10.0;
        double b = 5.0;

        Calculadora calculadora = new Calculadora(a, b);

        List<Operacao> operacoes = new ArrayList<>();
        operacoes.add(new Soma());
        operacoes.add(new Subtracao());
        operacoes.add(new Multiplicacao());
        operacoes.add(new Divisao());

        List<Double> resultados = calculadora.calcular(operacoes);

        for (Double resultado : resultados) {
            System.out.println("Resultado: " + resultado);
        }
    }
}
