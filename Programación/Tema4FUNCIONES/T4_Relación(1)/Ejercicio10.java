import java.util.Scanner;
public class Ejercicio10 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Valor (a)");
        int a = sc.nextInt();
        System.out.println("Valor (b)");
        int b = sc.nextInt();
        int divisor = 0;
        
        maximo (a, b, divisor);
    }
    
    public static void maximo (int a, int b, int divisor) {
        if (a < b) {
            divisor = a;
        } else if (b < a) {
            divisor = b;
        }
        
        while (divisor > 0) {
            if (a % divisor == 0 && b % divisor == 0) {
                System.out.println("El máximo común divisor es " + divisor);
                break;
            }
            divisor--;
        }
    }
}