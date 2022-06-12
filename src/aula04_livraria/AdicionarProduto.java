package aula04_livraria;

import java.util.ArrayList;

public class AdicionarProduto <T extends Produto> implements IAcaoProduto {

    /*
    public <T extends Produto> List<T> executar(List<T> myList, T produto){
        myList.add(produto);
        return myList;
    }
     */

    @Override
    public ArrayList executar(ArrayList myList, Produto produto) {
        myList.add(produto);
        return myList;
    }
}

