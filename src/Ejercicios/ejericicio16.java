package Ejercicios;

public class ejericicio16 {
    /*
    Dado el número a = 5678, suma todos sus dígitos.
    El resultado sería 5 + 6 + 7 + 8 = 26.
     */
    public static void main(String[] args) {
        int num = 5678, cifra = 0, suma = 0;

        while (num != 0) {           //mientras a n le queden cifras
            cifra = num % 10;        //obtenemos la ultima cifra del número
            suma = suma + cifra;   //sumamos la última cifra de n
            num = num / 10;            //le quitamos a n la última cifra
        }
        System.out.printf(String.valueOf(suma));
    }
}
