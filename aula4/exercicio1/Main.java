package aula4.exercicio1;

public class Main {
  public static void main(String[] args) {
    Elevador elevador = Elevador.inicializa(10, 5);

    elevador.desce();

    elevador.sobe();

    elevador.desce();

    elevador.sai();

    elevador.entra();

    elevador.sai();

    for (int i = 0; i < elevador.getTotalAndares() + 1; i++) {
      elevador.sobe();
      elevador.entra();
    }
  }
}
