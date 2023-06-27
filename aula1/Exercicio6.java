package aula1;

public class Exercicio6 {
  //nao entendi mt bem o que eu fiz
  public static void multiplos( int[] ints ) {
    int multiploAtual = 1;

    for( int i = 0; i < ints.length; i++ ) {
      if( ints[i] % 10 != 0 && multiploAtual == 1 ) {
        System.out.println( ints[i] );
      } else if( ints[i] % 10 == 0 ) {
          multiploAtual = ints[i];
          System.out.println( ints[i] );
      } else 
        System.out.println( multiploAtual );
    }
  }
  public static void main(String[] args) {
    int[] ints = { 1, 10, 11, 20, 12 };
    multiplos( ints );
  }
}
