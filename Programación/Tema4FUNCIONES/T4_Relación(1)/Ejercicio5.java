import java.util.Scanner; 
public class Ejercicio5 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un caracter y te dire si es una vocal");
        char n = sc.next().charAt(0);
        
        Caracter(n);
        
        
    }
    
    static void Caracter (char n) {
        if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u' ) {
            System.out.println ("(" + n + ") es una vocal");    
        } else System.out.println ("(" + n + ") no es una vocal");
    }
}