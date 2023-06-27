package aula1;

import java.util.Arrays;

public class Exercicio1 {
  public static void extrato( double[] gastosMensais ) {
    double gastosTotal = Arrays.stream( gastosMensais ).sum();

    System.out.printf( "Total de gastos do Trimestre: %.2f%n", gastosTotal );
    System.out.printf( "Média de gastos mensais: %.2f%n", gastosTotal / gastosMensais.length );
  }
  public static void main( String[] args ) {
    double[] gastos = { 15000,23000,17000 };
    extrato( gastos );
  }
}
