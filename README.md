# Pilas_Colas
# PSP - Estructuras dinámicas de datos: Pilas y Colas

**Alumno:** Álvaro · **Módulo:** Programación de Servicios y Procesos · **Curso:** 2º DAM (ILERNA)

## Descripción
Cuatro ejercicios de consola en Java que usan pilas y colas implementadas
desde cero con nodos enlazados, sin las colecciones de `java.util`.

## Diseño
- `Nodo<T>`: clase genérica única, **reutilizada** por `Pila<T>` y `Cola<T>`.
- `Pila<T>`: LIFO con `push`, `pop` e `isEmpty`.
- `Cola<T>`: FIFO con `encolar`, `desencolar`, `isEmpty` y `mostrar`.

## Ejercicios
| Ejercicio | Descripción | Estructura |
|-----------|-------------|------------|
| 01 | Invertir un texto | Pila |
| 02 | Fila de clientes con menú | Cola |
| 03 | Comprobar palíndromos | Pila + Cola |
| 04 | Decimal a binario | Pila |

## Ejecución
Compilar desde `src/` con `javac estructuras/*.java ejercicios/*.java`
y ejecutar, por ejemplo, `java ejercicios.Ejercicio01`.

## Ejemplos
- Ej. 03: "Anita lava la tina" → es palíndromo
- Ej. 04: 10 → 1010
