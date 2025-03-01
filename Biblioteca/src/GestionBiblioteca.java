import java.util.List;
import java.util.Scanner;

public class GestionBiblioteca {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            // Menú de opciones
            System.out.println("\n----- Gestión de Biblioteca -----");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Eliminar un libro");
            System.out.println("3. Buscar libros por título");
            System.out.println("4. Ver todos los libros");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer de entrada

            switch (opcion) {
                case 1:
                    // Agregar libro
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el ISBN del libro: ");
                    String isbn = scanner.nextLine();
                    Libro libro = new Libro(titulo, autor, isbn);
                    biblioteca.agregarLibro(libro);
                    System.out.println("Libro agregado exitosamente.");
                    break;
                case 2:
                    // Eliminar libro
                    System.out.print("Ingrese el ISBN del libro a eliminar: ");
                    String isbnEliminar = scanner.nextLine();
                    boolean eliminado = biblioteca.eliminarLibro(isbnEliminar);
                    if (eliminado) {
                        System.out.println("Libro eliminado exitosamente.");
                    } else {
                        System.out.println("No se encontró el libro con ese ISBN.");
                    }
                    break;
                case 3:
                    // Buscar libros por título
                    System.out.print("Ingrese el título para buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    List<Libro> resultados = biblioteca.buscarPorTitulo(tituloBuscar);
                    if (resultados.isEmpty()) {
                        System.out.println("No se encontraron libros con ese título.");
                    } else {
                        System.out.println("Resultados de búsqueda:");
                        for (Libro libroResultado : resultados) {
                            System.out.println(libroResultado);
                        }
                    }
                    break;
                case 4:
                    // Ver todos los libros
                    biblioteca.listarLibros();
                    break;
                case 5:
                    // Salir
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}