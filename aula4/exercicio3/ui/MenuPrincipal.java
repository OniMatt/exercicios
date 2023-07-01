package aula4.exercicio3.ui;

import aula4.exercicio3.teclado.Teclado;

import java.util.List;
import java.util.stream.IntStream;

import aula4.exercicio3.Hamburgueria;
import aula4.exercicio3.cliente.Cliente;
import aula4.exercicio3.pedido.Pedido;

public class MenuPrincipal {
  static Hamburgueria h = new Hamburgueria("McSyo");

  public static void menuPrincipal() {
    boolean sair = false;

    while(!sair) {
      imprimeMenuPrincipal();

      int opcao = Teclado.leInt("Escolha uma opção.");
      //acho q ta tudo errado e o pedido tem que ser criado na hamburgueria
      switch(opcao) {
        case (1):
          Pedido pedido = new Pedido(Cliente.cadastraCliente(), h.getCardapio());
          h.getPedidos().add(pedido);
          
          break;
        case (2):
          Pedido pedido1 = new Pedido(getCliente(), h.getCardapio());
          h.getPedidos().add(pedido1);
          break;
        case (3):

      }
    }

  }

  public static void imprimeMenuPrincipal() {
    System.out.println(" ==========[ Menu ]==========");
    System.out.println("|                            |");
    System.out.println("| 1. Cadastrar cliente.      |");
    System.out.println("| 2. Montar pedido.          |");
    System.out.println("| 3. Atualiza pedido.        |");
    System.out.println("| 4. Venda.                  |");
    System.out.println("| 5. Sair.                   |");
    System.out.println("|                            |");
    System.out.println(" =============================");
  }

  public static Cliente getCliente() {
    List<Cliente> clientes = h.getClientes();

    if(!clientes.isEmpty()) {
      System.out.println("Clientes: ");
      IntStream.range(0, clientes.size())
        .forEach(i -> System.out.printf("%d. %s.", i, clientes.get(i).toString()));
      
      int opcao = Teclado.leInt("Escolha um cliente.");
      return clientes.get(opcao);
    } else
      System.out.println("Não temos clientes ainda.");
      return null;
  }
}
