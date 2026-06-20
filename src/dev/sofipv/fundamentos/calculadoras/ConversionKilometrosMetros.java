package dev.sofipv.fundamentos.calculadoras;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class ConversionKilometrosMetros {
    public static void run(Scanner scanner) {
        double kilometros = ConsoleUtils.readDouble(scanner, "Kilómetros: ");
        double metros = kilometros * 1000;

        System.out.println(kilometros + " km equivalen a " + ConsoleUtils.format(metros) + " metros.");
    }
}
