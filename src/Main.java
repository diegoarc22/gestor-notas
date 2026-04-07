import java.util.Scanner;

public class Main {
    public static String validarEntrada(String mensaje, Scanner sc) {
        String entrada;
        do {
            System.out.print(mensaje); // Usamos print para que escriba al lado
            entrada = sc.nextLine().trim();
            if (entrada.isBlank()) {
                System.out.println("El campo no puede estar vacío.");
            }
        } while (entrada.isBlank());
        return entrada;
    }

    private static boolean leerBoolean(String mensaje, Scanner sc) {
        String resp;
        while (true) {
            System.out.print(mensaje);
            resp = sc.nextLine().trim().toLowerCase();
            if (resp.equals("si")) return true;
            if (resp.equals("no")) return false;
            System.out.println("Use 'si' o 'no'.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GestorNotas gestor = new GestorNotas();

        boolean salir = false;

        while (!salir) {

            System.out.println("\n=== GESTOR DE NOTAS ===");
            System.out.println("1. Crear nota");
            System.out.println("2. Listar notas");
            System.out.println("3. Listar importantes");
            System.out.println("0. Salir");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    String titulo = validarEntrada("Titulo de la nota: ", scanner);
                    String contenido = validarEntrada("Contenido de la nota: ", scanner);
                    boolean importante = leerBoolean("¿Importante? (si/no): ",scanner);

                    gestor.crearNota(titulo, contenido, importante);

                    break;
                case "2":
                    gestor.listarNotas();

                    break;
                case "3":
                    gestor.listarImportantes();

                    break;
                case "0":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

        scanner.close();
    }
}