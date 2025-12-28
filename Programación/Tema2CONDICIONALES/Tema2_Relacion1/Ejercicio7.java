import java.util.Scanner;
public class Ejercicio7 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un número");
        int n1 = sc.nextInt();
        System.out.println("Dame otro número");
        int n2 = sc.nextInt();
        System.out.println("Dame otro número");
        int n3 = sc.nextInt();
        
        if (n1 >= n2 && n1 >= n3) {
            if (n2 >= n3) {
                System.out.println(n1 + " > " + n2 + " > " + n3);
            } else System.out.println(n1 + " > " + n3 + " > " + n2);
        }
        
        if (n2 >= n3 && n2 >= n1) {
            if (n3 >= n1) {
                System.out.println(n2 + " > " + n3 + " > " + n1);
            } else System.out.println(n2 + " > " + n1 + " > " + n3);
        }
        
        if (n3 >= n1 && n3 >= n2) {
            if (n1 >= n2) {
                System.out.println(n3 + " > " + n1 + " > " + n2);
            } else System.out.println(n3 + " > " + n2 + " > " + n1);
        }
    }
}
