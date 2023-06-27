package aula1;

public class Exercicio3 {

  public static String removeVogaisSemReplace( String texto ) {
    char[] chars = texto.toCharArray();
    String stringSemVogais = "";

    for ( char c : chars ) {
      if( c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' ) {
        stringSemVogais += c;
      }  
    }

    return stringSemVogais;
  }
  public static void main( String[] args ) {
    System.out.println( "aeiou teste 123".replaceAll( "[aeiou]", "" ) );
    System.out.println( removeVogaisSemReplace( "aeiou teste 123" ) );
  }
}
