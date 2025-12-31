import java.util.Scanner;
public class Ejercicio14 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime un número y te dire los numeros primoms que hay hasta el");
        int n = sc.nextInt();
        int result = 0;
        int cont = 0;
        int totalprimos = 0;
        for (int i = 1; i <= n; i++) {
            cont = 0;
            result = i % i;
            
            if (result == 0) {
                cont++;
            }
            
            result = i % 1;
            
            if (result == 0) {
                cont++;
            }
            
            result = i % 2;
            
            if (i != 2 && result == 0) {
                cont++;
            }
            
            result = i % 3;
            
            if (i != 3 && result == 0) {
                cont++;
            }            
            result = i % 5;
            
            if (i != 5 && result == 0) {
                cont++;
            }
            
            if (cont > 2) {
                System.out.println( i + " --> no es primo");
            } else if (cont == 2) {
                System.out.println( i + " --> es primo");
                totalprimos++;
            }
        }
        
        System.out.println("El total de primos es de = " + totalprimos);
    }
}