import java.util.Scanner;
public class Ejercicio5 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("hora 1 =");
        int hora1 = sc.nextInt();
        System.out.println("minutos 1 =");
        int minuto1 = sc.nextInt();
        System.out.println("hora 2 =");
        int hora2 = sc.nextInt();
        System.out.println("minutos 2 =");
        int minuto2 = sc.nextInt();
        
        System.out.println("La diferencia de mins es de = " + diferencia(hora1,minuto1,hora2,minuto2));
        
    }
    
    public static int diferencia(int hora1, int minuto1, int hora2, int minuto2) {
        hora1 *= 60;
        minuto1 += hora1;
        
        hora2 *= 60;
        minuto2 += hora2;
        
        if (minuto1 > minuto2) {
            return minuto1 - minuto2;
        } else if (minuto2 < minuto1){
            return minuto2 - minuto1;
        } else return 0;
    }
}