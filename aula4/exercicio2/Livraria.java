package aula4.exercicio2;

import java.util.ArrayList;
import java.util.List;

import aula4.exercicio2.produtos.Jornal;
import aula4.exercicio2.produtos.Livro;
import aula4.exercicio2.produtos.Produto;
import aula4.exercicio2.produtos.Revista;
import aula4.exercicio2.teclado.Teclado;

public class Livraria {
  private String nome;
  private List<Produto> produtos;

  public Livraria(String nome) {
    this.nome = nome;
    this.produtos = new ArrayList<>();
  }

  public void incluiProduto(Produto produto) {
    produtos.add(produto);
  }

  public void venda() {
    List<Produto> carrinho = new ArrayList<>();
    Produto produto = null;
    double total = 0;
    boolean comprando = true;
    boolean estudante = Teclado.leBoolean("Você é estudante? (Estudantes ganham 50% de desconto em livros e revistas.)");

    while (comprando) {
      if (!produtos.isEmpty()) {
        boolean produtoValido = false;

        listaItensAVenda();
        System.out.println();

        while (!produtoValido) {
          try {
            int opcao = Teclado.leInt("Qual produto deseja adicionar a sua compra? ");
            produto = produtos.get(opcao - 1);
            produtoValido = true;
          } catch (IndexOutOfBoundsException e) {
            System.out.println("Selecione um número válido.");
          }
        }

        carrinho.add(produto);
        if (estudante && !(produto instanceof Jornal))
          total += (produto.getPrecoDeVenda() / 2.0);
        else
          total += (produto.getPrecoDeVenda());

        System.out.printf("%s foi adicionado ao seu carrinho.%n%n", produto.getTitulo());
        System.out.println("Carrinho: ");
        carrinho.stream().forEach(p -> {
          System.out.printf("%s,%n", p.getTitulo());
          produtos.remove(p);
        });
        System.out.printf("Total: %.2fR$%n", total);
        comprando = Teclado.leBoolean("Deseja adicionar mais algum produto? ");
      } else {
        System.out.println("Você comprou todo nosso estoque, parabéns!!!");
        comprando = false;
      }  
    }
    System.out.println("Compra finalizada.");
  }

  // tu vai se decepcionar com isso aqui
  public void alteraProduto() {
    Produto produto = null;
    boolean produtoValido = false;
    listaItens();
    while (!produtoValido) {
      try {
        int opcao = Teclado.leInt("Digite o número do produto que deseja alterar: ");
        produto = produtos.get(opcao - 1);
        produtoValido = true;
      } catch (IndexOutOfBoundsException e) {
        System.out.println("Selecione um número válido.");
      }
    }

    if (produto instanceof Jornal)
      alteraJornal((Jornal) produto);
    if (produto instanceof Livro)
      alteraLivro((Livro) produto);
    if (produto instanceof Revista)
      alteraRevista((Revista) produto);
  }

  public void alteraJornal(Jornal produto) {
    produto.imprimeInfo();
    System.out.println();
    boolean alterando = true;

    while (alterando) {
      int opcao = Teclado.leInt("Qual informação você deseja alterar? ");
      String alteracao = Teclado.leString("Qual será a nova informação? ");

      switch (opcao) {
        case (1):
          produto.setTitulo(alteracao);
          break;
        case (2):
          produto.setDataDePublicacao(alteracao);
          break;
        case (3):
          try {
            produto.setPrecoDeVenda(Double.parseDouble(alteracao));
          } catch (NumberFormatException e) {
            System.out.println("Número inválido. Tente de novo.");
          }
          break;
        default:
          System.out.println("Selecione uma opção existente.");
          break;
      }
      alterando = Teclado.leBoolean("Deseja continuar alterando? ");
    }
    System.out.printf("Alteração concluída.%n");
    produto.imprimeInfo();
    System.out.println();
  }

  public void alteraLivro(Livro produto) {
    produto.imprimeInfo();
    System.out.println();
    boolean alterando = true;

    while (alterando) {
      int opcao = Teclado.leInt("Qual informação você deseja alterar? ");
      String alteracao = Teclado.leString("Qual será a nova informação? ");

      switch (opcao) {
        case (1):
          produto.setTitulo(alteracao);
          break;
        case (2):
          produto.setDataDePublicacao(alteracao);
          break;
        case (3):
          try {
            produto.setPrecoDeVenda(Double.parseDouble(alteracao));
          } catch (NumberFormatException e) {
            System.out.println("Número inválido. Tente de novo.");
          }
          break;
        case (4):
          produto.setAutores(alteracao);
          break;
        case (5):
          produto.setEditora(alteracao);
          break;
        default:
          System.out.println("Selecione uma opção existente.");
          alteraLivro(produto);
      }
      alterando = Teclado.leBoolean("Deseja continuar alterando? ");
    }
    System.out.printf("Alteração concluída.%n");
    produto.imprimeInfo();
    System.out.println();
  }

  public void alteraRevista(Revista produto) {
    produto.imprimeInfo();
    System.out.println();
    boolean alterando = true;

    while (alterando) {
      int opcao = Teclado.leInt("Qual informação você deseja alterar? ");
      String alteracao = Teclado.leString("Qual será a nova informação? ");

      switch (opcao) {
        case (1):
          produto.setTitulo(alteracao);
          break;
        case (2):
          produto.setDataDePublicacao(alteracao);
          break;
        case (3):
          try {
            produto.setPrecoDeVenda(Double.parseDouble(alteracao));
          } catch (NumberFormatException e) {
            System.out.println("Número inválido. Tente de novo.");
          }
          break;
        case (4):
          produto.setAutores(alteracao);
          break;
        case (5):
          produto.setEditora(alteracao);
          break;
        case (6):
          produto.setNumEdicao(Integer.parseInt(alteracao));
          break;
        default:
          System.out.println("Selecione uma opção existente.");
          alteraRevista(produto);
      }
      alterando = Teclado.leBoolean("Deseja continuar alterando? ");
    }
    System.out.printf("Alteração concluída:%n");
    produto.imprimeInfo();
    System.out.println();
  }

  public void listaItens() {
    System.out.println("Produtos: ");
    for (int i = 0; i < produtos.size(); i++) {
      Produto produto = produtos.get(i);
      System.out.printf("%d. Tipo: %s, Título: %s.%n", (i + 1), produto.getTipo(), produto.getTitulo());
      System.out.println();
    }
  }

  public void listaItensAVenda() {
    System.out.println("Produtos à venda: ");
    for (int i = 0; i < produtos.size(); i++) {
      System.out.printf("%d: %n", (i + 1));
      produtos.get(i).getTipo();
      produtos.get(i).imprimeInfo();
      System.out.println();
    }
  }

  public void vende() {
    listaItensAVenda();

  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Produto> getProdutos() {
    return produtos;
  }

  public void setProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }

}
