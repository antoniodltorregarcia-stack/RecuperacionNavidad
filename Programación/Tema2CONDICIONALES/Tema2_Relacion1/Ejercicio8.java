import java.util.Scanner;
public class Ejercicio8 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime el valor de (a)");
        int a = sc.nextInt();
        System.out.println("Dime el valor de (b)");
        int b = sc.nextInt();
        System.out.println("Dime el valor de (c)");
        int c = sc.nextInt();
        
        int discriminante = b * b - 4 * a * c;
        
        if (discriminante > 0) {
        
            double x1 = (-b + Math.sqrt(discriminante)) / (2*a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2*a);
            System.out.println("Hay dos soluciones reales:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            
        } else if (discriminante == 0) {
            
            double x = -b / (2*a);
            System.out.println("Hay una única solución real:");
            System.out.println("x = " + x);
            
        } else System.out.println("No existen soluciones reales.");
    }
}