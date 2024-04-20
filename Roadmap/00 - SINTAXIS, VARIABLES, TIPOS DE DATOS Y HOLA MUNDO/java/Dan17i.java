/*
 * ¿Preparad@ para aprender o repasar el lenguaje de programación que tú quieras?
 * - Recuerda que todas las instrucciones de participación están en el
 *   repositorio de GitHub.
 *
 * Lo primero... ¿Ya has elegido un lenguaje?
 * - No todos son iguales, pero sus fundamentos suelen ser comunes.
 * - Este primer reto te servirá para familiarizarte con la forma de participar
 *   enviando tus propias soluciones.
 *
 * EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).
 * - Crea una variable (y una constante si el lenguaje lo soporta).
 * - Crea variables representando todos los tipos de datos primitivos
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 *
 * ¿Fácil? No te preocupes, recuerda que esta es una ruta de estudio y
 * debemos comenzar por el principio.
 */

 /*
 *
  * @param args
  * @autor Dan17i
  * @since 20/04/2024
  * lenguaje: https://www.java.com/es/
  * JDK 17: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
  * 
  */
public class Dan17i {
//-------------------------------------------METODO MAIN-----------------------------------------------------------
public static void main(String[] args) {
    
//--------------------------------------------------ATRIBUTOS----------------------------------------------------------

  /*
   *byte: Es un tipo de datos de 8 bits con signo que puede almacenar valores enteros en el rango de -128 a 127.
   */  
{
    byte edad = 25; // no hay necesidad de ninguna letra o caractes luego de la cantiad
}
/*
 * short: Es un tipo de datos de 16 bits con signo que puede almacenar valores enteros en el rango de -32,768 a 32,767.
 */
{
    short distancia = 1000; // no hay necesidad de ninguna letra o caractes luego de la cantiad
}
/*
 * int: Es un tipo de datos de 32 bits con signo que puede almacenar valores enteros en el rango de -2^31 a 2^31 - 1.
 */
{
    int cantidad = 5000;  // no hay necesidad de ninguna letra o caractes luego de la cantiad
}
/*
 * long: Es un tipo de datos de 64 bits con signo que puede almacenar valores enteros en el rango de -2^63 a 2^63 - 1.
 */
{
    long poblacionMundial = 7800000000L; // La "L" al final indica que es un literal long
}
/*
 * float: Es un tipo de datos de 32 bits que representa números de punto flotante de precisión simple.
 */
{
    float precio = 3.99f; // La "f" al final indica que es un literal float
}
/*
 * double: Es un tipo de datos de 64 bits que representa números de punto flotante de doble precisión.
 */
{
    double temperatura = 25.5; // no se nos olvice el '.'
}
/*
 * boolean: Representa un valor verdadero o falso. Solo puede tener dos valores posibles: true o false.
 */
{
    boolean esMayorDeEdad = true; // cómo no es de tipo final, puede llagar a cambiar de estado 
}
/*
 * char: Es un tipo de datos de 16 bits que representa un solo carácter Unicode.
 */
{
    char letraInicial = 'A'; // indispensable las -> ' '
}

//----------------------------------------------------- imprimir en Sting por las  ""------------------------------------
    System.out.println("¡Hola, java!");
}
}
