package aula2;

public class Exercicio3 {
  public static void confereNome( String nome ) {
    boolean nomeCorreto = nome.length() > 10 && nome.toUpperCase().contains( "JAVA" );
    System.out.println( nomeCorreto ? "Sim" : "Não" );
    
  }
  public static void main( String[] args ) {
    confereNome( "Matheus java junior da silva" );
    confereNome( "Não contém o melhor" );
  }
}