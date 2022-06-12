package aula04_livraria;

import java.util.ArrayList;

public interface IAcaoProduto<T extends Produto>  {
    <T extends Produto> ArrayList<T> executar(ArrayList<T> myList, T produto);
}
