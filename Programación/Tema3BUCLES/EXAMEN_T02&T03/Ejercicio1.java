import java.util.Scanner;
public class Ejercicio1 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
    
        System.out.println("Dame números y te dire el mayor, cuantos son multiplos de 3, y el mayor");
        int n = 0;
        int cont = 0;
        int multiplo3 = 0;
        int cont3 = 0;
        int nMayor = 0;
    
        while (n >= 0) {
        
            n = sc.nextInt();
            
            multiplo3 = n % 3;
            
            if (multiplo3 == 0) {
                cont3++;    
            }
            
            cont++;
    
            if (nMayor > n) {
                nMayor = nMayor;
            } else if (nMayor < n) {
                nMayor = n;    
            }
        
        
        }
        
        System.out.println("Cantidad de Números: " + (cont - 1));
        System.out.println("Múltiplos de 3: " + cont3);
        System.out.println("Mayor: " + nMayor);
    }
}