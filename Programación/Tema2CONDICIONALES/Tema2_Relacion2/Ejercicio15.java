import java.util.Scanner;
public class Ejercicio15 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime la base en cm");
        int base = sc.nextInt();
        System.out.println("Dime la altura en cm");
        int altura = sc.nextInt();
        
        int area = (base * altura) / 2;
        
        if (base < 0 || altura < 0) {
            System.out.println("No es posible añadir numeros negativos");
        } else System.out.println("El area de tu triangulo es de " + area + " cm2.");
    }
}