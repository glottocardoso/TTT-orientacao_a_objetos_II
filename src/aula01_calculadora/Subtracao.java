package aula01_calculadora;

public class Subtracao implements Calculo{
    public double calcular(double... valores) {
        double result = valores[0];
        for (int i = 1; i < valores.length; i++) {
            result-=valores[i];
        }
        return result;
    }
}
