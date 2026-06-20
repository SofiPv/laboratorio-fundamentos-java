package dev.sofipv.fundamentos;

import dev.sofipv.fundamentos.calculadoras.AreaCirculo;
import dev.sofipv.fundamentos.calculadoras.ConversionKilometrosMetros;
import dev.sofipv.fundamentos.calculadoras.ConversionPesosDolares;
import dev.sofipv.fundamentos.calculadoras.PromedioCalificaciones;
import dev.sofipv.fundamentos.calculadoras.VolumenCilindro;
import dev.sofipv.fundamentos.ciclos.ContadorParesImpares;
import dev.sofipv.fundamentos.ciclos.NumerosImpares;
import dev.sofipv.fundamentos.ciclos.PasswordSimulado;
import dev.sofipv.fundamentos.ciclos.TablaMultiplicar;
import dev.sofipv.fundamentos.common.ConsoleUtils;
import dev.sofipv.fundamentos.common.ExerciseOption;
import dev.sofipv.fundamentos.condicionales.ClasificadorNumero;
import dev.sofipv.fundamentos.condicionales.NumeroPositivoNegativo;
import dev.sofipv.fundamentos.condicionales.ValidadorTriangulo;
import dev.sofipv.fundamentos.fundamentos.CastingDemo;
import dev.sofipv.fundamentos.fundamentos.OperadoresDemo;
import dev.sofipv.fundamentos.fundamentos.TiposDatosDemo;
import dev.sofipv.fundamentos.fundamentos.VariablesDemo;
import dev.sofipv.fundamentos.juego.ViajeSelva;
import dev.sofipv.fundamentos.retos.EdadEnDias;
import dev.sofipv.fundamentos.retos.Uri1043Triangulo;
import dev.sofipv.fundamentos.retos.Uri1066ParesImpares;
import dev.sofipv.fundamentos.retos.Uri1074ParidadSigno;
import dev.sofipv.fundamentos.retos.Uri1078TablaMultiplicar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final List<ExerciseOption> EXERCISES = List.of(
        new ExerciseOption("Fundamentos", "Variables demo", "Declaración, asignación y salida en consola.", VariablesDemo::run),
        new ExerciseOption("Fundamentos", "Tipos de datos demo", "Tipos primitivos y textos.", TiposDatosDemo::run),
        new ExerciseOption("Fundamentos", "Operadores demo", "Operaciones aritméticas y módulo.", OperadoresDemo::run),
        new ExerciseOption("Fundamentos", "Casting demo", "Conversiones entre tipos numéricos.", CastingDemo::run),

        new ExerciseOption("Calculadoras", "Promedio de calificaciones", "Calcula promedio y estado aprobado/reprobado.", PromedioCalificaciones::run),
        new ExerciseOption("Calculadoras", "Área de círculo", "Calcula área usando PI.", AreaCirculo::run),
        new ExerciseOption("Calculadoras", "Volumen de cilindro", "Calcula volumen por radio y altura.", VolumenCilindro::run),
        new ExerciseOption("Calculadoras", "Kilómetros a metros", "Convierte distancia.", ConversionKilometrosMetros::run),
        new ExerciseOption("Calculadoras", "Pesos a dólares", "Convierte moneda con tipo de cambio editable.", ConversionPesosDolares::run),

        new ExerciseOption("Condicionales", "Número positivo o negativo", "Evalúa signo de un número.", NumeroPositivoNegativo::run),
        new ExerciseOption("Condicionales", "Clasificador de número", "Paridad y signo.", ClasificadorNumero::run),
        new ExerciseOption("Condicionales", "Validador de triángulo", "Valida lados y tipo de triángulo.", ValidadorTriangulo::run),

        new ExerciseOption("Ciclos", "Números impares", "Imprime impares hasta N.", NumerosImpares::run),
        new ExerciseOption("Ciclos", "Tabla de multiplicar", "Genera tabla del 1 al 10.", TablaMultiplicar::run),
        new ExerciseOption("Ciclos", "Contador pares/impares", "Cuenta números positivos, negativos, pares e impares.", ContadorParesImpares::run),
        new ExerciseOption("Ciclos", "Contraseña simulada", "Valida contraseña con ciclo while.", PasswordSimulado::run),

        new ExerciseOption("Retos", "Edad en días", "Descompone días en años, meses y días.", EdadEnDias::run),
        new ExerciseOption("Retos", "URI 1043 Triángulo", "Perímetro o área de trapecio.", Uri1043Triangulo::run),
        new ExerciseOption("Retos", "URI 1066 Pares e impares", "Cuenta paridad y signo en cinco valores.", Uri1066ParesImpares::run),
        new ExerciseOption("Retos", "URI 1074 Paridad y signo", "Clasifica varios valores.", Uri1074ParidadSigno::run),
        new ExerciseOption("Retos", "URI 1078 Tabla", "Tabla de multiplicar estilo juez en línea.", Uri1078TablaMultiplicar::run),

        new ExerciseOption("Juego", "Viaje a la selva", "Mini aventura de consola con decisiones.", ViajeSelva::run)
    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            int option = ConsoleUtils.readInt(scanner, "Elige una opción: ");

            if (option == 0) {
                running = false;
                continue;
            }

            if (option < 1 || option > EXERCISES.size()) {
                System.out.println("Opción fuera de rango.");
                continue;
            }

            ExerciseOption selected = EXERCISES.get(option - 1);
            ConsoleUtils.printTitle(selected.getTitle());
            System.out.println(selected.getDescription());
            selected.run(scanner);
            ConsoleUtils.pause(scanner);
        }

        System.out.println("Gracias por usar el laboratorio de fundamentos Java.");
    }

    private static void printMenu() {
        ConsoleUtils.printTitle("Laboratorio de Fundamentos de Java");

        String currentCategory = "";
        for (int i = 0; i < EXERCISES.size(); i++) {
            ExerciseOption exercise = EXERCISES.get(i);

            if (!exercise.getCategory().equals(currentCategory)) {
                currentCategory = exercise.getCategory();
                System.out.println();
                System.out.println("[" + currentCategory + "]");
            }

            System.out.printf("%2d. %s%n", i + 1, exercise.getTitle());
        }

        System.out.println();
        System.out.println(" 0. Salir");
    }
}
