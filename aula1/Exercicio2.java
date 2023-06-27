package aula1;

public class Exercicio2 {
  public static int par( int n ) {
    int somaPar = 0;

    for( int i = 0; i < n; i++ ) {
      if( i % 2 == 0 ) 
        somaPar += i;
    }
    return somaPar;
  }

  public static int impar( int n ) {
    int somaImpar = 0;

    for( int i = 0; i < n; i++ ) {
      if( i % 2 != 0 ) 
        somaImpar += i;
    }
    return somaImpar;
  }
  public static void main( String[] args ) {
    System.out.println( par(5 ) );
    System.out.println( impar( 5 ) );
  }
}
