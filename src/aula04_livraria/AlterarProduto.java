package aula04_livraria;

import java.util.ArrayList;

public class AlterarProduto <T extends Produto> implements IAcaoProduto {

    @Override
    public ArrayList<T> executar(ArrayList myList, Produto novoProduto) {
        T produtoAtual;
        for (int i = 0; i < myList.size(); i++) {
            produtoAtual = (T) myList.get(i);
            if (produtoAtual.id == novoProduto.id){
                myList.set(i,novoProduto);
            }
        }
        return myList;
    }
}
