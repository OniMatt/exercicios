package aula3;

public class Carro extends Veiculo {
  private int lugares;

  public Carro(String cor, int quantidadeDeRodas, String carroceria, String chassi, int lugares) {
    super(cor, quantidadeDeRodas, carroceria, chassi);
    this.lugares = lugares;
  }

  public int getLugares() {
    return lugares;
  }

  public void setLugares(int lugares) {
    this.lugares = lugares;
  }

  @Override
  public void imprimeTipo() {
    System.out.println("Tipo do veículo: Carro.");
  }
  
}
