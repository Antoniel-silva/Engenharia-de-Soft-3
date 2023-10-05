//resolução letra a)

import java.util.List;

public class ImpostoDeRenda {
    private String cpfContribuinte;
    private List<Double> rendimentos;
    private List<Double> despesas;

    public ImpostoDeRenda(String cpfContribuinte, List<Double> rendimentos, List<Double> despesas) {
        this.cpfContribuinte = cpfContribuinte;
        this.rendimentos = rendimentos;
        this.despesas = despesas;
    }

    public void processar() {
        // Validação do CPF
        if (cpfContribuinte == null || cpfContribuinte.length() != 11) {
            throw new IllegalArgumentException("CPF inválido");
        }

        // Validação dos rendimentos e despesas
        for (Double rendimento : rendimentos) {
            if (rendimento < 0) {
                throw new IllegalArgumentException("Rendimento negativo não é permitido");
            }
        }

        for (Double despesa : despesas) {
            if (despesa < 0) {
                throw new IllegalArgumentException("Despesa negativa não é permitida");
            }
        }

        // Validação do número máximo de rendimentos
        if (rendimentos.size() > 5) {
            throw new IllegalArgumentException("Não podem existir mais que 5 rendimentos");
        }

        CalculadoraImpostoDeRenda calculadora = new CalculadoraImpostoDeRenda();
        double impostoDevido = calculadora.calcularImposto(rendimentos, despesas);
        RelatorioImpostoDeRenda relatorio = new RelatorioImpostoDeRenda();
        relatorio.gerarRelatorio(this, impostoDevido);
    }

    // Getters para cpfContribuinte, rendimentos e despesas (opcional)
    public String getCpfContribuinte() {
        return cpfContribuinte;
    }

    public List<Double> getRendimentos() {
        return rendimentos;
    }

    public List<Double> getDespesas() {
        return despesas;
    }
}


//as validações são realizadas antes de calcular o imposto de renda no método processar. Se alguma das validações falhar,
// uma exceção será lançada,e informando qual validação foi violada.


// Resolução questão B)

import java.util.List;

public class ImpostoDeRenda {
    private String cpfContribuinte;
    private List<Double> rendimentos;
    private List<Double> despesas;

    public ImpostoDeRenda(String cpfContribuinte, List<Double> rendimentos, List<Double> despesas) {
        this.cpfContribuinte = cpfContribuinte;
        this.rendimentos = rendimentos;
        this.despesas = despesas;
    }

    public void processar() {
        ValidacaoImpostoDeRenda.validar(this);

        CalculadoraImpostoDeRenda calculadora = new CalculadoraImpostoDeRenda();
        double impostoDevido = calculadora.calcularImposto(rendimentos, despesas);
        RelatorioImpostoDeRenda relatorio = new RelatorioImpostoDeRenda();
        relatorio.gerarRelatorio(this, impostoDevido);
    }

    // Getters para cpfContribuinte, rendimentos e despesas (opcional)
    public String getCpfContribuinte() {
        return cpfContribuinte;
    }

    public List<Double> getRendimentos() {
        return rendimentos;
    }

    public List<Double> getDespesas() {
        return despesas;
    }
}

class ValidacaoImpostoDeRenda {
    public static void validar(ImpostoDeRenda impostoDeRenda) {
        // Validação do CPF
        String cpfContribuinte = impostoDeRenda.getCpfContribuinte();
        if (cpfContribuinte == null || cpfContribuinte.length() != 11) {
            throw new IllegalArgumentException("CPF inválido");
        }

        // Validação dos rendimentos e despesas
        List<Double> rendimentos = impostoDeRenda.getRendimentos();
        for (Double rendimento : rendimentos) {
            if (rendimento < 0) {
                throw new IllegalArgumentException("Rendimento negativo não é permitido");
            }
        }

        List<Double> despesas = impostoDeRenda.getDespesas();
        for (Double despesa : despesas) {
            if (despesa < 0) {
                throw new IllegalArgumentException("Despesa negativa não é permitida");
            }
        }

        // Validação do número máximo de rendimentos
        if (rendimentos.size() > 5) {
            throw new IllegalArgumentException("Não podem existir mais que 5 rendimentos");
        }
    }
}

// Neste código, as validações foram movidas para a classe ValidacaoImpostoDeRenda, 
//que possui um método validar que recebe um objeto ImpostoDeRenda como argumento. 
//A classe ImpostoDeRenda agora chama esse método de validação antes de realizar o cálculo do imposto. 
//Isso mantém a responsabilidade de validação separada da responsabilidade de processamento do imposto e segue o princípio SRP.
