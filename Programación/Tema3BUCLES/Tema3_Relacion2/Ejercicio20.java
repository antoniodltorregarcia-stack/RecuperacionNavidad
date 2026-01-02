import java.util.Scanner;
public class Ejercicio20 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 1;
        int DineroTotal = 0;
        while (n != 0) {
            
            System.out.println("¿Donde guardas tu dinero?");
            sc.nextLine();
            System.out.println("¿Cuanto?");
            n = sc.nextInt();
            sc.nextLine();
        
            
            DineroTotal = DineroTotal + n;
            
        }
        System.out.println("Dinero Total" + DineroTotal);
    }
}