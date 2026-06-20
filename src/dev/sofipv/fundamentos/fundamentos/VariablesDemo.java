package dev.sofipv.fundamentos.fundamentos;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class VariablesDemo {
    public static void run(Scanner scanner) {
        String nombre = ConsoleUtils.readText(scanner, "Nombre del estudiante: ");
        int semestre = ConsoleUtils.readInt(scanner, "Semestre: ");
        double promedio = ConsoleUtils.readDouble(scanner, "Promedio general: ");
        boolean activo = true;

        System.out.println();
        System.out.println("Resumen de variables:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Semestre: " + semestre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Estatus activo: " + activo);
    }
}
