import java.util.Scanner;
public class Ejercicio13 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime primero las horas(0-24)");
        int hora = sc.nextInt();
        System.out.println("Dime ahora los minutos(0-59)");
        int mins = sc.nextInt();
        System.out.println("Por último los segundos(0-59)");
        int segs = sc.nextInt();
        
        System.out.println("Tu hora actual es de " + hora + ":" + mins + ":" + segs);
        System.out.println("¿Cuantos segundos quieres añadir?");
        int n = sc.nextInt();
        
        
        for (int i = 0; i <= n - 1 ; i++) {
            if (hora == 23 && mins == 59 && segs == 59) {
                segs = 0;
                mins = 0;
                hora = 0;
            } else if (mins == 59 && segs == 59) {
                segs = 0;
                mins = 0;
                hora++;
            } else if (segs == 59) {
                segs = 0;
                mins++;
            } else 
            segs++;
        }
        
        System.out.println("Tu nueva hora + " + n + " segundos es: ");
        if (hora < 9 && mins < 9 && segs < 9) {
            System.out.print("0" + hora + ":0" + mins + ":0" + segs);
    
        } else if (mins < 9 && segs < 9) {
            System.out.print(hora + ":0" + mins + ":0" + segs);        
        } else if ( segs < 9) {
            System.out.print(hora + mins + ":0" + segs);    
        } else
        System.out.print(hora + ":" + mins + ":" + segs);
    }
        
}