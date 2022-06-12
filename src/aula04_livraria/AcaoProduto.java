package aula04_livraria;

import java.util.ArrayList;
import java.util.List;

public interface AcaoProduto <T extends Produto>  {
    <T extends Produto> ArrayList<T> executar(ArrayList<T> myList, T produto);
}
