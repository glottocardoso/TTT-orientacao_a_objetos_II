package aula04_livraria;

import java.time.LocalDate;

public class VerificarComprador {
    public static boolean executar(Comprador comprador){
        return comprador.dataNascimento.compareTo(LocalDate.now()) > 365 * 18;
    }
}
