import java.util.Scanner;
public class Ejercicio11 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un número");
        int n = sc.nextInt();
        int resultado = 1;
        int resto = 0;
        
        while (n != 0) {
            
            resto = n % 2;
            n = n / 2;
            
            System.out.println(resto);
            
        }
        
        
        //IMPRIME LOS NUMEROS ALREVES
    }
}