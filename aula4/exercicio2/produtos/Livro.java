package aula4.exercicio2.produtos;

public class Livro extends Produto {
  private String autores;
  private String editora;

  public Livro(String titulo, String dataDePublicacao, String autores, double precoDeVenda, String editora) {
    super(titulo, dataDePublicacao, precoDeVenda);
    this.autores = autores;
    this.editora = editora;
  }

  @Override
  public void imprimeInfo() {
    super.imprimeInfo();
    System.out.printf("4. Autores: %s,%n", autores);
    System.out.printf("5. Editora: %s.%n", editora);
  }

  @Override
  public String getTipo() {
    return "Livro";
  }

  public String getAutores() {
    return autores;
  }

  public void setAutores(String autores) {
    this.autores = autores;
  }

  public String getEditora() {
    return editora;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }
}
