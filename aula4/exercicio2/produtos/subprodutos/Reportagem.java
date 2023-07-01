package aula4.exercicio2.produtos.subprodutos;

import java.util.ArrayList;
import java.util.List;

public class Reportagem {
  private String titulo;
  private String autores;
  private String texto;

  public Reportagem(String titulo, String autores, String texto) {
    this.titulo = titulo;
    this.autores = autores;
    this.texto = texto;
  }

  public Reportagem() {
  }

  public static List<Reportagem> inicializaReportagens() {
    List<Reportagem> reportagens = new ArrayList<>();
    Reportagem r1 = new Reportagem("Introdução ao Jornal Explosivo.", "Osama bin Laden", "Buuuuum.");
    Reportagem r2 = new Reportagem("Bomba Atômica.", "Robert Oppenheimer", "Oppenheimer nos cinemas 20 de julho");
    reportagens.add(r1);
    reportagens.add(r2);
    return reportagens;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutores() {
    return autores;
  }

  public void setAutores(String autores) {
    this.autores = autores;
  }

  public String getTexto() {
    return texto;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }


}
