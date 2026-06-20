package dev.sofipv.fundamentos.calculadoras;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class PromedioCalificaciones {
    public static void run(Scanner scanner) {
        double primera = ConsoleUtils.readDouble(scanner, "Primera calificación: ");
        double segunda = ConsoleUtils.readDouble(scanner, "Segunda calificación: ");
        double tercera = ConsoleUtils.readDouble(scanner, "Tercera calificación: ");

        double promedio = (primera + segunda + tercera) / 3.0;

        System.out.println("Promedio: " + ConsoleUtils.format(promedio));
        System.out.println(promedio >= 70 ? "Estado: aprobado" : "Estado: reprobado");
    }
}
