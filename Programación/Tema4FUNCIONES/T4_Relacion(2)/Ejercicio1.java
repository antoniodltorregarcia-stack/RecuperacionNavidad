import java.util.Scanner;
public class Ejercicio1 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame el radio y calculare la superficie y el volumen de tu esfera");
        int radio = sc.nextInt();
        
        System.out.println("Superficie = " + superficie(radio));
        System.out.println("Volumen = " + volumen(radio));
    }
    
    public static double superficie (int radio) {
        
        radio *= radio;
        return 4 * 3.14 * radio;
    }
    
    public static double volumen (int radio) {
        radio *= radio;
        radio *= radio;
        
        return (4 * 3.14) / 3 * radio;
    }
}