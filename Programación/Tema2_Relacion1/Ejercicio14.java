import java.util.Scanner;
public class Ejercicio14 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime el día");
        int dia = sc.nextInt();
        System.out.println("Dime el mes (números)");
        int mes = sc.nextInt();
        System.out.println("Dime el año");
        int año = sc.nextInt();
        
        System.out.println("Tu fecha mas un dia es:");
        
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 ) {
            if (dia > 31) {
                System.out.println ("fecha invalida");
            } else if (dia == 31) {
                System.out.println("1/" + (mes + 1) + "/" + año);
            } else System.out.println((dia + 1) + "/" + mes + "/" + año);
        } else if (mes == 2) {
            if (dia < 28) {
                System.out.println("fecha invalida");
            } else if (dia == 28) {
                System.out.println("1/" + (mes + 1) + "/" + año);        
            } else System.out.println((dia + 1) + "/" + mes + "/" + año);
        } else if (mes == 4 ||mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                System.out.println ("fecha invalida");
            } else if (dia == 30) {
                System.out.println("1/" + (mes + 1) + "/" + año);
            } else System.out.println((dia + 1) + "/" + mes + "/" + año);    
        } else if (mes == 12) {
            if (dia > 31) {
                System.out.println ("fecha invalida");
            } else if (dia == 31) {
                System.out.println("1/1"  + "/" + (año + 1));
            } else System.out.println((dia + 1) + "/" + mes + "/" + año);    
        }
    }
}