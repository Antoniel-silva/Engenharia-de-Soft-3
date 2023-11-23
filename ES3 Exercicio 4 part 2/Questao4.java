//Proponha um exemplo que também viola o LISP e exiba sua solução.

//Outro exemplo é com a figura geométrica quadrado:


class Quadrado {
    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
}

class Retangulo extends Quadrado {
    @Override
    public void setLado(double lado) {
        super.setLado(lado);
    }

    @Override
    public double getLado() {
        return super.getLado();
    }
}

/*temos uma classe Quadrado com métodos para definir e obter o lado do quadrado. 
A classe Retangulo estende Quadrado, mas anula os métodos setLado e getLado e isso viola o LSP, 
pois a condição que um quadrado tem todos os lados iguais é quebrada pela subclasse Retangulo.*/

//Resoluçao

interface Forma {
    double calcularArea();
}

class Quadrado implements Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }
}

class Retangulo implements Forma {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return comprimento * largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }
}

/*Aqui introduzimos uma interface Forma que define o método calcularArea(). 
As classes quadrado e retangulo implementam essa interface, cada uma fornecendo sua própria 
implementação para calcular a área assim evitamos a violação do LSP e fornecemos uma estrutura mais flexível e coerente.*/