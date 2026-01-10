import java.util.Scanner;
public class Ejercicio6 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un número y te dire si es primo");
        int n = sc.nextInt();
        
        primo(n);
    }
    
    public static void primo (int n) {
        int cont = 0;
        
        for (int i = 1; i <= n; i++) {
            int div = n % i;
            if (div == 0) {
                cont ++;
            }
        }
        
        if (cont == 2) {
            System.out.println("Tu número es primo");
        } else System.out.println("Tu número no es primo");
    }
}
