import java.util.Scanner;
public class Ejercicio1 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Escribe números y te dire si es par, positivo y su cuadrado");
        System.out.println("(0) finaliza el programa");
        int n = sc.nextInt(); 
        while (n != 0) {
            if (n % 2 == 0) {
                System.out.println( n + " es par");
            } else System.out.println( n + " es impar");
            
            if (n >= 0) {
                System.out.println(n + " es positivo");
            } else System.out.println( n + " es negativo");
            
            int cuadrado = n * n;
            System.out.println ("El cuadrado de " + n + " es: " + cuadrado);
            n = sc.nextInt();
        }
        
        System.out.println("Programa finalizado...");
    }
}