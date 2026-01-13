import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce los dias");
        int dias = sc.nextInt();
        System.out.println("Introduce las horas");
        int horas = sc.nextInt();
        System.out.println("Introduce los minutos");
        int mins = sc.nextInt();
        
        System.out.println(dias + " = " + dia(dias) + " segundos");
        System.out.println(horas + " = " + hora(horas) + " segundos");
        System.out.println(mins + " = " + minutos(mins) + " segundos");
        System.out.println("Total = " + total(dias, horas, mins) + " segundos");
    }
    
    public static int dia (int dias) {
        dias *= 24;
        dias *= 3600;
        return dias;
    }
    
    public static int hora (int horas) {
        horas *= 3600;
        return horas;
    }
    
    public static int minutos (int mins) {
        mins *= 60;
        return mins;
    }
    
    public static int total (int dias, int horas, int mins) {
       dias *= 24;
       dias *= 3600;
       horas *= 3600;
       mins *= 60;
       
       return dias + horas + mins;
    }
    
}