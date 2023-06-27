package aula3;

public class Moto extends Veiculo {
  public int cilindradas;

  public Moto(String cor, int quantidadeDeRodas, String carroceria, String chassi, int cilindradas) {
    super(cor, quantidadeDeRodas, carroceria, chassi);
    this.cilindradas = cilindradas;
  }

  public int getCilindradas() {
    return cilindradas;
  }

  public void setCilindradas(int cilindradas) {
    this.cilindradas = cilindradas;
  }

  @Override
  public void imprimeTipo() {
    System.out.println("Tipo do veículo: Moto.");
  }

}
