package aula04_livraria;

import java.util.ArrayList;

public interface IVisualizarProduto {
    <T extends Produto> void executar(ArrayList<T> estoque);
}
