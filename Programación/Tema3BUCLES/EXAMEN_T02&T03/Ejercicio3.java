import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame la hora");
        int hora = sc.nextInt();
        System.out.println("Dame los minutos");
        int mins = sc.nextInt();
        System.out.println("Dame los segundos");
        int segs = sc.nextInt();
        
        System.out.println("cuantos minutos quieres aumentar");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            if (mins == 59) {
                mins = 0;
                if (hora == 23) {
                    hora = 0;
                } else hora++;
            } else mins++;
            
        }
        
        if (mins < 10) {
            System.out.println(hora + ":0" + mins + ":" + segs);
        } else if (mins < 10 && segs < 10) {
            System.out.println(hora + ":0" + mins + ":0" + segs);    
        } else if (hora < 10) {
            System.out.println("0" + hora + ":" + mins + ":" + segs);    
        } else
        System.out.println(hora + ":" + mins + ":" + segs);
    }
}