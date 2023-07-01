package aula4.exercicio2.produtos;

public abstract class Produto {
  private String titulo;
  private String dataDePublicacao;
  private double precoDeVenda;

  public Produto( String titulo, String dataDePublicacao, double precoDeVenda ) {
    this.titulo = titulo;
    this.dataDePublicacao = dataDePublicacao;
    this.precoDeVenda = precoDeVenda;
  }

  public Produto() {
  }

  public void imprimeInfo() {
    System.out.printf("1. Título: %s,%n", titulo);
    System.out.printf("2. Data de publicação: %s,%n", dataDePublicacao);
    System.out.printf("3. Preço: %sR$,%n", precoDeVenda);
  }

  public abstract String getTipo();

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo( String titulo ) {
    this.titulo = titulo;
  }

  public String getDataDePublicacao() {
    return dataDePublicacao;
  }

  public void setDataDePublicacao( String dataDePublicacao ) {
    this.dataDePublicacao = dataDePublicacao;
  }

  public double getPrecoDeVenda() {
    return precoDeVenda;
  }

  public void setPrecoDeVenda( double precoDeVenda ) {
    this.precoDeVenda = precoDeVenda;
  }

}
