import java.util.Scanner;
public class Ejercicio8 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        while (true) {
            System.out.println("¿Que deseas calcular?");
            System.out.println("Suma(1) Resta(2) Multiplicación(3) División(4) Finalizar(0)");
            int options = sc.nextInt();
            
            if (options == 1) {
                suma();
            } else if (options == 2) {
                resta();
            } else if (options == 3) {
                multiplicacion();
            } else if (options == 4) {
                division();
            } else if (options == 0) {
                break;
            } else System.out.println("Comando no reconocido");
        }
    }
    
    public static void suma () {
        Scanner sc = new Scanner (System.in);
        System.out.println("Elegiste suma, dame el valor (a)");
        int a = sc.nextInt();
        System.out.println("Dame el valor (b)");
        int b = sc.nextInt();
        
        int suma = a + b;
        System.out.println( a + " + " + b + " = " +  suma );
    }
    
    public static void resta () {
        Scanner sc = new Scanner (System.in);
        System.out.println("Elegiste resta, dame el valor (a)");
        int a = sc.nextInt();
        System.out.println("Dame el valor (b)");
        int b = sc.nextInt();
        
        int resta = a - b;
        System.out.println( a + " - " + b + " = " +  resta );
    }
    
    public static void multiplicacion () {
        Scanner sc = new Scanner (System.in);
        System.out.println("Elegiste multiplicación, dame el valor (a)");
        int a = sc.nextInt();
        System.out.println("Dame el valor (b)");
        int b = sc.nextInt();
        
        int multiplicacion = a * b;
        System.out.println( a + " x " + b + " = " +  multiplicacion );
    }
    
    public static void division () {
        Scanner sc = new Scanner (System.in);
        int b;
        System.out.println("Elegiste division, dame el valor (a)");
        int a = sc.nextInt();
        while (true) {
            System.out.println("Dame el valor (b)");
            b = sc.nextInt();
            if (b == 0) {
                System.out.println("El divisor no puede ser cero, vuelve a intentarlo");
            } else break;
        }
        
        
        int division = a / b;
        System.out.println( a + " % " + b + " = " +  division );
    }
    
}