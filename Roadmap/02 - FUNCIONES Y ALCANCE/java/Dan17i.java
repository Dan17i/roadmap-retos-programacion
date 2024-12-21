/*
 * @Autor: Dan17i
 * @since: 21/12/2024
 * @Tema: Creación y uso de funciones en Java
 * @Descripcion: Este programa demuestra la creación y uso de todos los tipos de funciones en Java.
 *               Incluye ejemplos de funciones sin parámetros, con parámetros, recursivas, lambdas,
 *               funciones estáticas, final, con alcance de variables y más.
 *               Además, utiliza estructuras de control y demuestra el uso de clases internas y externas.
 *               Imprime resultados en consola para verificar su funcionamiento.
 * @version: v1.0
 * @Dificultad: Media
 */
public class Dan17i {

    public static void main(String[] args) {
        Dan17i programa = new Dan17i();
        programa.ejecutarEjemplos();
        int conteo = functionExtra1("Fizz", "Buzz");
        System.out.println("Se imprimieron números en lugar de textos: " + conteo);
    }

    /*
     * Método principal para ejecutar ejemplos
     */
    public void ejecutarEjemplos() {
        ejemploAlcance();
        ejemploSinParametro();

        InnerDan17i innerClass = new InnerDan17i();
        innerClass.ejecutarMetodosInternos();

        System.out.println("Ejemplo de función lambda:");
        ejecutarLambda();
    }

    /*
     * @comentario: función sin parámetros y sin retornos
     */
    private void ejemploSinParametro() {
        int resultado = ejemploParametro(5, 2);
        System.out.println("El resultado de la suma (5 + 2) es: " + resultado);
    }

    /*
     * @comentario: función con parámetros y retorno de valor
     */
    private int ejemploParametro(int a, int b) {
        return a + b;
    }

    /*
     * @comentario: función con alcance de variables
     */
    private void ejemploAlcance() {
        int a = 1;
        int b = 2;
        int resultado = ejemploParametro(a, b);
        System.out.println("El resultado de la suma de " + a + " + " + b + " es: " + resultado);
    }

    /*
     * @comentario: función sin parámetros que devuelve un valor
     */
    public String obtenerMensaje() {
        return "Este es un mensaje retornado por una función.";
    }

    /*
     * @comentario: función que devuelve un objeto (puede ser cualquier clase)
     */
    public Persona crearPersona(String nombre, int edad) {
        return new Persona(nombre, edad);
    }

    /*
     * @comentario: función recursiva para calcular el factorial de un número
     */
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /*
     * @comentario: función lambda (expresión lambda en una interfaz funcional)
     */
    public void ejecutarLambda() {
        Operacion suma = (a, b) -> a + b;
        int resultado = suma.operar(10, 20);
        System.out.println("Resultado de la suma usando lambda: " + resultado);
    }

    /*
     * @comentario: función estática (pertenece a la clase y no al objeto)
     */
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    /*
     * @comentario: método final que no puede ser sobrescrito
     */
    public final void metodoFinal() {
        System.out.println("Método final");
    }

    /*
     * Clase interna para encapsular funcionalidad relacionada
     */
    public class InnerDan17i {
        public void ejecutarMetodosInternos() {
            Dan17i.this.metodoFinal();
            Dan17i.this.incrementar();
            Dan17i.this.mostrarResta(10, 5);
            System.out.println("Conteo actual: " + Dan17i.this.obtenerConteo());

            // Ejemplo de uso del método con Varargs
            int suma = Dan17i.sumar(1, 2, 3, 4, 5);
            System.out.println("Suma con varargs: " + suma);

            // Ejemplo de función sin parámetros que retorna un valor
            System.out.println(Dan17i.this.obtenerMensaje());

            // Ejemplo de función que devuelve un objeto
            Persona persona = Dan17i.this.crearPersona("Juan", 30);
            System.out.println("Persona creada: " + persona);

            // Ejemplo de función recursiva
            int factorial = Dan17i.this.factorial(5);
            System.out.println("Factorial de 5: " + factorial);

            // Ejemplo de función estática
            double area = Dan17i.calcularAreaCirculo(5);
            System.out.println("Área de un círculo con radio 5: " + area);
        }
    }

    /*
     * Métodos ya existentes: sincronizados, privados, varargs
     */
    private int conteo = 0;

    public synchronized void incrementar() {
        conteo++;
    }

    public synchronized int obtenerConteo() {
        return conteo;
    }

    private int resta(int a, int b) {
        return a - b;
    }

    public void mostrarResta(int a, int b) {
        System.out.println("La resta es: " + resta(a, b));
    }

    public static int sumar(int... numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    /**
     * Función que imprime números del 1 al 100 siguiendo las reglas especificadas.
     * 
     * @param cadena1 Cadena a mostrar si el número es múltiplo de 3.
     * @param cadena2 Cadena a mostrar si el número es múltiplo de 5.
     * @return El número de veces que se imprimió un número en lugar de un texto.
     */
    private static int functionExtra1(String cadena1, String cadena2) {
        int contadorNumeros = 0; // Contador para los números impresos directamente

        for (int i = 1; i <= 100; i++) {
            boolean multiploDe3 = (i % 3 == 0);
            boolean multiploDe5 = (i % 5 == 0);

            if (multiploDe3 && multiploDe5) {
                System.out.println(cadena1 + cadena2);
            } else if (multiploDe3) {
                System.out.println(cadena1);
            } else if (multiploDe5) {
                System.out.println(cadena2);
            } else {
                System.out.println(i);
                contadorNumeros++;
            }
        }

        return contadorNumeros;
    }

}

/*
 * Clase auxiliar: Persona
 */
class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}

/*
 * Interfaz funcional para expresión lambda
 */
@FunctionalInterface
interface Operacion {
    int operar(int a, int b);
}
