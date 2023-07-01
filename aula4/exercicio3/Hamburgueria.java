package aula4.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import aula4.exercicio3.cliente.Cliente;
import aula4.exercicio3.pedido.*;
import aula4.exercicio3.teclado.Teclado;

public class Hamburgueria {
  private String nome;
  private List<Produto> cardapio;
  private List<Cliente> clientes;
  private List<Pedido> pedidos;

  public Hamburgueria( String nome ) {
    this.nome = nome;
    cardapio = Produto.inicializaProdutos();
    clientes = new ArrayList<>();
    pedidos = new ArrayList<>();
  }

  public Hamburgueria() {
  }

  public Cliente cadastraCliente() {
    String nome = Teclado.leString( "Digite o nome do cliente: " );
    String email = Teclado.leString( "Digite o e-mail do cliente: " );
    System.out.println();
    Cliente cliente = new Cliente( nome, email );

    clientes.add( cliente );
    System.out.print( "\033[H\033[2J" );
    return cliente;
  }

  public Pedido criaPedido( Cliente cliente ) {
    Pedido pedido = new Pedido( StatusEnum.EM_PREPARO, cliente );

    System.out.println( "Criação de pedido: " );
    boolean encerrado = false;

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
    return pedido;
  }

  public void atualizaPedido() {
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
  }

  public void imprimeCardapio() {
    IntStream.range( 0, cardapio.size() )
        .forEach( i -> System.out.printf( "%d. %s%n", i + 1, cardapio.get( i ).toString() ) );
  }

  public void imprimePedidos() {
    IntStream.range( 0, pedidos.size() )
        .forEach( i -> System.out.printf( "%d. %s.%n", i + 1, pedidos.get( i ).toString() ) );
  }

  public Cliente getCliente() {
    if ( !clientes.isEmpty() ) {
      System.out.println( "Clientes: " );
      IntStream.range( 0, clientes.size() )
          .forEach( i -> System.out.printf( "%d. %s", ( i + 1 ), clientes.get( i ).toString() ) );

      int opcao = Teclado.leInt( "Escolha um cliente." );
      return clientes.get( opcao - 1 );
    } else
      System.out.println( "Não temos clientes ainda." );
    return null;
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
