package dev.sofipv.fundamentos.calculadoras;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class ConversionPesosDolares {
    public static void run(Scanner scanner) {
        double pesos = ConsoleUtils.readDouble(scanner, "Cantidad en pesos: ");
        double tipoCambio = ConsoleUtils.readDouble(scanner, "Tipo de cambio pesos por dólar: ");

        if (tipoCambio <= 0) {
            System.out.println("El tipo de cambio debe ser mayor que 0.");
            return;
        }

        double dolares = pesos / tipoCambio;
        System.out.println("Equivalente en dólares: " + ConsoleUtils.format(dolares));
    }
}
