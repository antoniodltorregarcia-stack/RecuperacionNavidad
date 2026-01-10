import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        while (true) {
            System.out.println("¿Qué deseas calcular Area (1) , Volumen (2) , Finalizar (3)");
            int n = sc.nextInt();
            
            if (n == 1) {
                System.out.println("Dame el radio de la base");
                int radio = sc.nextInt();
                System.out.println("Dame el alto");
                int alto = sc.nextInt();
                
                Area(radio,alto);
                
            } else if (n == 2) {
                System.out.println("Dame el radio de la base");
                int radio = sc.nextInt();
                System.out.println("Dame el alto");
                int alto = sc.nextInt();
                
                Volumen(radio,alto);
            } else break;
        }
        
        System.out.println("Programa Finalizado...");
    }
    
    static void Area (int radio, int alto) {
        double Area = (2 * 3.14) * (radio * radio) + 2 * 3.14 * radio * alto;
        System.out.println("El area total es de = " + Area);
    }
    
    static void Volumen(int radio,int alto) {
        double Volumen = 3.14 * (radio * radio) * alto;
        System.out.println("El volumen total es de = " + Volumen);
    }
}