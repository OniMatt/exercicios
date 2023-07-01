package aula4.exercicio1;

public class Elevador {
  private int andarAtual;
  private int totalAndares;
  private int capacidadePessoas;
  private int quantPessoas;

  public Elevador( int andarAtual, int totalAndares, int capacidadePessoas, int quantPessoas ) {
    this.andarAtual = andarAtual;
    this.totalAndares = totalAndares;
    this.capacidadePessoas = capacidadePessoas;
    this.quantPessoas = quantPessoas;
  }

  public static Elevador inicializa( int totalAndares, int capacidadePessoas ) {
    System.out.printf("Inicialização: %n===[ Térreo ]===%n   0 pessoas.%n");
    return new Elevador( 0, totalAndares, capacidadePessoas, 0 );
  }

  public void entra() {
    System.out.printf("%nEntra: %n");
    if( quantPessoas < capacidadePessoas ) {
      quantPessoas += 1;
      System.out.printf( "Mais uma pessoa entrou no elevador.%n" );
      imprimeInfo();
    } else 
      System.out.printf( "Não cabem mais pessoas no elevador.%n" );
  }

  public void sai() {
    System.out.printf("%nSai: %n");
    if( quantPessoas > 0 ) {
      quantPessoas -= 1;
      System.out.printf( "Uma pessoa saiu do elevador.%n" );
      imprimeInfo();
    } else
      System.out.printf( "O elevador está vazio.%n" );
  }

  public void sobe() {
    System.out.printf( "%nSobe: %n" );
    if( andarAtual < totalAndares ) {
      andarAtual += 1;
      imprimeInfo();
    } else
      System.out.printf( "Já estamos no último andar!%n");
  }

  public void desce() {
    System.out.printf("%nDesce: %n");
    if( andarAtual > 0 ) {
      andarAtual -= 1;
      imprimeInfo();
    } else
      System.out.printf( "Já estamos no térreo!%n" );
  }

  public void imprimeInfo() {
    if(andarAtual == 0) 
      System.out.printf( "===[ Térreo ]===%n   %d pessoa(s).%n", quantPessoas );
    else
      System.out.printf( "===[ Andar %s ]===%n   %d pessoa(s).%n", andarAtual, quantPessoas );
  }

  public int getAndarAtual() {
    return andarAtual;
  }

  public void setAndarAtual( int andarAtual ) {
    this.andarAtual = andarAtual;
  }

  public int getTotalAndares() {
    return totalAndares;
  }

  public void setTotalAndares( int totalAndares ) {
    this.totalAndares = totalAndares;
  }

  public int getCapacidadePessoas() {
    return capacidadePessoas;
  }

  public void setCapacidadePessoas( int capacidadePessoas ) {
    this.capacidadePessoas = capacidadePessoas;
  }

  public int getQuantPessoas() {
    return quantPessoas;
  }

  public void setQuantPessoas( int quantPessoas ) {
    this.quantPessoas = quantPessoas;
  }
}
