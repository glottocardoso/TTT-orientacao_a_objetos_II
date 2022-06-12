package aula04_livraria;

import java.util.ArrayList;

public class VerProdutosEstoque implements VisualizarProduto {
    @Override
    public <T extends Produto> void executar(ArrayList<T> estoque){
        System.out.println("PRODUTOS EM ESTOQUE==================================");
        for (Produto produto: estoque) {
            System.out.println(produto.toString());
        }
    }
}
