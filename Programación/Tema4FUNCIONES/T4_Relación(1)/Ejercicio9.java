import java.util.Scanner;
public class Ejercicio9 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame la base");
        int base = sc.nextInt();
        System.out.println("Dame el exponente");
        int expo = sc.nextInt();
        int total = 1;
        
        iteracion(base, expo);
        recursividad(base, expo);
    }
    
    public static void iteracion (int base, int expo) {
        int total = 1;
        
        for (int i = 1; i <= expo; i++) {
            total *= base;
        }
        
        System.out.println( total );
    }
    
    public static int recursividad (int base, int expo) {
        if (expo == 0) { 
            return 1;
        } else { 
            return base * recursividad (base, expo - 1); }        
    }
}
