# Laboratorio de Fundamentos Java

Colección didáctica de ejercicios de fundamentos de programación en Java, organizada por variables, operadores, entrada por consola, condicionales, ciclos, cálculos básicos, retos tipo juez en línea y una mini aventura interactiva.

Este proyecto rescata prácticas iniciales de programación y las convierte en un repositorio limpio para portafolio.

---

## Objetivo

Presentar ejercicios básicos de Java con estructura clara, nombres descriptivos, validación de entrada y ejecución desde un menú principal.

El proyecto incluye:

- Variables y tipos de datos.
- Operadores aritméticos.
- Casting y conversiones.
- Entrada por consola con `Scanner`.
- Condicionales.
- Ciclos `for` y `while`.
- Cálculos geométricos.
- Conversiones de unidades y moneda.
- Retos tipo URI/beecrowd.
- Mini aventura de consola.

---

## Estructura

```text
laboratorio-fundamentos-java/
├── README.md
├── docs/
│   ├── ejercicios.md
│   └── rescate.md
├── scripts/
│   ├── build.bat
│   ├── run.bat
│   ├── build.sh
│   └── run.sh
└── src/
    └── dev/
        └── sofipv/
            └── fundamentos/
                ├── App.java
                ├── common/
                ├── fundamentos/
                ├── calculadoras/
                ├── condicionales/
                ├── ciclos/
                ├── retos/
                └── juego/
```

---

## Cómo ejecutar

### Opción rápida en Windows

Desde la raíz del proyecto:

```bash
scripts\run.bat
```

### Opción rápida en Linux/macOS

```bash
chmod +x scripts/build.sh scripts/run.sh
./scripts/run.sh
```

### Compilación manual en Windows PowerShell

```powershell
javac -encoding UTF-8 -d out (Get-ChildItem -Recurse src -Filter *.java).FullName
java -cp out dev.sofipv.fundamentos.App
```

### Compilación manual en Linux/macOS

```bash
find src -name "*.java" > sources.txt
javac -encoding UTF-8 -d out @sources.txt
java -cp out dev.sofipv.fundamentos.App
```

---

## Módulos

### Fundamentos

- `VariablesDemo`
- `TiposDatosDemo`
- `OperadoresDemo`
- `CastingDemo`

### Calculadoras

- `PromedioCalificaciones`
- `AreaCirculo`
- `VolumenCilindro`
- `ConversionKilometrosMetros`
- `ConversionPesosDolares`

### Condicionales

- `NumeroPositivoNegativo`
- `ClasificadorNumero`
- `ValidadorTriangulo`

### Ciclos

- `NumerosImpares`
- `TablaMultiplicar`
- `ContadorParesImpares`
- `PasswordSimulado`

### Retos

- `EdadEnDias`
- `Uri1043Triangulo`
- `Uri1066ParesImpares`
- `Uri1074ParidadSigno`
- `Uri1078TablaMultiplicar`

### Juego

- `ViajeSelva`

---

## Enfoque académico

El repositorio está pensado como muestrario de ejercicios de primeros semestres, pero con estructura moderna:

- Código separado por paquetes.
- Menú principal.
- Métodos reutilizables.
- Validación de entradas.
- Nombres de clases descriptivos.
- Documentación por módulo.
- Scripts de compilación.

---

## Autora

**Sofía Pacheco**  
GitHub: [SofiPv](https://github.com/SofiPv)

---

## Licencia

Este proyecto se distribuye bajo licencia MIT.
