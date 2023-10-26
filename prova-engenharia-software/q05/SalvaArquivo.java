package q05;

import java.io.FileWriter;
import java.io.IOException;

public class SalvaArquivo {
    Transacao t;

    public SalvaArquivo(Transacao transacao) {
        this.t = transacao;
    }

    public void salvarTransacao() {
        try (FileWriter writer = new FileWriter("log_transacoes.txt", true)) {
            writer.write(
                ", Valor: " + t.getValor() +
                ", Tipo: " + t.getTipo() + 
                "Data: " + t.getDate() + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao salvar a transação: " + e.getMessage());
        }
    }
}
