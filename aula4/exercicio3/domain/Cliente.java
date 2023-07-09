package aula4.exercicio3.domain;

public class Cliente {
  private String nome;
  private String senha;
  private String email;

  public Cliente( String nome, String senha, String email ) {
    this.nome = nome;
    this.senha = senha;
    this.email = email;
  }

  public Cliente( String nome, String email ) {
    this.nome = nome;
    this.email = email;
  }

  public Cliente() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome( String nome ) {
    this.nome = nome;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha( String senha ) {
    this.senha = senha;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail( String email ) {
    this.email = email;
  }

  @Override
  public String toString() {
    return nome + ", e-mail: " + email + "\n";
  }
}
