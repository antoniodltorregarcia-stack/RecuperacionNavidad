import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        int n = 0;
        int arbol = 0;
        int arbolmasgrande = 0;
        int arbolmasgrandeN = 0;
        
        while (n != -1) {
            
            System.out.println("¿Cuanto mide el arbol " + arbol + " ?");
            n = sc.nextInt();
            
            
            
            if (n > arbolmasgrande) {
                arbolmasgrande = n;
                arbolmasgrandeN = arbol;
            }
            
            arbol ++;
        }
        
        System.out.println("El arbol mas grande es el número " + arbolmasgrandeN + " y mide " + arbolmasgrande + " cm.");
    }
}