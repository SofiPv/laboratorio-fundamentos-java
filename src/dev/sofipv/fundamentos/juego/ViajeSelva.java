package dev.sofipv.fundamentos.juego;

import dev.sofipv.fundamentos.common.ConsoleUtils;
import java.util.Scanner;

public class ViajeSelva {
    public static void run(Scanner scanner) {
        ConsoleUtils.printTitle("Viaje a la Selva");
        String nombre = ConsoleUtils.readText(scanner, "Nombre del explorador: ");

        System.out.println();
        System.out.println(nombre + " despierta al borde de una selva después de una tormenta.");
        System.out.println("Tiene una brújula dañada, una cantimplora y un mapa incompleto.");

        boolean tomaMachete = ConsoleUtils.readYesNo(scanner, "Encuentras un machete oxidado. ¿Lo tomas?");
        boolean ayudaAve = ConsoleUtils.readYesNo(scanner, "Un ave queda atrapada entre ramas. ¿La ayudas?");

        System.out.println();
        System.out.println("Después de caminar, aparecen dos rutas:");
        System.out.println("1. Un sendero seco con huellas grandes.");
        System.out.println("2. Un río poco profundo que parece rodear la montaña.");
        int ruta = ConsoleUtils.readInt(scanner, "Elige ruta 1 o 2: ");

        if (ruta == 1) {
            sendero(scanner, nombre, tomaMachete, ayudaAve);
        } else if (ruta == 2) {
            rio(scanner, nombre, tomaMachete, ayudaAve);
        } else {
            System.out.println("Dudas demasiado y cae la noche. Decides montar campamento y esperar ayuda.");
        }
    }

    private static void sendero(Scanner scanner, String nombre, boolean tomaMachete, boolean ayudaAve) {
        System.out.println();
        System.out.println(nombre + " entra al sendero seco. Las huellas llevan a una cueva.");
        boolean entraCueva = ConsoleUtils.readYesNo(scanner, "¿Entras a la cueva?");

        if (!entraCueva) {
            System.out.println("Rodeas la cueva y encuentras una torre de vigilancia abandonada. Logras pedir auxilio con una radio vieja.");
            return;
        }

        if (tomaMachete) {
            System.out.println("Usas el machete para cortar lianas y abrir un paso oculto.");
            if (ayudaAve) {
                System.out.println("El ave que ayudaste aparece y vuela hacia una salida iluminada. La sigues y encuentras un campamento seguro.");
            } else {
                System.out.println("Encuentras una salida, pero pierdes el mapa. Sales de la selva al amanecer.");
            }
        } else {
            System.out.println("Sin herramienta, no puedes abrir paso. Regresas y encuentras refugio en la torre abandonada.");
        }
    }

    private static void rio(Scanner scanner, String nombre, boolean tomaMachete, boolean ayudaAve) {
        System.out.println();
        System.out.println(nombre + " sigue el río. La corriente aumenta y hay una canoa atada a un tronco.");
        boolean usaCanoa = ConsoleUtils.readYesNo(scanner, "¿Usas la canoa?");

        if (!usaCanoa) {
            System.out.println("Caminas por la orilla y encuentras frutas. Sobrevives la noche y al día siguiente ves humo de una aldea.");
            return;
        }

        if (ayudaAve) {
            System.out.println("El ave se posa frente a una desviación segura. La sigues y llegas a una aldea.");
        } else if (tomaMachete) {
            System.out.println("La canoa queda atorada. Cortas ramas con el machete y logras continuar hasta una zona despejada.");
        } else {
            System.out.println("La corriente arrastra la canoa. Logras llegar a la orilla, cansada pero a salvo.");
        }
    }
}
