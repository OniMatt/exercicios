package aula4.exercicio3.ui;

import aula4.exercicio3.teclado.Teclado;

import aula4.exercicio3.Hamburgueria;
import aula4.exercicio3.cliente.Cliente;

public class MenuPrincipal {
  static Hamburgueria h = new Hamburgueria( "McSyo" );

  public static void menuPrincipal() {
    boolean sair = false;

    while ( !sair ) {
      imprimeMenuPrincipal();

      int opcao = Teclado.leInt( "Escolha uma opção." );
      // acho q ta tudo errado e o pedido tem que ser criado na hamburgueria
      switch ( opcao ) {
        case ( 1 ):
          if( h.getPedidos().size() >= 50 ) {
            System.out.println( "Chegamos ao limite de pedidos por hoje" );
            Teclado.pressioneEnter();
          } else {
          Cliente clienteTemp = h.cadastraCliente();
          boolean criarPedido = Teclado.leBoolean( "Deseja criar um pedido para este cliente? " );
          if ( criarPedido )
            h.criaPedido( clienteTemp );
          }
          break;
        case ( 2 ):
          if( h.getPedidos().size() >= 50 ) {
            System.out.println( "Chegamos ao limite de pedidos por hoje" );
            Teclado.pressioneEnter();
          } else {
            if ( !h.getClientes().isEmpty() ) {
              Cliente clienteExistente = h.getCliente();
              h.criaPedido( clienteExistente );
            } else
              System.out.println( "Você precisar ter clientes para montar um pedido." );
            Teclado.pressioneEnter();
          }
          break;
        case ( 3 ):
          if ( !h.getPedidos().isEmpty() ) {
            h.atualizaPedido();
          } else
            System.out.println( "Ainda não temos pedidos para atualizar." );
          Teclado.pressioneEnter();
          break;
        case ( 4 ):
          System.exit( 0 );
        default:
          Teclado.pressioneEnter( "Opção inválida, pressione Enter para continuar." );
      }
    }

  }

  public static void imprimeMenuPrincipal() {
    System.out.println( " ==========[ Menu ]==========" );
    System.out.println( "|                            |" );
    System.out.println( "| 1. Cadastrar cliente.      |" );
    System.out.println( "| 2. Montar pedido.          |" );
    System.out.println( "| 3. Atualiza pedido.        |" );
    System.out.println( "| 4. Fechar.                 |" );
    System.out.println( "|                            |" );
    System.out.println( " =============================" );
  }

}
