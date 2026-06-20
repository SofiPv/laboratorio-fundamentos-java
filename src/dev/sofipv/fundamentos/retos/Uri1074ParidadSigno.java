package dev.sofipv.fundamentos.retos;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class Uri1074ParidadSigno {
    public static void run(Scanner scanner) {
        int casos = ConsoleUtils.readInt(scanner, "Cantidad de casos: ");

        for (int i = 1; i <= casos; i++) {
            int numero = ConsoleUtils.readInt(scanner, "Número " + i + ": ");

            if (numero == 0) {
                System.out.println("NULL");
                continue;
            }

            String paridad = numero % 2 == 0 ? "EVEN" : "ODD";
            String signo = numero > 0 ? "POSITIVE" : "NEGATIVE";

            System.out.println(paridad + " " + signo);
        }
    }
}
