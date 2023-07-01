package aula4.exercicio2.produtos;

import java.util.List;

import aula4.exercicio2.produtos.subprodutos.Reportagem;

public class Jornal extends Produto {
  private List<Reportagem> reportagens;

  public Jornal(String titulo, String dataDePublicacao, double precoDeVenda, List<Reportagem> reportagens) {
    super(titulo, dataDePublicacao, precoDeVenda);
    this.reportagens = reportagens;
  }

  public Jornal(List<Reportagem> reportagens) {
    this.reportagens = reportagens;
  }

  @Override
  public void imprimeInfo() {
    System.out.printf("1. Título: %s,%n", getTitulo());
    System.out.printf("2. Data de publicação: %s,%n", getDataDePublicacao());
    System.out.printf("3. Preço: %sR$.%n", getPrecoDeVenda());
  }

  @Override
  public String getTipo() {
    return "Jornal";
  }

  public List<Reportagem> getReportagens() {
    return reportagens;
  }

  public void setReportagens(List<Reportagem> reportagens) {
    this.reportagens = reportagens;
  }

}
