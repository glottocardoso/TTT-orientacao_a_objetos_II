package aula04_livraria;

import java.util.ArrayList;

public class VerProdutosEstoqueCatgoria implements IVisualizarProduto {
    @Override
    public <T extends Produto> void executar(ArrayList<T> estoque) {
        System.out.println("PRODUTOS EM ESTOQUE POR CATEGORIA:==================================");
        System.out.println("LIVROS:");
        for (Produto produto: estoque) {
            if (produto instanceof Livro) {
                System.out.println(produto);
            }
        }
        System.out.println("JOGOS:");
        for (Produto produto: estoque) {
            if (produto instanceof Jogo) {
                System.out.println(produto);
            }
        }
    }

}
