import java.util.Scanner;
public class Ejercicio16 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un número y te dibujare un triangulo");
        int n = sc.nextInt();
        int cont = 1;
        for (int i = 0; i < n; i++) {
            
            for (int a = 0; a < cont; a++) {
                System.out.print("*");
            }
            
            System.out.println("");
            cont++;
        }
    }
}