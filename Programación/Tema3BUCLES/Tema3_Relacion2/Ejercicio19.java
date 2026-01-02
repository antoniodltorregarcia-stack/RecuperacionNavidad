import java.util.Scanner;
public class Ejercicio19 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        int resto = 0;
        int raiz = 0;
        
        for (int i = 0; resto < n; i++) {
            resto = i * i;
            raiz = i;
            
        }
        
        if (resto == n) {
            System.out.println("Raiz = " + raiz + " Resto = 0");    
        } else if (resto > n) {
            raiz -= 1;
            resto = raiz * raiz;
            
            resto = n - resto;
            System.out.println("Raiz = " + raiz + " Resto = " + resto);
        }
        
    
    }
}