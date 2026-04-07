import java.util.Scanner;

public class Main {

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
                    System.out.println("Título de la nota: ");
                    String titulo = scanner.nextLine();

                    System.out.println("Contenido de la nota: ");
                    String contenido = scanner.nextLine();

                    System.out.println("Es importante?(si/no): ");
                    String importante = scanner.nextLine();

                    gestor.crearNota(titulo, contenido, importante.equals("si"));
                    break;
                case "2":
                    // TODO: implementar
                    break;
                case "3":
                    // TODO: implementar
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