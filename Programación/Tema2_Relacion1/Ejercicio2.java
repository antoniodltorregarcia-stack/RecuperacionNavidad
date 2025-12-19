import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un número");
        int n1 = sc.nextInt();
        System.out.println("Dame otro número");
        int n2 = sc.nextInt();
        
        if (n1 == n2) {
            System.out.println("Estos dos números son iguales");
        } else System.out.println("Estos dos números son diferentes");
    }
}