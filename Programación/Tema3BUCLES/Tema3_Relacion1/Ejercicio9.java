import java.util.Scanner;
public class Ejercicio9 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime un número del 1 al 10 y te dire su tabla de multiplicar");
        int n = sc.nextInt();
        int Resultado;
        
        for (int i = 0; i <= 10 ; i++) {
            Resultado = n * i;
            if (i == 10) {
            System.out.println( n + " x " + i + " = " + Resultado);    
            }else System.out.println( n + " x " + i + "  = " + Resultado);
        }
    }
}