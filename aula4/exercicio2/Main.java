package aula4.exercicio2;

import java.util.List;

import aula4.exercicio2.menu.MenuPrincipal;
import aula4.exercicio2.produtos.*;
import aula4.exercicio2.produtos.subprodutos.*;

public class Main {
  public static void main(String[] args) {
    List<Artigo> artigos = Artigo.inicializaArtigos();
    List<Reportagem> reportagens = Reportagem.inicializaReportagens();
    
    Produto livro1 = new Livro("Livro 1", "12/06/1993", "Roberto", 1.59, "xangai");
    Produto revista1 = new Revista("Revista Syonet", "13/07/1723", "J", 2, "teste", 1, artigos);
    Produto jornal1 = new Jornal("Jornal Explosivo", "01/01/2023", 1, reportagens);

    Livraria l = new Livraria("Livraria Teste");
    l.incluiProduto(jornal1);
    l.incluiProduto(livro1);
    l.incluiProduto(revista1);

    MenuPrincipal.menuPrincipal(l);
  }
}
