package dev.sofipv.fundamentos.common;

import java.util.Scanner;

public final class ConsoleUtils {
    private ConsoleUtils() {
    }

    public static int readInt(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException error) {
                System.out.println("Entrada inválida. Escribe un número entero.");
            }
        }
    }

    public static double readDouble(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim().replace(",", ".");

            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException error) {
                System.out.println("Entrada inválida. Escribe un número decimal válido.");
            }
        }
    }

    public static String readText(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println("La respuesta no puede quedar vacía.");
        }
    }

    public static boolean readYesNo(Scanner scanner, String message) {
        while (true) {
            String answer = readText(scanner, message + " (s/n): ").toLowerCase();

            if (answer.equals("s") || answer.equals("si") || answer.equals("sí")) {
                return true;
            }

            if (answer.equals("n") || answer.equals("no")) {
                return false;
            }

            System.out.println("Responde con s o n.");
        }
    }

    public static void printTitle(String title) {
        String line = "=".repeat(Math.max(12, title.length() + 8));
        System.out.println();
        System.out.println(line);
        System.out.println("  " + title);
        System.out.println(line);
    }

    public static void pause(Scanner scanner) {
        System.out.println();
        System.out.print("Presiona Enter para continuar...");
        scanner.nextLine();
    }

    public static String format(double value) {
        if (value == Math.rint(value)) {
            return String.format("%.0f", value);
        }

        return String.format("%.4f", value);
    }
}
