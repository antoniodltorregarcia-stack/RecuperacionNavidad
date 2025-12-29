import java.util.Scanner;
public class Ejercicio8 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int n = 0;
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Numero " + i + " = ");
            n = sc.nextInt();
            System.out.print("");
            suma += n;
        }
        
        int media = suma / 10;
        System.out.println("La media de los 10 números es de " + media);
    }
}