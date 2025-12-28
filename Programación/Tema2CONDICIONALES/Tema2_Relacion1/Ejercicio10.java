import java.util.Scanner;
public class Ejercicio10 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("¿Que has sacado?");
        int iNota = sc.nextInt();
        
        switch (iNota) {
            case 0,1,2,3,4:
                System.out.println("Un " + iNota + " es suspenso");
                break;
            case 5:
                System.out.println("Un " + iNota + " es suficiente");
                break;
            case 6:
                System.out.println("Un " + iNota + " es bien");
                break;
            case 7,8:
                System.out.println("Un " + iNota + " es notable");
                break;
            case 9,10:
                System.out.println("Un " + iNota + " es sobresaliente");
                break;
            default:
                System.out.println(iNota + " no entra dentro de los parametros");
        }
    }
}
