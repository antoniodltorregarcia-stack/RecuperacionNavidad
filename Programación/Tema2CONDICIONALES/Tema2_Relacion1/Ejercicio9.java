import java.util.Scanner;
public class Ejercicio9 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un número entro 0 y 99.999");
        int n = sc.nextInt();
        
        if (n <= 9 && n >= 0) {
            System.out.println(n + " Tiene una cifra");
        } else if (n >= 10 && n <= 99) {
            System.out.println(n + " Tiene dos cifras");    
        } else if (n >= 100 && n <= 999) {
            System.out.println(n + " Tiene tres cifras");
        } else if (n >= 1000 && n <= 9999) {
            System.out.println(n + " Tiene cuatro cifras");
        } else if (n >= 10000 && n <= 99999) {
            System.out.println(n + " Tiene cinco cifras");
        } else System.out.println("Número no establecido entre los parametros");
    }
}