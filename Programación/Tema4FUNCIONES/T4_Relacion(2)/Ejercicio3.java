import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime cuantos pares quieres que te muestre");
        int n = sc.nextInt();
        
        muestraPares(n);
    }
    
    public static void muestraPares (int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + (2 * i));
        }
    }
}