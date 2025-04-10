import java.util.Scanner;

public class Taller01 {
    private Scanner scanner = new Scanner(System.in);
    public void main(String[] args) {
        menu();
    }
    void salir() {
        System.out.println("Adios...");
    }
    void menu() {
        int opcion;
        do {
            mostrarOpciones();
            opcion = obtenerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != 2);

    }
    private void mostrarOpciones() {
        System.out.println("¿Que desea hacer? ");
        System.out.println("[1] Crear Matriz" );
        System.out.println("[2] Salir" );
        System.out.print("Opcion: ");
    }
    private int obtenerOpcion() {
        return Integer.parseInt(scanner.nextLine());
    }
    private void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> ;
            case 2 -> salir();
            default -> System.out.println(" Opcion invalida...");
        }
    }

}