import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Escribe un número, te ire sumando los impares y te dare su total");
        
        
        int n = sc.nextInt();
        int impar = 0;
        int sumaimpar = 0;
        int contimpar = 0;
        System.out.print("n = " + n + " --> ");
        
        while (contimpar < 5) {
            
            for (int i = 1; contimpar < n; i++) {
                impar = i % 2;
                
                if (impar != 0) {
                    contimpar++;
                    System.out.print(i + " + ");
                    sumaimpar += i;
                }
                
                
            }
        }
        
        System.out.print(" = " + sumaimpar);
    }
}