package dev.sofipv.fundamentos.calculadoras;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class VolumenCilindro {
    public static void run(Scanner scanner) {
        double radio = ConsoleUtils.readDouble(scanner, "Radio del cilindro: ");
        double altura = ConsoleUtils.readDouble(scanner, "Altura del cilindro: ");

        if (radio < 0 || altura < 0) {
            System.out.println("Radio y altura deben ser positivos.");
            return;
        }

        double volumen = Math.PI * radio * radio * altura;
        System.out.println("Volumen del cilindro: " + ConsoleUtils.format(volumen));
    }
}
