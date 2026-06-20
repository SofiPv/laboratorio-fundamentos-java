package dev.sofipv.fundamentos.fundamentos;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class OperadoresDemo {
    public static void run(Scanner scanner) {
        double a = ConsoleUtils.readDouble(scanner, "Primer número: ");
        double b = ConsoleUtils.readDouble(scanner, "Segundo número: ");

        System.out.println("Suma: " + ConsoleUtils.format(a + b));
        System.out.println("Resta: " + ConsoleUtils.format(a - b));
        System.out.println("Multiplicación: " + ConsoleUtils.format(a * b));

        if (b != 0) {
            System.out.println("División: " + ConsoleUtils.format(a / b));
            System.out.println("Módulo: " + ConsoleUtils.format(a % b));
        } else {
            System.out.println("División y módulo no disponibles porque el segundo número es 0.");
        }
    }
}
