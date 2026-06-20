package dev.sofipv.fundamentos.ciclos;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class PasswordSimulado {
    private static final int PASSWORD = 2002;

    public static void run(Scanner scanner) {
        int intentos = 0;

        while (true) {
            int clave = ConsoleUtils.readInt(scanner, "Contraseña numérica: ");
            intentos++;

            if (clave == PASSWORD) {
                System.out.println("Acceso permitido. Intentos usados: " + intentos);
                break;
            }

            System.out.println("Contraseña incorrecta.");
        }
    }
}
