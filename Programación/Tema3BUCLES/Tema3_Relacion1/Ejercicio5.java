import java.util.Scanner;
public class Ejercicio5 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int n = 0;
        int puntos = 0;
        int Resultado = 0;
        
        while (true) {
            
            int n1 = (int)(Math.random () * 100 ) + 1;
            int n2 = (int)(Math.random () * 100 ) + 1;
            Resultado = n1 + n2;
            
            System.out.println(n1 + " + " + n2 + " = ");
            n = sc.nextInt();
            
            if ( n != Resultado ) {
                break;
            }
            
            puntos ++;
        }
        
        
        System.out.println("Fallaste, la solución era " + Resultado);
        System.out.println("Número de aciertos = " + puntos);
    }
}