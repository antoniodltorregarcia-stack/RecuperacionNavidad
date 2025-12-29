import java.util.Scanner;
public class Ejercicio14 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int n = 1;
        int Resultado;
        
        while ( n != 11) {
            for (int i = 0; i <= 10 ; i++) {
            Resultado = n * i;
            if (i == 10) {
            System.out.println( n + " x " + i + " = " + Resultado);    
            }else System.out.println( n + " x " + i + "  = " + Resultado);
            }
            
            n++;
            System.out.println("");
        }
        
    }
}