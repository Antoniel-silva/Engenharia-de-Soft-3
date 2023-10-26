package q03;

public class Carro { 
    double quantidadeCombustivel; 
    double capacidadeMaxima = 50; // em litros 
    
    public double getQuantidadeCombustivel() { 
        return this.quantidadeCombustivel; 
    } 
    
    public double getCapacidadeMaxima() { 
        return this.capacidadeMaxima; 
    } 

    public void reabastecerSeNecessario(int quantidade) { 
        if (this.getQuantidadeCombustivel() < this.getCapacidadeMaxima() * 0.1) { 
            if ((this.getQuantidadeCombustivel() + quantidade)<= this.capacidadeMaxima){ 
                this.quantidadeCombustivel += quantidade; 
                System.out.println("Deu certo!");
            } else { 
                System.out.println("Capacidade máxima do tanque ultrapassada."); 
            } 
        } 
    }
}