package aula4.exercicio3;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import aula4.exercicio3.domain.Cliente;
import aula4.exercicio3.domain.Pedido;
import aula4.exercicio3.domain.Produto;
import aula4.exercicio3.enumeration.*;
import aula4.exercicio3.utils.Teclado;

public class Hamburgueria {
  private String nome;
  private List<Produto> cardapio;
  private List<Cliente> clientes;
  private List<Pedido> pedidos;

  public Hamburgueria( String nome ) {
    this.nome = nome;
    cardapio = Produto.inicializaProdutos();
  }

  public Hamburgueria() {
  }

  public Optional < Cliente > cadastraCliente() {
    if( getPedidos().size() >= 50 ) {
      System.out.println( "Chegamos ao limite de pedidos por hoje" );
      Teclado.pressioneEnter();
      return Optional.empty();
    }

    Cliente cliente = new Cliente(
      Teclado.leString( "Digite o nome do cliente: " ),
      Teclado.leString( "Digite o e-mail do cliente: " )
    );

    clientes.add( cliente );
    System.out.print( "\033[H\033[2J" );
    return Optional.of(cliente);
  }

  public void criaPedido( Cliente cliente ) {
    if( getPedidos().size() >= 50 ) {
      System.out.println( "Chegamos ao limite de pedidos por hoje" );
      Teclado.pressioneEnter();
      return;
    }
    Pedido pedido = new Pedido( StatusEnum.EM_PREPARO, cliente );
    boolean encerrado = false;
    System.out.println( "Criação de pedido: " );

    while (!encerrado) {
      imprimeCardapio();
      int opcao = Teclado.leInt( "Adicione um produto." );
      Produto produto = cardapio.get( opcao - 1 );
      int quant = Teclado.leInt( "Quantos " + produto.getNome() + " deseja adicionar?" );

      IntStream.range( 0, quant )
          .forEach( i -> pedido.getProdutosPedido().add( produto ) );
      System.out.printf( "Adicionado %d %s(s).%n", quant, produto.getNome() );
      System.out.print( "\033[H\033[2J" );
      pedido.imprimePedido();

      encerrado = Teclado.leBoolean( "Deseja encerrar o pedido?" );
      System.out.print( "\033[H\033[2J" );
    }
    pedidos.add( pedido );
  }

  public void atualizaPedido() {
    if( pedidos.isEmpty() ) {
      System.out.println( "Ainda não temos pedidos para atualizar." );
      Teclado.pressioneEnter();
      return;
    } 
    imprimePedidos();
    int opcao = Teclado.leInt("Escolha um pedido para atualizar. " );
    Pedido pedido = pedidos.get( opcao - 1 );

    StatusEnum.imprimeStatus();
    int status = Teclado.leInt( "Qual será o novo status do pedido? " );
    switch ( status ) {
      case ( 1 ):
        pedido.setStatus( StatusEnum.EM_PREPARO );
        System.out.println( "O pedido está em preparo" );
        System.out.println( "Enviado e-mail para " + pedido.getCliente().getEmail() );
        break;

      case ( 2 ):
        pedido.setStatus( StatusEnum.EM_TRANSITO );
        System.out.println( "O pedido saiu para entrega");
        System.out.println( "Enviado e-mail para " + pedido.getCliente().getEmail() );
        break;
        
      case ( 3 ):
        pedido.setStatus( StatusEnum.ENTREGUE );
        System.out.println( "O pedido foi entregue!" );
        System.out.println( "Enviado e-mail para " + pedido.getCliente().getEmail() );
        pedidos.remove( pedido );
    }
    Teclado.pressioneEnter();
  }

  public void imprimeCardapio() {
    IntStream.range( 0, cardapio.size() )
        .forEach( i -> System.out.printf( "%d. %s%n", i + 1, cardapio.get( i ).toString() ) );
  }

  public void imprimePedidos() {
    IntStream.range( 0, pedidos.size() )
        .forEach( i -> System.out.printf( "%d. %s.%n", i + 1, pedidos.get( i ).toString() ) );
  }

  public Optional< Cliente > getCliente() {
    if( clientes.isEmpty() ) {
      System.out.println( "Não temos clientes ainda." );
      Teclado.pressioneEnter();
      return Optional.empty();
    }
    System.out.println( "Clientes: " );
    IntStream.range( 0, clientes.size() )
        .forEach( i -> System.out.printf( "%d. %s", ( i + 1 ), clientes.get( i ).toString() ) );
    int opcao = Teclado.leInt( "Escolha um cliente." );
    Optional< Cliente > cliente = Optional.of( clientes.get( opcao - 1 ) );
    return cliente;
  }

  public String getNome() {
    return nome;
  }

  public void setNome( String nome ) {
    this.nome = nome;
  }

  public List<Produto> getCardapio() {
    return cardapio;
  }

  public List<Cliente> getClientes() {
    return clientes;
  }

  public void setClientes( List<Cliente> clientes ) {
    this.clientes = clientes;
  }

  public List<Pedido> getPedidos() {
    return pedidos;
  }

  public void setPedidos( List<Pedido> pedidos ) {
    this.pedidos = pedidos;
  }

}
