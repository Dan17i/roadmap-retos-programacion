
import java.util.*;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Dan17i {
    private static final Logger logger = Logger.getLogger(Dan17i.class.getName());
    private static final String CONTACTO_NO_ENCONTRADO = "Contacto no encontrado.";

    public static void main(String[] args) {
        // ArrayList: Lista dinámica que permite almacenar elementos en orden
        ArrayList<String> arrayList = new ArrayList<>();

        // Inserción de elementos
        arrayList.add("Manzana");
        arrayList.add("Banano");
        arrayList.add("Cereza");

        // Borrado de un elemento específico
        arrayList.remove("Banana");

        // Actualización de un elemento en una posición específica
        arrayList.set(1, "Durazno");

        // Ordenación de los elementos en orden ascendente
        Collections.sort(arrayList);

        // Imprimir el contenido del ArrayList
        if (logger.isLoggable(Level.INFO)) {
            logger.info(String.format("ArrayList: %s", arrayList));
        }

        // LinkedList: Lista doblemente enlazada que permite inserciones y eliminaciones
        // rápidas
        LinkedList<String> linkedList = new LinkedList<>();

        // Inserción de elementos
        linkedList.add("perro");
        linkedList.add("Gato");
        linkedList.add("Ratón");

        // Borrado de un elemento específico
        linkedList.remove("Gato");

        // Actualización de un elemento en una posición específica
        linkedList.set(1, "Elefante");

        // Ordenación de los elementos en orden ascendente
        Collections.sort(linkedList);

        // Imprimir el contenido del LinkedList
        if (logger.isLoggable(Level.INFO)) {
            logger.info(String.format("LinkedList: %s", linkedList));
        }

        // HashSet: Conjunto no ordenado que no permite duplicados
        HashSet<String> hashSet = new HashSet<>();

        // Inserción de elementos
        hashSet.add("rojo");
        hashSet.add("Verde");
        hashSet.add("Azul");

        // Borrado de un elemento específico
        hashSet.remove("Verde");

        // Inserción de un nuevo elemento
        hashSet.add("Amarillo");

        // Imprimir el contenido del HashSet
        if (logger.isLoggable(Level.INFO)) {
            logger.info(String.format("HashSet: %s", hashSet));
        }

        // TreeSet: Conjunto ordenado que no permite duplicados
        TreeSet<String> treeSet = new TreeSet<>();

        // Inserción de elementos
        treeSet.add("círculo");
        treeSet.add("Cuadrado");
        treeSet.add("Triángulo");

        // Borrado de un elemento específico
        treeSet.remove("Cuadrado");

        // Inserción de un nuevo elemento
        treeSet.add("Rectángulo");

        // Imprimir el contenido del TreeSet (ya ordenado automáticamente)
        if (logger.isLoggable(Level.INFO)) {
            logger.info(String.format("TreeSet: %s", treeSet));
        }

        // HashMap: Mapa basado en claves y valores, donde las claves son únicas
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Inserción de pares clave-valor
        hashMap.put(1, "uno");
        hashMap.put(2, "dos");
        hashMap.put(3, "Tres");

        // Borrado de un elemento basado en la clave
        hashMap.remove(2);

        // Actualización de un valor de una clave existente
        hashMap.put(3, "cuatro");

        // Imprimir el contenido del HashMap
        if (logger.isLoggable(Level.INFO)) {
            logger.info(String.format("HashMap: %s", hashMap));
        }

        // TreeMap: Mapa ordenado basado en claves
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Inserción de pares clave-valor
        treeMap.put(10, "diez");
        treeMap.put(20, "Veinte");
        treeMap.put(30, "Treinta");

        // Borrado de un elemento basado en la clave
        treeMap.remove(20);

        // Actualización de un valor de una clave existente
        treeMap.put(30, "cuarenta");

        // Imprimir el contenido del TreeMap (ya ordenado por las claves)
        if (logger.isLoggable(Level.INFO)) {
            logger.info(String.format("TreeMap: %s", treeMap));
        }

        // --------------------------- AGENDA DE CONTACTOS ---------------------------

        // Crear una instancia de la agenda de contactos
        AgendaContactos agenda = new AgendaContactos();

        // Menú de opciones
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--------------------");
            System.out.println("\n*** Agenda de contactos ***");
            System.out.println("--------------------");
            System.out.println("Selecciona una operación:");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Actualizar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Mostrar todos los contactos");
            System.out.println("6. Finalizar");
            System.out.println("------------------------------------------------------------");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("------------------------------\nIngrese el nombre del contacto: ");
                    String nombreAgregar = scanner.nextLine();
                    System.out.print("------------------------------\nIngrese el número de teléfono: ");
                    String telefonoAgregar = scanner.nextLine();
                    agenda.agregarContacto(nombreAgregar, telefonoAgregar);
                    break;

                case 2:
                    System.out
                            .print("--------------------------------------\nIngrese el nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    agenda.buscarContacto(nombreBuscar);
                    break;

                case 3:
                    System.out.print(
                            "--------------------------------------\nIngrese el nombre del contacto a actualizar: ");
                    String nombreActualizar = scanner.nextLine();
                    System.out.print("--------------------------------------\nIngrese el nuevo número de teléfono: ");
                    String telefonoActualizar = scanner.nextLine();
                    agenda.actualizarContacto(nombreActualizar, telefonoActualizar);
                    break;

                case 4:
                    System.out.print(
                            "--------------------------------------\nIngrese el nombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    agenda.eliminarContacto(nombreEliminar);
                    break;
                case 5:
                    agenda.mostrarContactos();
                    break;
                case 6:
                    System.out.println("--------------------------------------");
                    System.out.println("Programa finalizado.");
                    System.out.println("--------------------------------------");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    System.out.println("--------------------------------------");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }

    static class AgendaContactos {
        // Lista para almacenar los contactos
        private ArrayList<Contacto> contactos;

        // Constructor
        public AgendaContactos() {
            contactos = new ArrayList<>();
        }

        // Agregar un contacto
        public void agregarContacto(String nombre, String telefono) {
            if (esTelefonoValido(telefono)) {
                contactos.add(new Contacto(nombre, telefono));
                logger.info(" ✅ Contacto agregado.");
            } else {
                logger.warning(" 🚫 Número de teléfono no válido.");
            }
        }

        // Buscar un contacto por nombre
        public void buscarContacto(String nombre) {
            boolean encontrado = false;
            for (Contacto contacto : contactos) {
                if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                    if (logger.isLoggable(Level.INFO)) {
                        logger.info(String.format(" 🔍 Contacto encontrado : %s", contacto));
                    }
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                logger.warning(CONTACTO_NO_ENCONTRADO);
            }
        }

        // Actualizar un contacto por nombre
        public void actualizarContacto(String nombre, String telefono) {
            boolean encontrado = false;
            for (Contacto contacto : contactos) {
                if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                    if (esTelefonoValido(telefono)) {
                        contacto.setTelefono(telefono);
                        logger.info(" 💱 Contacto actualizado.");
                    } else {
                        logger.warning(" 🚫 Número de teléfono no válido.");
                    }
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                logger.warning(CONTACTO_NO_ENCONTRADO);
            }
        }

        // Eliminar un contacto por nombre
        public void eliminarContacto(String nombre) {
            boolean encontrado = false;
            Iterator<Contacto> iter = contactos.iterator();
            while (iter.hasNext()) {
                Contacto contacto = iter.next();
                if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                    iter.remove();
                    logger.info(" 🗑 Contacto eliminado.");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                logger.warning(CONTACTO_NO_ENCONTRADO);
            }
        }

        // Mostrar todos los contactos
        public void mostrarContactos() {
            if (contactos.isEmpty()) {
                logger.info("La agenda está vacía.");
            } else {
                logger.info(" 📋 Contactos : ");
                for (Contacto contacto : contactos) {
                    if (logger.isLoggable(Level.INFO)) {
                        logger.info(contacto.toString());
                    }
                }
            }
        }

        // Validar el teléfono
        private boolean esTelefonoValido(String telefono) {
            return telefono.matches("\\d{10}"); // Solo números y exactamente 10 dígitos
        }
    }

    static class Contacto {
        private String nombre;
        private String telefono;

        // Constructor
        public Contacto(String nombre, String telefono) {
            this.nombre = nombre;
            this.telefono = telefono;
        }

        // Getters y Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        @Override
        public String toString() {
            return " El Nombre es : " + nombre + " Su Teléfono es : " + telefono;
        }
    }
}