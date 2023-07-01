package aula4.exercicio3.pedido;

public enum StatusEnum {
  EM_PREPARO,
  EM_TRANSITO,
  ENTREGUE;

  public static void imprimeStatus() {
    System.out.println( "1. Em preparo" );
    System.out.println( "2. Saiu para entrega" );
    System.out.println( "3. Entregue" );
  }
}
