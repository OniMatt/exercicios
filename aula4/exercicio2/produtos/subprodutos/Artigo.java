package aula4.exercicio2.produtos.subprodutos;

import java.util.ArrayList;
import java.util.List;

public class Artigo {
  private String titulo;
  private String texto;
  private String autores;

  public Artigo(String titulo, String texto, String autores) {
    this.titulo = titulo;
    this.texto = texto;
    this.autores = autores;
  }

  public Artigo() {
  }

  public static List<Artigo> inicializaArtigos() {
    List<Artigo> lista = new ArrayList<>();
    Artigo a1 = new Artigo("Como abrir uma porta.", "Passo 1. Pegar maçaneta, Passo 2. Girar, Passo 3. Empurrar porta.", "Platão");
    Artigo a2 = new Artigo("Diário Canino.", "Au au au au, au au. Au au au, au, au au.", "Antonia");
    lista.add(a1);
    lista.add(a2);
    return lista;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getTexto() {
    return texto;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }

  public String getAutores() {
    return autores;
  }

  public void setAutores(String autores) {
    this.autores = autores;
  }

  
}
