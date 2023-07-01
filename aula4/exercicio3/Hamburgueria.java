package aula4.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import aula4.exercicio3.cliente.Cliente;
import aula4.exercicio3.pedido.*;

public class Hamburgueria {
  private String nome;
  private static List<Produto> cardapio;
  private List<Cliente> clientes;
  private List<Pedido> pedidos;

  public Hamburgueria(String nome) {
    this.nome = nome;
    Hamburgueria.cardapio = Produto.inicializaProdutos();
    clientes = new ArrayList<>();
    pedidos = new ArrayList<>();
  }

  public Hamburgueria() {
  }

  public static void imprimeCardapio() {
    IntStream.range(0, cardapio.size())
      .forEach(i -> System.out.printf("%d. %s%n", i+1, cardapio.get(i).toString()));
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Produto> getCardapio() {
    return cardapio;
  }

  public List<Cliente> getClientes() {
    return clientes;
  }

  public void setClientes(List<Cliente> clientes) {
    this.clientes = clientes;
  }

  public List<Pedido> getPedidos() {
    return pedidos;
  }

  public void setPedidos(List<Pedido> pedidos) {
    this.pedidos = pedidos;
  }

}
