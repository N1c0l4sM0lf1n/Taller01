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

    void matriz() {
        System.out.println("Inserte la cantidad de filas: ");
        int fila = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserte la cantidad de columnas: ");
        int colum = Integer.parseInt(scanner.nextLine());
        validarDimensiones(fila, colum);

    }

    int[][] crearMatriz(int filas, int cols) {
        return new int[filas][cols];
        llenarMatriz();
    }
    boolean validarDimensiones(int filas,int cols) {
        if (filas > 0) {
            if (cols > 0){
                crearMatriz(filas, cols);
            }
            else {
                System.out.println("Ingrese un dato valido");
                return;
            }
        }
        else {
            System.out.println("Ingrese un dato valido");
            return;

        }
        void llenarMatriz(int matriz [ ][ ]) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = 0;
                }
            }
        }
