import java.util.Scanner;
public class Ejercicio6 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un número y llegare a el");
        int n = sc.nextInt();
        
        for (int i = 0; i <= n ; i++) {
            System.out.println( i );
        }
    }
}