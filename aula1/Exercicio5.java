package aula1;

public class Exercicio5 {
  public static void apenasUmEQuatro( int[] ints ) {
    boolean apenas1e4 = true;

    if( ints.length <= 1 )
      apenas1e4 = false;
    else {
      for ( int i : ints ) {
        if( i != 1 && i != 4 )
          apenas1e4 = false;
      }
    }

    System.out.println( apenas1e4 ? "O array contem apenas 1 e 4" : "O array não contem apenas 1 e 4" );
  }
  public static void main( String[] args ) {
    int[] ints = { 1,5,4 };
    apenasUmEQuatro( ints );
    int[] ints2 = { 1,4 };
    apenasUmEQuatro( ints2 );
  }
}
