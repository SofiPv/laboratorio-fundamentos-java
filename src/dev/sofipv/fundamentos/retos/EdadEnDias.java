package dev.sofipv.fundamentos.retos;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class EdadEnDias {
    public static void run(Scanner scanner) {
        int totalDias = ConsoleUtils.readInt(scanner, "Total de días: ");

        if (totalDias < 0) {
            System.out.println("Los días no pueden ser negativos.");
            return;
        }

        int anios = totalDias / 365;
        int resto = totalDias % 365;
        int meses = resto / 30;
        int dias = resto % 30;

        System.out.println(anios + " año(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " día(s)");
    }
}
