
import java.util.logging.Logger;

// tuve un problema con visual así que toco sustituir los System.out.println por logger.info

/*
 * @Autor: Dan
 * @since: 21/12/2024
 * @Tema: Operadores y estructuras de control
 * @Descripcion: cuenta con ejemplos que utilicen todos los tipos de operadores de tu lenguaje 
 * (aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits) y representen estructuras de control
 * (condicionales, iterativas, excepciones). Imprime los resultados por consola.
 * DIFICULTAD EXTRA: Imprime por consola todos los números pares entre 10 y 55, excluyendo el 16 y múltiplos de 3.
 * @version: v1
 * @Dificultad: Media
 */
public class Dan17i {

    private static final Logger logger = Logger.getLogger(Dan17i.class.getName());

    public static void main(String[] args) {
        int a = 5;
        int b = a++; // b = 5, a = 6 (se asigna primero y luego incrementa)
        int c = a--; // c = 6, a = 5 (se asigna primero y luego decrementa)
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("b=%d, c=%d", b, c));
            
        }
        /*
         * @comentario: Aritméticos (+, -, *, /, %)
         */
        int suma = a + b; // suma = 10
        int resta = a - b; // resta = 0
        int multiplicacion = a * b; // multiplicacion = 30
        int division = a / b; // division = 1
        int modulo = a % b; // modulo = 0
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("resultados: suma=%d, resta=%d, multiplicacion=%d, division=%d, modulo=%d", suma,
                    resta, multiplicacion, division, modulo));
        }
        /*
         * @comentario: Unario (++, --, +, -, ~, !)
         */
        int x = 10;
        int y = ++x; // y = 11, x = 11 (incremento antes de la asignación)
        int z = --x; // z = 10, x = 10 (decremento antes de la asignación)
        int al = +x; // a = 10, no cambia el valor
        int bl = -x; // b = -10, cambia el signo
        boolean flag = false; // flag = false
        int n = ~x; // n = -11, cambia todos los bits de x (complemento a 1)

        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("y=%d, z=%d, al=%d, bl=%d, flag=%b, n=%d", y, z, al, bl, flag, n));
        }
        /*
         * @comentario: Desplazamiento (<<, >>, >>>)
         */
        int r = 10;
        int s = 2;
        r <<= s; // r = 40
        r >>= s; // r = 10
        r >>>= s; // r = 2
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("El valor r: %d", r));
        }

        boolean p = true;
        boolean q = false;
        boolean and = p && q; // and = false
        boolean or = p || q; // or = true
        boolean not = !p; // not = false

        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("and=%b, or=%b, not=%b", and, or, not));
        }
        /*
         * @comentario: Relacionales (==, !=, >, <, >=, <=)
         */
        int t = 10;
        int u = 5;
        boolean eq = t == u; // eq = false
        boolean gt = t > u; // gt = true
        boolean lt = t < u; // lt = false
        boolean gte = t >= u; // gte = true
        boolean lte = t <= u; // lte = false
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("eq=%b, gt=%b, lt=%b, gte=%b, lte=%b", eq, gt, lt, gte, lte));
        }
        /*
         * @comentario: ternario ( ? : )
         */
        int v = 10;
        int w = 5;
        int min = (v < w) ? v : w; // min = 5
        int max = (v > w) ? v : w; // max = 10

        // Usar logger en lugar de System.out.println
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("El valor mínimo es: %d", min));
        }
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("El valor máximo es: %d", max));
        }
        /*
         * @comentario: Asignación (=, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=)
         */
        int aa = 10;
        int bb = 5;
        aa += bb; // aa = 15
        aa -= bb; // aa = 10
        aa *= bb; // aa = 50
        aa /= bb; // aa = 10
        aa %= bb; // aa = 0
        aa &= bb; // aa = 0
        aa |= bb; // aa = 5
        aa ^= bb; // aa = 0
        aa <<= bb; // aa = 0
        aa >>= bb; // aa = 0
        aa >>>= bb; // aa = 0
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.valueOf(aa));
        }
        estructurasDeControl();
        numerosPares();

    }

    /*
     * @comentario: Estructuras de control
     * Ejemplos incluidos:
     * Bucle while
     * Bucle for
     * Bucle do-while
     * Estructura condicional if-else
     * Estructura switch-case
     * Manejo de excepciones con try-catch-finally
     */
    public static void estructurasDeControl() {
        ejemploBucleWhile();
        ejemploBucleFor();
        ejemploBucleDoWhile();
        ejemploCondicionalIfElse();
        ejemploSwitchCase();
        ejemploOperadorTernario();
        ejemploManejoExcepciones();
    }

    private static void ejemploBucleWhile() {
        int i = 0;
        while (i < 10) {
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(String.valueOf(i));
            }
            i++;
        }
    }

    private static void ejemploBucleFor() {
        for (int j = 0; j < 10; j++) {
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(String.valueOf(j));
            }
        }
    }

    private static void ejemploBucleDoWhile() {
        int i = 10;
        do {
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(String.valueOf(i));
            }
            i--;
        } while (i > 0);
    }

    private static void ejemploCondicionalIfElse() {
        int i = 0;
        if (i == 0) {
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info("i es igual a 0");
            }
        } else if (i < 0) {
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info("i es menor que 0");
            }
        } else {
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info("i es mayor que 0");
            }
        }
    }

    private static void ejemploSwitchCase() {
        int i = 0;
        switch (i) {
            case 0:
                if (logger.isLoggable(java.util.logging.Level.INFO)) {
                    logger.info("i es igual a 0");
                }
                break;
            case 1:
                if (logger.isLoggable(java.util.logging.Level.INFO)) {
                    logger.info("i es igual a 1");
                }
                break;
            default:
                if (logger.isLoggable(java.util.logging.Level.INFO)) {
                    logger.info("i es distinto de 0 y 1");
                }
        }
    }

    private static void ejemploOperadorTernario() {
        int puntuacion = 85;
        String mensaje = (puntuacion >= 60) ? "¡Aprobado!" : "¡Reprobado!";
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(mensaje);
        }
    }

    private static void ejemploManejoExcepciones() {
        try {
            int resultado = 10 / 0;
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(String.valueOf(resultado));
            }
        } catch (ArithmeticException e) {
            if (logger.isLoggable(java.util.logging.Level.SEVERE)) {
                logger.severe("No se puede dividir por 0");
            }
        } finally {
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info("Fin del programa");
            }
        }
    }

    /*
     * Método que imprime por consola todos los números pares comprendidos
     * entre 10 y 55 (incluidos), excluyendo el 16 y los múltiplos de 3.
     * Utiliza un bucle for para iterar a través de los números y una
     * estructura condicional para filtrar los números que deben ser excluidos.
     */
    public static void numerosPares() {
        for (int i = 10; i <= 55; i++) {
            if (i == 16 || i % 3 == 0) {
                continue;
            }
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(String.valueOf(i));
            }
        }
    }

}
