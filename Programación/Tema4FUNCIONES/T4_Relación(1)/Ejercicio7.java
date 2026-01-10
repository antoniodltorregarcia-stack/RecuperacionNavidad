import java.util.Scanner;
public class Ejercicio7 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un parametro (a)");
        int a = sc.nextInt();
        System.out.println("Dame un parametro (b)");
        int b = sc.nextInt();
        
        primo(a,b);
    }
    
    public static void primo (int a,int b) {
        if (a > b) {
            for (int i = b; i <= a; i++) {
                int cont = 0;
        
                for (int x = 1; x <= i; x++) {
                    int div = i % x;
                    if (div == 0) {
                        cont ++;
                    }
                }
                
                if (cont == 2) {
                    System.out.println(i + " = es primo");
                } else System.out.println(i + " = no es primo");
        
            }
        } else if (b > a){
            for (int i = a; i <= b; i++) {
                int cont = 0;
        
                for (int x = 1; x <= i; x++) {
                    int div = i % x;
                    if (div == 0) {
                        cont ++;
                    }
                }
                
                if (cont <= 2) {
                    System.out.println(i + " = es primo");
                } else System.out.println(i + " = no es primo");
        
            }    
        } else System.out.println("Ambos parametros no pueden tener el mismo valor");
        
    }
}