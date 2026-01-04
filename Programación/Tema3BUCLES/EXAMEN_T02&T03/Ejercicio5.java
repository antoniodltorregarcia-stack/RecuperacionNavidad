import java.util.Scanner;
public class Ejercicio5 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime el caracter con el cual lo vas a dibujar"); 
        String caracter = sc.nextLine();
        System.out.println("Dime la altura del triangulo");
        int n = sc.nextInt();
        
        
        
        for (int i = 0; i <= n; i++) {
            System.out.println("");
            for (int r = 0; r < i;r++) {
                System.out.print(caracter);
            }
        }
    }
}