import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un número y te dire si es un casi cero");
        double n = sc.nextDouble();
        
        if (n >= 0 && n <= 0.99) {
            System.out.println ("El número " + n + " es un casi-cero");
        } else System.out.println ("El número " + n + " no es un casi-cero");
    }
}