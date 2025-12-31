import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número en binario:");
        int binario = sc.nextInt();  // lo leemos como número entero

        int decimal = 0;
        int potencia = 1; // empieza en 2^0

        // mientras queden dígitos en el número binario
        while (binario > 0) {
            int digito = binario % 10; // último dígito
            if (digito == 1) {
                decimal = decimal + potencia;
            }
            // avanzar a la siguiente potencia de 2
            potencia = potencia * 2;
            // quitar el último dígito
            binario = binario / 10;
        }

        System.out.println("El número en decimal es: " + decimal);
    }
}