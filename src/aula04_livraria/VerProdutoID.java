package aula04_livraria;

import java.util.ArrayList;
import java.util.Scanner;

public class VerProdutoID implements VisualizarProduto {

    @Override
    public <T extends Produto> void executar(ArrayList<T> estoque){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o id do produto a ser visualizado: ");
        int id = sc.nextInt();

        Produto produtoAtual;
        for (int i = 0; i < estoque.size(); i++) {
            produtoAtual = estoque.get(i);
            if (produtoAtual.id == id){
                System.out.println(produtoAtual);;
            }
        }
    }
}
