package aula3;

public abstract class Veiculo {
  private String cor;
  private int quantidadeDeRodas;
  private String carroceria;
  private String chassi;

  public Veiculo(String cor, int quantidadeDeRodas, String carroceria, String chassi) {
    this.cor = cor;
    this.quantidadeDeRodas = quantidadeDeRodas;
    this.carroceria = carroceria;
    this.chassi = chassi;
  }

  public void imprimeChassi() {
    System.out.printf("Chassi do veículo: %s.%n", this.chassi);
  }

  public abstract void imprimeTipo();

  public String getCor() {
    return cor;
  }

  public int getQuantidadeDeRodas() {
    return quantidadeDeRodas;
  }

  public String getCarroceria() {
    return carroceria;
  }

  public String getChassi() {
    return chassi;
  }

}
