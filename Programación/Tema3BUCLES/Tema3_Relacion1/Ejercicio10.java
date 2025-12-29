import java.util.Scanner;
public class Ejercicio10 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int n = 10;
        int Par = 0;
        int Suma = 0;
        
        System.out.print("Impares = ");
        for (int i = 0; i <= n ; i++) {
            
            Par = i % 2;
            
            if (Par != 0) {
                System.out.print( i + ", " );
                Suma += i;
            }
        }
        System.out.println("");
        System.out.println("La suma total es de " + Suma);
    }
}