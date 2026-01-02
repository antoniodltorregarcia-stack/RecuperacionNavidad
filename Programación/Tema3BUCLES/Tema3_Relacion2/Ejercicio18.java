import java.util.Scanner;
public class Ejercicio18 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame el valor de (a)");
        int a = sc.nextInt();
        System.out.println("Dame el valor de (b)");
        int b = sc.nextInt();
        
        int multiploa = a;
        int multiplob = b;
        while (multiploa != multiplob) {
            
            if (multiploa < multiplob) {
                multiploa += a;    
            } else multiplob += b;
            
            //Debe avanzar el mas pequeño siempre para que el número mas grande no tome una gran delantera
        }
        
        
        System.out.println("El mínimo comun multiplo es " + multiploa );
    }
}