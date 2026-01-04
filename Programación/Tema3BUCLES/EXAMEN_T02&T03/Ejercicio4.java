import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("dame un número");
        int n = sc.nextInt();
        int noprimo = 0;
        for (int i = 1; i <= n; i++) {
        
            int cont = 0;
            
            noprimo = i % i;
            if (noprimo == 0) {
                cont ++;    
            }
            
            noprimo = i % 2;
            if (noprimo == 0 && i != 2) {
                cont++;
            } 
            
            noprimo = i % 1;
            if (noprimo == 0) {
                cont++;
            }
            
            noprimo = i % 3;
            if (noprimo == 0 && i != 3) {
                cont++;
            } 
            noprimo = i % 5;
            if (noprimo == 0 && i != 5) {
                cont++;
            }
            
            if (cont <= 2) {
                System.out.println( i + " --> primo");
            } else System.out.println( i + " --> no primo");
        }
    }
}