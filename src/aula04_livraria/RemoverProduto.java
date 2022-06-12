package aula04_livraria;

import java.util.ArrayList;

public class RemoverProduto implements IAcaoProduto {
    @Override
    public ArrayList executar(ArrayList myList, Produto produto) {
        myList.remove(produto);
        return myList;
    }
}
