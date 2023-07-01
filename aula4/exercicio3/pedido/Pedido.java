package aula4.exercicio3.pedido;

import java.util.List;
import java.util.stream.IntStream;

import aula4.exercicio3.Hamburgueria;
import aula4.exercicio3.cliente.Cliente;
import aula4.exercicio3.teclado.Teclado;

public class Pedido {
  private List<Produto> produtosPedido;
  private StatusEnum status;
  private Cliente cliente;

  public Pedido(List<Produto> produtos, StatusEnum status, Cliente cliente) {
    this.produtosPedido = produtos;
    this.status = status;
    this.cliente = cliente;
  }

  public Pedido() {
  }

  public Pedido(Cliente cliente, List<Produto> cardapio) {
    System.out.println("Criação de pedido: ");
    Hamburgueria.imprimeCardapio();
    boolean encerrado = false;

    while(!encerrado) {
      int opcao = Teclado.leInt("Qual produto? ");
      Produto produto = cardapio.get(opcao);
      int quant = Teclado.leInt("Quantos? ");

      IntStream.range(0, quant)
        .forEach(i -> produtosPedido.add(produto));
      System.out.printf("Adicionado %d %s(s).", quant, produto.getNome());

      encerrado = Teclado.leBoolean("Deseja encerrar o pedido?");
    }
    new Pedido(cardapio, StatusEnum.EM_PREPARO, cliente);
  }

  public void atualizaPedido() {
    
  }

  public void imprimePedido() {
    System.out.println("Pedido: ");
    produtosPedido.stream().forEach(p -> p.toString());
    System.out.println(getPrecoTotal() + "R$");  
  }

  public double getPrecoTotal() {
    return produtosPedido.stream()
      .mapToDouble(Produto::getPreco)
      .sum();
  }

  public List<Produto> getProdutosPedido() {
    return produtosPedido;
  }

  public void setProdutosPedido(List<Produto> produtos) {
    this.produtosPedido = produtos;
  }

  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }
  
  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }
  
}
