package aula1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio7 {
  //nao sei se entendi a questão entao criei um objeto aluno q tem notas e fiz a media das notas de cada aluno
  public static void medias( List<Aluno> alunos ) {
    for ( int i = 0; i < alunos.size(); i++ ) {
      double media = Arrays.stream( alunos.get( i ).getNotas() )
        .average().getAsDouble();
      System.out.printf( "Média de notas do aluno %d: %.2f%n", ( i+1 ), media );  
    }
  }
  public static void main( String[] args ) {
    Aluno aluno1 = new Aluno( new double[]{ 10.0, 8.0, 1.0 } );
    Aluno aluno2 = new Aluno( new double[]{ 10.0, 5.0, 0.0, 1.0 } );

    List<Aluno> alunos = new ArrayList<>();

    alunos.add( aluno1 );
    alunos.add( aluno2 );

    medias( alunos );
  }
}
