package dev.sofipv.fundamentos.condicionales;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class NumeroPositivoNegativo {
    public static void run(Scanner scanner) {
        double numero = ConsoleUtils.readDouble(scanner, "Número: ");

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
}
