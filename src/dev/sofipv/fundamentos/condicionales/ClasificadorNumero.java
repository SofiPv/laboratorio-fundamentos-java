package dev.sofipv.fundamentos.condicionales;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class ClasificadorNumero {
    public static void run(Scanner scanner) {
        int numero = ConsoleUtils.readInt(scanner, "Número entero: ");

        String paridad = numero % 2 == 0 ? "par" : "impar";
        String signo;

        if (numero > 0) {
            signo = "positivo";
        } else if (numero < 0) {
            signo = "negativo";
        } else {
            signo = "cero";
        }

        System.out.println("El número es " + paridad + " y " + signo + ".");
    }
}
