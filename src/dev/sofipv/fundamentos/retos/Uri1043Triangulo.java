package dev.sofipv.fundamentos.retos;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class Uri1043Triangulo {
    public static void run(Scanner scanner) {
        double a = ConsoleUtils.readDouble(scanner, "A: ");
        double b = ConsoleUtils.readDouble(scanner, "B: ");
        double c = ConsoleUtils.readDouble(scanner, "C: ");

        if (a + b > c && a + c > b && b + c > a) {
            double perimetro = a + b + c;
            System.out.println("Perímetro = " + ConsoleUtils.format(perimetro));
        } else {
            double area = ((a + b) * c) / 2.0;
            System.out.println("Área del trapecio = " + ConsoleUtils.format(area));
        }
    }
}
