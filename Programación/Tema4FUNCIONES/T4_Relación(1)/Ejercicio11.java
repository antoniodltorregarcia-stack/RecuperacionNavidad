import java.util.Scanner;
public class Ejercicio11 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un numero y te dire el resultado de dicho número en el legado de Fibonacci");
        int n = sc.nextInt();
        System.out.println("El número es = " + Resultado(n));
        
    }
    
        public static int Resultado(int n) {
        if (n == 1 || n == 2) {
            return 1; // los dos primeros son siempre 1
        }
        int a = 1, b = 1, fibo = 1;
        for (int i = 3; i <= n; i++) { //empieza en 3 porque sabemos que los primeros valores son 1
            fibo = a + b; // suma de los dos anteriores
            a = b;        // avanzamos
            b = fibo;     //el último se convierte en el nuevo número calculado
        }
        return fibo;
    }
}