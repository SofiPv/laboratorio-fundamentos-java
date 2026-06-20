package dev.sofipv.fundamentos.ciclos;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class NumerosImpares {
    public static void run(Scanner scanner) {
        int limite = ConsoleUtils.readInt(scanner, "Imprimir impares desde 1 hasta: ");

        if (limite < 1) {
            System.out.println("El límite debe ser mayor o igual a 1.");
            return;
        }

        for (int i = 1; i <= limite; i += 2) {
            System.out.println(i);
        }
    }
}
