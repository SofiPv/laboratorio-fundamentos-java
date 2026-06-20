package dev.sofipv.fundamentos.condicionales;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class ValidadorTriangulo {
    public static void run(Scanner scanner) {
        double a = ConsoleUtils.readDouble(scanner, "Lado A: ");
        double b = ConsoleUtils.readDouble(scanner, "Lado B: ");
        double c = ConsoleUtils.readDouble(scanner, "Lado C: ");

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Los lados deben ser mayores que cero.");
            return;
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("No forman un triángulo.");
            return;
        }

        if (a == b && b == c) {
            System.out.println("Triángulo equilátero.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triángulo isósceles.");
        } else {
            System.out.println("Triángulo escaleno.");
        }
    }
}
