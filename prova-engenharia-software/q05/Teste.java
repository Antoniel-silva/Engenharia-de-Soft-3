package q05;

public class Teste {
    public static void main(String[] args) {
        Transacao t = new Transacao(41, TipoTransacao.DEPOSITO);
        CalculoTaxas ct = new CalculoTaxas(t);
        SalvaArquivo sa = new SalvaArquivo(t);


        //System.out.println("Resultado => " + ct.calcularTaxas());
        sa.salvarTransacao();
    }
}

