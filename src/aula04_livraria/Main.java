package aula04_livraria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Criando gêneros:
        ArrayList<String> generos1 = new ArrayList<>();
        generos1.add("Auto-ajuda");

        ArrayList<String> generos2 = new ArrayList<>();
        generos2.add("Ficção");
        generos2.add("Suspense");

        ArrayList<String> generos3 = new ArrayList<>();
        generos3.add("Ação");

        ArrayList<String> generos4 = new ArrayList<>();
        generos4.add("Erótico");

        //Criando produtos:
        Produto livro1 = new Livro("Tríade do Tempo", 35, generos1, "Christian Barbosa", "Ediouro",200);
        Produto livro2 = new Livro("Harry Potter", 35, generos2, "J. K. Rowling", "Rocco",1000);
        Produto jogo1 = new Jogo("Donkey Kong Country", 35, generos3,"Nintendo","Rare",10);
        Produto jogo2 = new Jogo("Super Mario Bros 3", 40, generos3,"Nintendo","Nintendo",50);

        //Adicionando produtos no estoque:
        ArrayList<Produto> produtos = new ArrayList<>();
        Estoque estoque = new Estoque();

        estoque.interagirEstoque(new AdicionarProduto(),livro1);
        estoque.interagirEstoque(new AdicionarProduto(),livro2);
        estoque.interagirEstoque(new AdicionarProduto(),jogo1);
        estoque.interagirEstoque(new AdicionarProduto(),jogo2);

        //Removendo produtos do estoque:
        estoque.interagirEstoque(new RemoverProduto(),livro1);

        //Modificando produtos do estoque:
        livro2.setQuantidade(1100);
        estoque.interagirEstoque(new AlterarProduto(),livro2);

        //Vizualizando produtos:
        estoque.visualizarEstoque(new VerProdutosEstoque());
        estoque.visualizarEstoque(new VerProdutosEstoqueCatgoria());
        estoque.visualizarEstoque(new VerProdutoID());
        new QtdProdutosTipo<>().executar(estoque, new Livro());
        new QtdProdutosTipo<>().executar(estoque, new Jogo());

        //CAIXA:
        Caixa caixa = new Caixa(100000);

        //Comprando produtos:
        Comprar.comprar(caixa,estoque,livro2,100);

        estoque.visualizarEstoque(new VerProdutosEstoque());

        //Produto adulto:
        Produto livroAdulto = new LivroAdulto("50 Tons de Cinza", 35, generos4, "Zeca Nobre", "PlayX",10);
        estoque.interagirEstoque(new AdicionarProduto(),livroAdulto);
        estoque.visualizarEstoque(new VerProdutosEstoque());

        Comprar.comprar(caixa,estoque,livroAdulto,100);
    }
}
