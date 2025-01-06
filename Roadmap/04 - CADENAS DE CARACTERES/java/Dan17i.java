/*
 * @Autor: Daniel 
 * @since: 21/12/2024
 * @Tema: Cadenas de caracteres
 * @Descripcion: cuenta con ejemplos que utilicen los tipos de datos de cadenas de caracteres de tu lenguaje.
 * Imprime los resultados por consola.
 */

public class Dan17i {
    public static void main(String[] args) {
        String str1 = "Hola Mundo";
        String str2 = "Adiós Mundo";

        // Acceso a caracteres específicos
        char charAt2 = str1.charAt(2);
        System.out.println("Caracter en la posición 2: " + charAt2);

        // Subcadenas
        String substring = str1.substring(5, 10);
        System.out.println("Subcadena de la posición 5 a 10: " + substring);

        // Longitud
        int length = str1.length();
        System.out.println("Longitud de la cadena (se cuenta desde 0): " + length);

        // Concatenación
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenación de cadenas: " + "( " + concatenated + " )");

        // Repetición
        String repeated = str1.repeat(2);
        System.out.println("Cadena repetida: " + repeated);

        // Recorrido
        System.out.print("Recorrido de la cadena: ");
        for (char c : str1.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Conversión a mayúsculas y minúsculas
        String upperCase = str1.toUpperCase();
        String lowerCase = str1.toLowerCase();
        System.out.println("Cadena en mayúsculas: " + upperCase);
        System.out.println("Cadena en minúsculas: " + lowerCase);

        // Reemplazo
        String replaced = str1.replace("Mundo", "Java");
        System.out.println("Cadena con reemplazo: " + replaced);

        // División
        String[] split = str1.split(" ");
        System.out.println("Cadena dividida: ");
        for (String s : split) {
            System.out.println(s);
        }

        // Unión
        String joined = String.join("-", split);
        System.out.println("Cadena unida: " + joined);

        // Interpolación
        String interpolated = String.format("Hola %s, bienvenido al %s", "Daniel", "mundo de Java");
        System.out.println("Cadena interpolada: " + interpolated);

        // Verificación
        boolean startsWith = str1.startsWith("Hola");
        boolean endsWith = str1.endsWith("Mundo");
        boolean contains = str1.contains("Mundo");
        System.out.println("Empieza con 'Hola': " + startsWith);
        System.out.println("Termina con 'Mundo': " + endsWith);
        System.out.println("Contiene 'Mundo': " + contains);

        // DIFICULTAD EXTRA
        String word1 = "amor";
        String word2 = "roma";

        // Palíndromos
        boolean isPalindrome1 = new StringBuilder(word1).reverse().toString().equals(word1);
        boolean isPalindrome2 = new StringBuilder(word2).reverse().toString().equals(word2);
        System.out.println(word1 + " es palíndromo: " + isPalindrome1);
        System.out.println(word2 + " es palíndromo: " + isPalindrome2);

        // Anagramas
        boolean isAnagram = word1.length() == word2.length() &&
                sortString(word1).equals(sortString(word2));
        System.out.println(word1 + " y " + word2 + " son anagramas: " + isAnagram);

        // Isogramas
        boolean isIsogram1 = word1.length() == word1.chars().distinct().count();
        boolean isIsogram2 = word2.length() == word2.chars().distinct().count();
        System.out.println(word1 + " es isograma: " + isIsogram1);
        System.out.println(word2 + " es isograma: " + isIsogram2);
    }

    private static String sortString(String input) {
        char[] chars = input.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }
}
