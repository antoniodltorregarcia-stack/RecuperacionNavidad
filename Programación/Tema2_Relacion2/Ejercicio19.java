import java.util.Scanner;
public class Ejercicio19  {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Cuantos grados tiene tu angulo");
        int n = sc.nextInt();
        
        // Rango 360
        
        if (n < 0 ) {
            n += 360;
        } else 
        n = n % 360;
        
        //formula radianes
        
        double radian = n * (3.14 / 180);
        
        //Resultado
        
        System.out.println("El equivalente en radianes es de " + radian);
        
        
    }
}