package aula4.exercicio2.produtos;

import java.util.List;

import aula4.exercicio2.produtos.subprodutos.Artigo;

public class Revista extends Produto {
  private String autores;
  private String editora;
  private int numEdicao;
  private List<Artigo> artigos;

  public Revista( String titulo, String dataDePublicacao, String autores, double precoDeVenda, String editora, int numEdicao, List<Artigo> artigos ) {
    super( titulo, dataDePublicacao, precoDeVenda );
    this.autores = autores;
    this.editora = editora;
    this.numEdicao = numEdicao;
    this.artigos = artigos;
  }

  public Revista() {
  }

  @Override
  public void imprimeInfo() {
    super.imprimeInfo();
    System.out.printf("4. Autores: %s,%n", autores);
    System.out.printf("5. Editora: %s,%n", editora);
    System.out.printf("6. Edição: %s.%n", numEdicao);
  } 

  @Override
  public String getTipo() {
    return "Revista";
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

  public int getNumEdicao() {
    return numEdicao;
  }

  public void setNumEdicao(int numEdicao) {
    this.numEdicao = numEdicao;
  }

  public List<Artigo> getArtigos() {
    return artigos;
  }

  public void setArtigos(List<Artigo> artigos) {
    this.artigos = artigos;
  }

}
