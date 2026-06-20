package dev.sofipv.fundamentos.retos;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class Uri1078TablaMultiplicar {
    public static void run(Scanner scanner) {
        int numero = ConsoleUtils.readInt(scanner, "Número: ");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", i, numero, i * numero);
        }
    }
}
