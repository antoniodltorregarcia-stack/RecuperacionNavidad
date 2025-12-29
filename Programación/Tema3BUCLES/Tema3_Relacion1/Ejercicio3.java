import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Intenta adivinar el número secreto, se encuentra entre 0 - 100");
        
        int numerosecreto = (int)(Math.random() * 100) + 1;
        int cont = 0;
        int n;
        
        while (true) {
            
            n = sc.nextInt();
            
            if (n == numerosecreto || n == -1) {
                break;
            }
            
            if (n < numerosecreto) {
                System.out.println("Tu número es mas pequeño que el número secreto");
            } else if (n > numerosecreto) {
                System.out.println("Tu número es mas grande que el número secreto");
            }
            
            
            cont ++;
            
        }
        
        if (n == -1) {
            System.out.println("Te rendiste, el número secreto era " + numerosecreto);    
        } else System.out.println("Acertaste, en un total de " + cont + " intentos");
    }
}