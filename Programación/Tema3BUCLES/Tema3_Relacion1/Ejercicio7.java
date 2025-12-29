import java.util.Scanner;
public class Ejercicio7 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int n = 100;
        
        for (int i = 0; i <= n; i++) {
            
            int multiplo = i % 7;
            
            if (multiplo == 0) {
                System.out.println( i );
            }
        }
    }
}