package dev.sofipv.fundamentos.ciclos;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class ContadorParesImpares {
    public static void run(Scanner scanner) {
        int cantidad = ConsoleUtils.readInt(scanner, "Cantidad de números a clasificar: ");
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 1; i <= cantidad; i++) {
            int numero = ConsoleUtils.readInt(scanner, "Número " + i + ": ");

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
    }
}
