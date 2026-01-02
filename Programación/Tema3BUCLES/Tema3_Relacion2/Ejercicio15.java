import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int n = sc.nextInt();

        // Bucle para recorrer las filas
        for (int fila = 0; fila <= n; fila++) {
            // Bucle para recorrer las posiciones de cada fila
            for (int k = 0; k <= fila; k++) {
                // Calcular factorial de fila
                int factFila = 1;
                for (int i = 1; i <= fila; i++) {
                    factFila *= i;
                }

                // Calcular factorial de k
                int factK = 1;
                for (int i = 1; i <= k; i++) {
                    factK *= i;
                }

                // Calcular factorial de (fila - k)
                int factResto = 1;
                for (int i = 1; i <= (fila - k); i++) {
                    factResto *= i;
                }

                // Fórmula de combinaciones: C(fila, k) = fila! / (k! * (fila-k)!)
                int valor = factFila / (factK * factResto);

                // Imprimir el valor
                System.out.print(valor + " ");
            }
            // Salto de línea al terminar cada fila
            System.out.println();
        }
    }
}
