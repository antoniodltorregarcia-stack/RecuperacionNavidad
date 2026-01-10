import java.util.Scanner;
public class Ejercicio1 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un número de ecos");
        int n = sc.nextInt();
        
        eco(n);
    }
    
    static void eco (int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("eco " + i);
        }
    }
}