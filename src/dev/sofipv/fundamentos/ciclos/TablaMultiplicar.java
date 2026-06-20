package dev.sofipv.fundamentos.ciclos;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class TablaMultiplicar {
    public static void run(Scanner scanner) {
        int numero = ConsoleUtils.readInt(scanner, "Número para la tabla: ");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }
    }
}
