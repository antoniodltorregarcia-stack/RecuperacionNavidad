import java.util.Scanner;
public class Ejercicio13 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Escribe las calificaciones de los alumnos");
        
        int n = 0;
        int suspensos = 0;
        int aprobados = 0;
        int condicionados = 0;
        for (int i = 1; i <= 6; i++) {
            n = sc.nextInt();
            if (n < 4) {
                System.out.println("Suspenso");
                suspensos ++;
            } else if (n >= 5) {
                System.out.println("Aprobado");
                aprobados++;
            } else if (n == 4) {
                System.out.println("Condicionado");
                condicionados++;
            }
            
        }
        
        System.out.println("Hay un total de " + suspensos + " suspensos.");
        System.out.println("Hay un total de " + aprobados + " aprobados.");
        System.out.println("Hay un total de " + condicionados + " condicionados.");
    }
}