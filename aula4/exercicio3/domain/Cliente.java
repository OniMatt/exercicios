package aula4.exercicio3.domain;

public class Cliente {
  private String nome;
  private String senha;
  private String telefone;
  private String email;

  public Cliente() {
  }

  public Cliente(String nome, String senha, String telefone, String email) {
    this.nome = nome;
    this.senha = senha;
    this.telefone = telefone;
    this.email = email;
  }

  public Cliente(String nome, String telefone, String email) {
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
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

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return nome + ", e-mail: " + email + ", telefone: " + telefone + "\n";
  }
}
