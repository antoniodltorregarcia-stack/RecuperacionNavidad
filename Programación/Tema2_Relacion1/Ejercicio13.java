import java.util.Scanner;
public class Ejercicio13 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame la hora (formato 0 - 23)");
        int hora = sc.nextInt();
        System.out.println("Dame los minutos (formato 0 - 59)");
        int mins = sc.nextInt();
        System.out.println("Dame los segundos (formato 0 - 59)");
        int seg = sc.nextInt();
        
        System.out.println("Tu hora un segundo despues es: ");
        if (hora > 23 || hora < 0) {
            System.out.println ("Datos fuera del formato");
        } else if (mins > 59 || mins < 0) {
            System.out.println ("Datos fuera del formato");
        } else if (seg > 59 || seg < 0) {
            System.out.println ("Datos fuera del formato");
        } else if (seg == 59) {
            if (mins == 59) {
                if (hora == 23) {
                    System.out.println("00:00:00");
                } else System.out.println((hora + 1) + ":00:00");
            } else System.out.println(hora + ":" + (mins + 1) + ":00"); 
        } else System.out.println(hora + ":" + mins + ":" + (seg + 1));    
    }
}
