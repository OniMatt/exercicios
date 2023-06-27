package aula1;

public class Aluno {
  double[] notas;

  public Aluno(double[] notas) {
    this.notas = notas;
  }

  public Aluno() {}

  public double[] getNotas() {
    return notas;
  }

  public void setNotas(double[] notas) {
    this.notas = notas;
  }
}
