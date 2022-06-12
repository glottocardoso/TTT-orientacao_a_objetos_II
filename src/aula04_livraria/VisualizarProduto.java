package aula04_livraria;

import java.util.ArrayList;

public interface VisualizarProduto {
    <T extends Produto> void executar(ArrayList<T> estoque);
}
