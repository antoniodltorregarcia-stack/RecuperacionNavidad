import java.util.Scanner;
public class Ejercicio14 {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dame un número entre 1 - 99");
        int n = sc.nextInt();
        
        if (n < 1 || n > 99) {
            System.out.println("Numero fuera de los parametros");
        } else {
           String texto = "";
           switch (n) {
                case 1: texto = "uno"; break;
                case 2: texto = "dos"; break;
                case 3: texto = "tres"; break;
                case 4: texto = "cuatro"; break;
                case 5: texto = "cinco"; break;
                case 6: texto = "seis"; break;
                case 7: texto = "siete"; break;
                case 8: texto = "ocho"; break;
                case 9: texto = "nueve"; break;
                case 10: texto = "diez"; break;
                case 11: texto = "once"; break;
                case 12: texto = "doce"; break;
                case 13: texto = "trece"; break;
                case 14: texto = "catorce"; break;
                case 15: texto = "quince"; break;
                case 16: texto = "dieciséis"; break;
                case 17: texto = "diecisiete"; break;
                case 18: texto = "dieciocho"; break;
                case 19: texto = "diecinueve"; break;
                case 20: texto = "veinte"; break;
                case 21: texto = "veintiuno"; break;
                case 22: texto = "veintidós"; break;
                case 23: texto = "veintitrés"; break;
                case 24: texto = "veinticuatro"; break;
                case 25: texto = "veinticinco"; break;
                case 26: texto = "veintiséis"; break;
                case 27: texto = "veintisiete"; break;
                case 28: texto = "veintiocho"; break;
                case 29: texto = "veintinueve"; break;
                default:
                    // Para números >= 30
                    int decena = n / 10;
                    int unidad = n % 10;

                    switch (decena) {
                        case 3: texto = "treinta"; break;
                        case 4: texto = "cuarenta"; break;
                        case 5: texto = "cincuenta"; break;
                        case 6: texto = "sesenta"; break;
                        case 7: texto = "setenta"; break;
                        case 8: texto = "ochenta"; break;
                        case 9: texto = "noventa"; break;
                    }

                    if (unidad != 0) {
                        switch (unidad) {
                            case 1: texto += " y uno"; break;
                            case 2: texto += " y dos"; break;
                            case 3: texto += " y tres"; break;
                            case 4: texto += " y cuatro"; break;
                            case 5: texto += " y cinco"; break;
                            case 6: texto += " y seis"; break;
                            case 7: texto += " y siete"; break;
                            case 8: texto += " y ocho"; break;
                            case 9: texto += " y nueve"; break;
                        }
                    }
            }

            System.out.println("Número en letras: " + texto);
        }
    }
}