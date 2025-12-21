import java.util.Scanner;
public class Ejercicio12 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime los número de tu Dni y te dire tu letra");
        int n = sc.nextInt();
        
        switch (n % 23) {
            case 0:
                System.out.println(n + "T");
                break;
            case 1:
                System.out.println(n + "R");
                break;
            case 2:
                System.out.println(n + "W");
                break;
            case 3:
                System.out.println(n + "A");
                break;
            case 4:
                System.out.println(n + "G");
                break;
            case 5:
                System.out.println(n + "M");
                break;
            case 6:
                System.out.println(n + "Y");
                break;
            case 7:
                System.out.println(n + "F");
                break;
            case 8:
                System.out.println(n + "P");
                break;
            case 9:
                System.out.println(n + "D");
                break;
            case 10:
                System.out.println(n + "X");
                break;
            case 11:
                System.out.println(n + "B");
                break;
            case 12:
                System.out.println(n + "N");
                break;
            case 13:
                System.out.println(n + "J");
                break;
            case 14:
                System.out.println(n + "Z");
                break;
            case 15:
                System.out.println(n + "S");
                break;
            case 16:
                System.out.println(n + "Q");
                break;
            case 17:
                System.out.println(n + "V");
                break;
            case 18:
                System.out.println(n + "H");
                break;
            case 19:
                System.out.println(n + "L");
                break;
            case 20:
                System.out.println(n + "C");
                break;
            case 21:
                System.out.println(n + "K");
                break;
            case 22:
                System.out.println(n + "E");
                break;
        }
    }
}