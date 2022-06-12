package aula04_livraria;

import java.util.Scanner;

public class Menu {

    public void menu(Estoque estoque){
        System.out.println("Bem vindo à livraria LET'S CODE! O que deseja fazer?");
        System.out.println("1-Comprar");
        System.out.println("2-Modificar estoque");
        System.out.println("3-Ver um produto específico através do ID");
        System.out.println("4-Ver quantos itens de um tipo específico existem no estoque");
        System.out.println("5-Ver a listagem completa dos itens em estoque");
        System.out.println("6-Ver a listagem dos itens em estoque por categoria");

        Scanner sc = new Scanner(System.in);
        int opcaoMenu1 = sc.nextInt();

        switch (opcaoMenu1){
            case 1:
                System.out.println("Escolha o produto a ser comprado");
                System.out.println("1-Livro");
                System.out.println("2-Jogo");
                System.out.println("3-Filme");
                System.out.println("4-Álbum de Música");
                System.out.println("5-Brinquedo");
        }
    }
}
