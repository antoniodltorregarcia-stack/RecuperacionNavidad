import java.util.Scanner;
public class Ejercicio11 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un número del 0 - 9999, y te dire si es capicua");
        int n = sc.nextInt();
        
        if (n >= 10 && n <= 99) {
            int decimal = n / 10;
            int unidad = n % 10;
            if (decimal == unidad) {
                System.out.println("Tu número es capicua");
            } else System.out.println("Tu número no es capicua");
        } else if (n >=100 && n <=999) {
            int centena = n / 100;
            int unidad = n % 10;
            if (centena == unidad) {
                System.out.println("Tu número es capicua");
            } else System.out.println("Tu número no es capicua");
        } else if (n >= 1000 && n <= 9999) {
            int millar = n / 1000;
            int centena = (n / 100) % 10; //(n / 100) elimina decena y unidad / % 10 se queda con la ultima cifra 
            int decena = (n / 10) % 10;
            int unidad = n % 10;
            if (millar == unidad && centena == decena) {
                System.out.println("Tu número es capicua");
            } else System.out.println("Tu número no es capicua");
        } else if (n >= 10000 || n < 0) {
            System.out.println("Tu número esta fuera de los parametros");
        } else if (n >= 0 && n <= 9) {
            System.out.println("Los número de una cifra siempre son capicuas");
        }
    }
}