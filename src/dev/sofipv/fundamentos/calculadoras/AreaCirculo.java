package dev.sofipv.fundamentos.calculadoras;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class AreaCirculo {
    public static void run(Scanner scanner) {
        double radio = ConsoleUtils.readDouble(scanner, "Radio del círculo: ");

        if (radio < 0) {
            System.out.println("El radio no puede ser negativo.");
            return;
        }

        double area = Math.PI * radio * radio;
        System.out.println("Área del círculo: " + ConsoleUtils.format(area));
    }
}
