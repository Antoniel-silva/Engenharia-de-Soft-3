from abc import ABC, abstractmethod

# Classe Carro com encapsulamento
class Carro:
    def __init__(self, marca, modelo):
        self._marca = marca
        self._modelo = modelo

    def get_marca(self):
        return self._marca

    def get_modelo(self):
        return self._modelo

# Interfaces para aceleração e frenagem
class IAceleracao(ABC):
    @abstractmethod
    def acelerar(self):
        pass

class IFrenagem(ABC):
    @abstractmethod
    def frear(self):
        pass

# Classe CarroEsportivo que herda de Carro e implementa IAceleracao e IFrenagem
class CarroEsportivo(Carro, IAceleracao, IFrenagem):
    def __init__(self, marca, modelo, velocidade_maxima):
        super().__init__(marca, modelo)
        self._velocidade_maxima = velocidade_maxima

    def acelerar(self):
        return "Carro esportivo acelerando rapidamente!"

    def frear(self):
        return "Carro esportivo freando bruscamente!"

# Classe CarroEconomico que herda de Carro e implementa IAceleracao e IFrenagem
class CarroEconomico(Carro, IAceleracao, IFrenagem):
    def __init__(self, marca, modelo, consumo):
        super().__init__(marca, modelo)
        self._consumo = consumo

    def acelerar(self):
        return "Carro econômico acelerando de forma eficiente."

    def frear(self):
        return "Carro econômico freando suavemente."

# Função para interagir com diferentes tipos de carros
def conduzir(carro):
    print("Marca:", carro.get_marca())
    print("Modelo:", carro.get_modelo())
    print("Aceleração:", carro.acelerar())
    print("Frenagem:", carro.frear())
    print()

# Criar instâncias dos carros
carro_esportivo = CarroEsportivo("Volkswagem", "Golf", 200)
carro_economico = CarroEconomico("Toyota", "Etios", 130)

# Chamar a função "conduzir" com diferentes tipos de carros
conduzir(carro_esportivo)
conduzir(carro_economico)
