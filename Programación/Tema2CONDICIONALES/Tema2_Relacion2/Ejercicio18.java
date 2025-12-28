import java.util.Scanner;
public class Ejercicio18 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int n1 = (int)(Math.random() * 99) + 1;
        int n2 = (int)(Math.random() * 99) + 1;
        int op = (int)(Math.random() * 3) + 1;
        
        if (op == 1) {
            System.out.println( n1 + " + " + n2 + " = ");
            int n = sc.nextInt();
            int Solucion = n1 + n2;
            
            if (n == Solucion) {
            System.out.println("Correcto");    
            } else System.out.println("Error, el resultado era " + Solucion);
        } else if (op == 2) {
            System.out.println( n1 + " - " + n2 + " = ");
            int n = sc.nextInt();
            int Solucion = n1 - n2;
            
            if (n == Solucion) {
            System.out.println("Correcto");    
            } else System.out.println("Error, el resultado era " + Solucion);    
        } else if (op == 3) {
            System.out.println( n1 + " * " + n2 + " = ");
            int n = sc.nextInt();
            int Solucion = n1 * n2;
            
            if (n == Solucion) {
            System.out.println("Correcto");    
            } else System.out.println("Error, el resultado era " + Solucion);    
        }
    }
}