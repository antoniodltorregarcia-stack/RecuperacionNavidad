import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un parametro (a)");
        int a = sc.nextInt();
        System.out.println("Dame un parametro (b)");
        int b = sc.nextInt();
        
        mayor(a,b);
    }
    
    static void mayor (int a, int b) {
        if (a > b) {
            System.out.println("El número mayor es (a) = " + a);
        } else if (b > a) {
            System.out.println("El número mayor es (b) = " + b);    
        } else System.out.println(a + " y " + b + " tienen el mismo valor");
    }
}