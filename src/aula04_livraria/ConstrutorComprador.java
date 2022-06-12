package aula04_livraria;

import java.time.LocalDate;
import java.util.Scanner;

public class ConstrutorComprador {
    public static Comprador executar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Produto destinado a adultos! Por favor informe os seguintes dados: ");

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("R.G.: ");
        String rg = sc.nextLine();

        System.out.println("CPF: ");
        String cpf = sc.nextLine();

        System.out.println("Data Nascimento - Dia: ");
        int dia = sc.nextInt();

        System.out.println("Data Nascimento - Mês: ");
        int mes = sc.nextInt();

        System.out.println("Data Nascimento - Ano: ");
        int ano = sc.nextInt();

        return new Comprador(nome,rg,cpf,dia,mes,ano);
    }
}
