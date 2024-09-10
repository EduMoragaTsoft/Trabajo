package Ejercicios;

public class ejericicio20 {
    /*
    Determina si el número a = 153 es un número Armstrong.
    Un número Armstrong es igual a la suma de sus dígitos elevados a
    la potencia del número de dígitos. Para 153, sería  1^3+5^3+3^3=153
     */
    public static void main(String[] args) {
        int a = 153;
        int num = 153, cifra = 0, suma = 0;


        while (num != 0) {           //mientras a n le queden cifras
            cifra = (num % 10);     //obtenemos la ultima cifra del número
            suma = suma + cifra;     //sumamos la última cifra de n
            num = num / 10;          //le quitamos a n la última cifra
        }
        System.out.printf(String.valueOf(suma));
    }
    public static void cantDigitos (int num) {
        int res;
        if()
    }
}
