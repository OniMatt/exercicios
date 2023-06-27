package aula3;

import java.util.List;

public class Sistema {
  List<Veiculo> veiculos;

  public Sistema(List<Veiculo> veiculos) {
    this.veiculos = veiculos;
  }

  public List<Veiculo> getVeiculos() {
    return veiculos;
  }

  public void setVeiculos(List<Veiculo> veiculos) {
    this.veiculos = veiculos;
  }
}
