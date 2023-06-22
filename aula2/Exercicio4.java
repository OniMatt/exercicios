package aula2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio4 {
  public static void confereLista( List<String> strings ) {
    System.out.println( "Tamanho da lista: " + strings.size() );

    boolean contemJava = strings.stream().anyMatch( string -> string.equals( "java" ) );
    System.out.println( contemJava ? "java é o melhor" : "Faltou o melhor" );

    List<String> listaOrdenada = strings.stream()
      .sorted()
      .collect( Collectors.toList() );

    System.out.println( "Lista ordenada: " + listaOrdenada + "\n" );
  }
  
  public static void main( String[] args ) {
    List<String> strings = Arrays.asList( "javascript", "typescript", "c++", "java", "rust", "ruby", "python", "lua", "go" );

    confereLista( strings );

    List<String> strings2 = Arrays.asList( "javascript", "typescript", "c++", "rust", "ruby", "python", "lua", "go" );

    confereLista( strings2 );
}

}