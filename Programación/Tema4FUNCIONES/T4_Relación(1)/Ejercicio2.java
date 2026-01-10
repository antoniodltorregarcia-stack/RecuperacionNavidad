import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Parametro a = ");
        int a = sc.nextInt();
        System.out.println("Parametro b = ");
        int b = sc.nextInt();
        
        parametro(a,b);
    }
    
    static void parametro (int a, int b) {
        if (a > b) {
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }
        } else if (b > a) {
            for (int r = a; r <= b; r++) {
                System.out.println(r);
            }    
        } else System.out.println("Tienen el mismo valor");
    }
}