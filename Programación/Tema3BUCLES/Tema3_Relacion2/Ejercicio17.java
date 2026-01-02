import java.util.Scanner;
public class Ejercicio17 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un valor (a)");
        int a = sc.nextInt();
        System.out.println("Dame un valor (b)");
        int b = sc.nextInt();
        
        int divisor = 0;
        int result1 = 1;
        int result2 = 1;
        
        
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