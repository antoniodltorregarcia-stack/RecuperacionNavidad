import java.util.Scanner;
public class Ejercicio16 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un número y te calculare su valor absoluto");
        int n = sc.nextInt();
        
        int valorabsoluto = (n <= 0) ? n : -n;
        System.out.println("El valor absoluto de " + n + " es " + valorabsoluto);
        
        
        // (?) numero → si es verdadero, devuelve el mismo número.
        //(:) -numero → si es falso, devuelve el número cambiado de signo.

    }
}