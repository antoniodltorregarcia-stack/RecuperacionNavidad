import java.util.Scanner;
public class Ejercicio12 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe las calificaciones de los alumnos");
        
        int n = 0;
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            n = sc.nextInt();
            if (n < 5) {
                System.out.println("Suspenso");
                cont ++;
            } else System.out.println("Aprobado");
            
        }
        
        System.out.println("Hay un total de " + cont + " suspensos.");
    }
}