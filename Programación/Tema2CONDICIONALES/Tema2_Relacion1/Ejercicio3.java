import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un número");
        int n1 = sc.nextInt();
        System.out.println("Dame otro número");
        int n2 = sc.nextInt();
        
        if (n1 > n2) {
            System.out.println("El número " + n1 + " es mayor que " + n2 );
        } else if (n1 < n2) {
            System.out.println("El número " + n2 + " es mayor que " + n1);
        } else System.out.println("Ambos números son iguales");
    }
}