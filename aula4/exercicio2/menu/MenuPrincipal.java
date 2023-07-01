package aula4.exercicio2.menu;

import aula4.exercicio2.Livraria;
import aula4.exercicio2.teclado.Teclado;

public class MenuPrincipal {
  public static void menuPrincipal(Livraria l) {
    boolean sair = false;
    while (!sair) {
      boolean opcaoValida = false;
      imprimeMenu();

      while (!opcaoValida) {
        int opcao = Teclado.leInt("Escolha uma opção.");

        switch (opcao) {
          case (1):
            l.alteraProduto();
            opcaoValida = true;
            break;
          case (2):
            l.listaItens();
            opcaoValida = true;
            break;
          case (3):
            l.listaItensAVenda();
            opcaoValida = true;
            break;
          case (4):
            if(!l.getProdutos().isEmpty()) {
              l.venda();
              opcaoValida = true;
            } else 
              System.out.println("Não temos produtos para vender no momento.");
            break;
          case (5):
            System.exit(0);
            break;
          default:
            break;
        }
      }
    }
  }

  public static void imprimeMenu() {
    System.out.println(" ==========[ Menu ]==========");
    System.out.println("|                            |");
    System.out.println("| 1. Alterar produto.        |");
    System.out.println("| 2. Listagem simples.       |");
    System.out.println("| 3. Produtos à venda.       |");
    System.out.println("| 4. Venda.                  |");
    System.out.println("| 5. Sair.                   |");
    System.out.println("|                            |");
    System.out.println(" =============================");

  }
}
