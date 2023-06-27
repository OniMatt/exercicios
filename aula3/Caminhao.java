package aula3;

public class Caminhao extends Veiculo {
  private int capacidade;

  public Caminhao(String cor, int quantidadeDeRodas, String carroceria, String chassi, int capacidade) {
    super(cor, quantidadeDeRodas, carroceria, chassi);
    this.capacidade = capacidade;
  }

  public int getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  @Override
  public void imprimeTipo() {
    System.out.println("Tipo do veículo: Caminhão.");
  }
}
