package aula04_livraria;

import java.time.LocalDate;

public class VerificarMaioridade {
    public static boolean executar(Comprador comprador){
        int diaAtual = LocalDate.now().getDayOfYear();
        int anoAtual = LocalDate.now().getYear();

        int totalDiasVividos = (anoAtual-comprador.anoNascimento-1)*365+diaAtual;
        System.out.println("Total de dias vividos = " + totalDiasVividos);

        return totalDiasVividos>365*18;
    }
}
