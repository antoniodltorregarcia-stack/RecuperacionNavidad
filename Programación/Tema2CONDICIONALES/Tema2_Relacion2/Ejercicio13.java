import java.util.Scanner;
public class Ejercicio13 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int comidaDiaria;
        int numAnmales;
        int kilosPorAnimal;
        
        System.out.println("¿Cuantos animales hay?");
        numAnmales = sc.nextInt();
        System.out.println("¿Cuanta comida se compra cada dia?");
        comidaDiaria = sc.nextInt();
        System.out.println("¿Cuanto come de media cada animal");
        kilosPorAnimal = sc.nextInt();
        
        if (numAnmales <= 0 || comidaDiaria <= 0 || kilosPorAnimal <= 0) {
            System.out.println("El valor no puede ser 0 o menos");
        } else if (kilosPorAnimal < (comidaDiaria * numAnmales)) {
            int Media = comidaDiaria * numAnmales;
            int ComidaFaltante = kilosPorAnimal - Media * -1 ;
            System.out.println("Faltan " + ComidaFaltante + " kilos para llegar a la media");
        } else if (kilosPorAnimal > (comidaDiaria * numAnmales)) {
            System.out.println("La media esta correcta");    
        }
    }
}