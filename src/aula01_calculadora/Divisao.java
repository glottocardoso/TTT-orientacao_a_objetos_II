package aula01_calculadora;

public class Divisao implements Calculo {
    @Override
    public double calcular(double... valores) {
        double resultado = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i]==0){
                System.out.println("Não é permitido divisão por zero");
            }
            resultado = resultado/valores[i];
        }
        return resultado;
    }
}
