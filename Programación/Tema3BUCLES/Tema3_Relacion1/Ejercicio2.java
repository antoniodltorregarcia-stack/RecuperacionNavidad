import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int numalumnos = 0; 
        int mayoredad = 0;
        int sumaedad = 0;
        int media = 0;
        
        System.out.println("Introduce la edad del alumno (numero negativo finaliza)"); 
        int n = sc.nextInt();
        while (n > 0) {
            numalumnos ++;
            
            if (n >= 18) {
                mayoredad ++;
            }
            
            sumaedad += n;
            
            media = sumaedad / numalumnos;
            
            System.out.println("Introduce la edad del alumno");
            n = sc.nextInt();
        }
        
        System.out.println("La suma de todas las edades es de: " + sumaedad);
        System.out.println("La media de edad es de:" + media);
        System.out.println("El numero de alumnos introducidos es de: " + numalumnos);
        System.out.println("Existen " + mayoredad + " mayores de edad");
        System.out.println("Programa finalizado...");
    }
}