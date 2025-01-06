public class Dan17i {
    public static void main(String[] args) {
        // Ejemplo de asignación por valor
        int a = 5;
        int b = a;
        b = 10;
        System.out.println("Por valor:");
        System.out.println("a: " + a); // a sigue siendo 5
        System.out.println("b: " + b); // b es 10

        // Ejemplo de asignación por referencia
        int[] array1 = {1, 2, 3};
        int[] array2 = array1;
        array2[0] = 10;
        System.out.println("Por referencia:");
        System.out.println("array1[0]: " + array1[0]); // array1[0] es 10
        System.out.println("array2[0]: " + array2[0]); // array2[0] es 10

        // Ejemplo de función con parámetros por valor
        int x = 5;
        modifyValue(x);
        System.out.println("Después de modifyValue(x):");
        System.out.println("x: " + x); // x sigue siendo 5

        // Ejemplo de función con parámetros por referencia
        int[] array = {1, 2, 3};
        modifyArray(array);
        System.out.println("Después de modifyArray(array):");
        System.out.println("array[0]: " + array[0]); // array[0] es 10

        // Dificultad extra
        int val1 = 1, val2 = 2;
        int[] result = swapValues(val1, val2);
        System.out.println("Intercambio por valor:");
        System.out.println("val1: " + val1); // val1 sigue siendo 1
        System.out.println("val2: " + val2); // val2 sigue siendo 2
        System.out.println("result[0]: " + result[0]); // result[0] es 2
        System.out.println("result[1]: " + result[1]); // result[1] es 1

        int[] ref1 = {1}, ref2 = {2};
        swapReferences(ref1, ref2);
        System.out.println("Intercambio por referencia:");
        System.out.println("ref1[0]: " + ref1[0]); // ref1[0] es 2
        System.out.println("ref2[0]: " + ref2[0]); // ref2[0] es 1
    }

    public static void modifyValue(int x) {
        x = 10;
    }

    public static void modifyArray(int[] array) {
        array[0] = 10;
    }

    public static int[] swapValues(int a, int b) {
        return new int[]{b, a};
    }

    public static void swapReferences(int[] a, int[] b) {
        int temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }
}
