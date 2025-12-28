import java.util.Scanner;
public class Ejercicio12 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime el dia del mes");
        int dia = sc.nextInt();
        System.out.println("Dime el mes (en número)");
        int mes = sc.nextInt();
        System.out.println("Dime el año");
        int año = sc.nextInt();
        
        // limite dias
        if (dia > 31 || dia <= 0) {
            System.out.println("Fecha no valida");
        } else if (mes <= 0 ||mes > 12) {
            System.out.println("Fecha no valida");
        } else if (mes == 2) {
            if (dia > 28) {
                System.out.println("Fecha no valida");
            } else System.out.println("Fecha correcta");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                System.out.println("Fecha no valida");
            } else System.out.println("Fecha correcta");
        } else System.out.println("Fecha correcta");
    }
}