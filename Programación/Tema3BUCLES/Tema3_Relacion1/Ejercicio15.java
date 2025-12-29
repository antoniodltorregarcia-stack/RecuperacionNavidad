import java.util.Scanner;
public class Ejercicio15 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un número");
        int n = sc.nextInt();
        
        while (n != 0) {
            for (int i = n ; i >= 1; i--) {
            System.out.print("*");
            }
            
            n--;
            System.out.println("");
        }
        
    }
}