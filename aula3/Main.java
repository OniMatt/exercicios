package aula3;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Veiculo carro = new Carro("Prata", 4, "nao sei", "12345", 5);
    Veiculo moto = new Moto("Azul", 2, "carroceria de moto", "abcdef", 1000);
    Veiculo caminhao = new Caminhao("Branco", 6, "carroceria de caminhão", "a1b2c3", 30000);

    List<Veiculo> veiculos = new ArrayList<>();
    veiculos.add(carro);
    veiculos.add(moto);
    veiculos.add(caminhao);

    Sistema sistema = new Sistema(veiculos);

    for (int i = 0; i < veiculos.size(); i++) {
      sistema.getVeiculos().get(i).imprimeChassi();
      sistema.getVeiculos().get(i).imprimeTipo();
      System.out.println();
    }
  }
}
