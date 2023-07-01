package aula4.exercicio3.cliente;

import aula4.exercicio2.teclado.Teclado;

public class Cliente {
  private String nome;
  private String senha;
  private String email;

  public Cliente(String nome, String senha, String email) {
    this.nome = nome;
    this.senha = senha;
    this.email = email;
  }

  public Cliente(String nome, String email) {
    this.nome = nome;
    this.email = email;
  }

  public Cliente() {
  }

  public static Cliente cadastraCliente() {
    String nome = Teclado.leString("Digite o nome do cliente: ");
    String email = Teclado.leString("Digite o e-mail do cliente: ");
    
    return new Cliente(nome, email);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return nome + ", e-mail: " + email + "\n";
  }
}
