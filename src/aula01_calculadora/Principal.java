package aula01_calculadora;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Calculadora:");
        System.out.println("Selecione a operação que deseja realizar:");
        System.out.println("1-Soma \n 2-Subtração \n 3-Divisão \n 4-Multiplicação");

        Scanner sc = new Scanner(System.in);
        int operacao = sc.nextInt();

        System.out.println("Digite a quantidade de números que deseja usar: ");
        int qtdNumeros = sc.nextInt();

        double[] valores = new double[qtdNumeros];

        System.out.println("Digite o primeiro valor: ");
        valores[0]=sc.nextInt();

        for (int i = 1; i < valores.length; i++) {
            int a = i+1;
            int b = qtdNumeros-1;
            System.out.println("Digite o valor "+i+"/"+b + " a ser operado:");
            valores[i]=sc.nextInt();
        }

        double resultado = 0;

        switch (operacao){
            case 1:
                Soma soma = new Soma();
                resultado = soma.calcular(valores);
                break;
            case 2:
                Subtracao subtracao = new Subtracao();
                resultado = subtracao.calcular(valores);
                break;
            case 3:
                Divisao divisao = new Divisao();
                resultado = divisao.calcular(valores);
                break;
            case 4:
                Multiplicacao multiplicacao = new Multiplicacao();
                resultado = multiplicacao.calcular(valores);
                break;

            default:
                System.out.println("Opção Inválida");
        }
        System.out.println("Resultado: "+resultado);

    }
}
