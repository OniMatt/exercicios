package aula1;

public class Exercicio4 {
  public static boolean conferePrimo( int num ) {
    if( num == 1 ) 
      return false;

    for( int i = 2; i < num; i++ ) {
      if( num % i == 0 )
        return false;
    }
    return true;
  }
  public static void main( String[] args ) {
    System.out.println( conferePrimo( 9 ) );
    System.out.println( conferePrimo( 11 ) );
  }
}
