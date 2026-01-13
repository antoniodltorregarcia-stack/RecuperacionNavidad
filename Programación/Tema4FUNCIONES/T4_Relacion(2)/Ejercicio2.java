import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame el punto x1 (metros)");
        int x1 = sc.nextInt();
        System.out.println("Dame el punto y1 (metros)");
        int y1 = sc.nextInt();
        System.out.println("Dame el punto x2 (metros)");
        int x2 = sc.nextInt();
        System.out.println("Dame el punto y2 (metros)");
        int y2 = sc.nextInt();
        
        System.out.println("La distancia es = " + distancia(x1, y1, x2, y2));
    }
    
    public static double distancia (double x1, double y1, double x2, double y2) {
        double n = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        return Math.sqrt(n);
        
        /* Math.sqrt  en Java es un método de la clase Math que sirve para calcular
        la raíz cuadrada de un número.
        
        double resultado = Math.sqrt(25);
        System.out.println(resultado); 
        [imprime 5.0]
        
        
        
        */
    }
}