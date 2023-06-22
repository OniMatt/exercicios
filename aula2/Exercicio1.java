package aula2;

public class Exercicio1 {
  public static void calcula( int a, int b ) {
    int soma = a + b;
    int subtracao = a - b;
    int multiplicacao = a * b;
    float divisao = ( float )a / b;
    int resto = a % b;

    System.out.println( "Soma: " + soma );
    System.out.println( "Subtração: " + subtracao );
    System.out.println( "Multiplicação: " + multiplicacao);
    System.out.println( "Divisão: " + divisao);
    System.out.println( "Resto: " + resto);
  }

  public static void main( String[] args ) {
    calcula( 50, 20 );
  }
}