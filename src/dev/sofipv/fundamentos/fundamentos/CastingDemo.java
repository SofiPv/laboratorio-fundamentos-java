package dev.sofipv.fundamentos.fundamentos;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class CastingDemo {
    public static void run(Scanner scanner) {
        double decimal = ConsoleUtils.readDouble(scanner, "Escribe un número decimal: ");
        int entero = (int) decimal;
        long redondeado = Math.round(decimal);

        System.out.println("Valor original double: " + decimal);
        System.out.println("Casting explícito a int: " + entero);
        System.out.println("Redondeo con Math.round: " + redondeado);

        int base = ConsoleUtils.readInt(scanner, "Escribe un entero para convertirlo a double: ");
        double convertido = base;
        System.out.println("Casting implícito de int a double: " + convertido);
    }
}
