//resolução letra A)

import java.util.List;

//para atender o principio SRP, criamos a classe CalculadoraImpostoDeRenda, que sera a rresponsavel pelo calculo do imposto

class CalculadoraImpostoDeRenda {
    public static double calcular(double rendaTotal, double despesaTotal) {
        double baseCalculo = rendaTotal - despesaTotal;
        if (baseCalculo <= 1903.98) {
            return 0.0;
        }
        if (baseCalculo <= 2826.65) {
            return baseCalculo * 0.075 - 142.80;
        }
        // E assim por diante, para outros intervalos...
        return baseCalculo * 0.275 - 869.36; // Para base de cálculo acima de 4664.68
    }
}

class ImpostoDeRenda {
    private String cpfContribuinte;
    private List<Double> rendimentos;
    private List<Double> despesas;

    public ImpostoDeRenda(String cpfContribuinte, List<Double> rendimentos, List<Double> despesas) {
        this.cpfContribuinte = cpfContribuinte;
        this.rendimentos = rendimentos;
        this.despesas = despesas;
    }

    public void gerarRelatorio() {
        double rendaTotal = rendimentos.stream().mapToDouble(Double::doubleValue).sum();
        double despesaTotal = despesas.stream().mapToDouble(Double::doubleValue).sum();

        System.out.println("CPF: " + cpfContribuinte);
        System.out.println("Rendimentos: " + rendimentos);
        System.out.println("Despesas: " + despesas);
        double impostoDevido = CalculadoraImpostoDeRenda.calcular(rendaTotal, despesaTotal);
        System.out.println("Imposto Devido: " + impostoDevido);
    }
}


//resolução Letra B)

//

import java.util.List;

class CalculadoraImpostoDeRenda {
    public static double calcular(double rendaTotal, double despesaTotal) {
        double baseCalculo = rendaTotal - despesaTotal;
        if (baseCalculo <= 1903.98) {
            return 0.0;
        }
        if (baseCalculo <= 2826.65) {
            return baseCalculo * 0.075 - 142.80;
        }
        // E assim por diante, para outros intervalos...
        return baseCalculo * 0.275 - 869.36; // Para base de cálculo acima de 4664.68
    }
}

class RelatorioImpostoDeRenda {
    public void imprimirInformacoesContribuinte(String cpfContribuinte) {
        System.out.println("CPF do Contribuinte: " + cpfContribuinte);
    }

    public void imprimirRendimentos(List<Double> rendimentos) {
        System.out.println("Rendimentos: " + rendimentos);
    }

    public void imprimirDespesas(List<Double> despesas) {
        System.out.println("Despesas: " + despesas);
    }

    public void imprimirImpostoDevido(double impostoDevido) {
        System.out.println("Imposto Devido: " + impostoDevido);
    }
}

class ImpostoDeRenda {
    private String cpfContribuinte;
    private List<Double> rendimentos;
    private List<Double> despesas;

    public ImpostoDeRenda(String cpfContribuinte, List<Double> rendimentos, List<Double> despesas) {
        this.cpfContribuinte = cpfContribuinte;
        this.rendimentos = rendimentos;
        this.despesas = despesas;
    }

    public void gerarRelatorio() {
        double rendaTotal = rendimentos.stream().mapToDouble(Double::doubleValue).sum();
        double despesaTotal = despesas.stream().mapToDouble(Double::doubleValue).sum();

        RelatorioImpostoDeRenda relatorio = new RelatorioImpostoDeRenda();

        relatorio.imprimirInformacoesContribuinte(cpfContribuinte);
        relatorio.imprimirRendimentos(rendimentos);
        relatorio.imprimirDespesas(despesas);
        
        double impostoDevido = CalculadoraImpostoDeRenda.calcular(rendaTotal, despesaTotal);
        relatorio.imprimirImpostoDevido(impostoDevido);
    }
}

//Resolução Letra c)

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



