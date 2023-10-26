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
        if ((this.getQuantidadeCombustivel() + quantidade) >= this.capacidadeMaxima){ 
            throw new IllegalArgumentException("Capacidade máxima do tanque ultrapassada."); 
        }  
        
        this.quantidadeCombustivel += quantidade; 
    }
}