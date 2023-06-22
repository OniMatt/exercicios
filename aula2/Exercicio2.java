package aula2;

public class Exercicio2 {
  public static void comparaEImprime( float a, float b ) {
    if( a == b ) 
      System.out.println( "Os dois números são iguais " );
    else if ( a > b ) 
      System.out.println( a + " é maior que " + b );
    else
      System.out.println( b + " é maior que " + a );  

  }
  public static void main( String[] args ) {
    comparaEImprime( 2.5f, 2.5f );
    comparaEImprime( 2, 1 );
    comparaEImprime( 1.9f, 2 );
  }
}