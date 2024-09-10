package Ejercicios;

import java.util.Scanner;

public class ejericicio20 {
    /*
    Determina si el número a = 153 es un número Armstrong.
    Un número Armstrong es igual a la suma de sus dígitos elevados a
    la potencia del número de dígitos. Para 153, sería  1^3+5^3+3^3=153
     */
    public static void main(String[] args) {

        int num1 = 153;
        int num2 = 153;
        int num3 = 153;
        double cifra = 0;
        double suma = 0;
        int contDig = 0;
        while (num1 >= 1) {
            contDig++;
            num1/=10;
        }

        while (num2 != 0) {           //mientras a n le queden cifras
            cifra = Math.pow(num2 % 10,contDig); //obtenemos la ultima cifra del número
            suma = suma + cifra;   //sumamos la última cifra de n
            num2 = num2 / 10;            //le quitamos a n la última cifra
        }
        System.out.println(suma);
        if (suma == num3) {
            System.out.println("Es un número Armstrong");
        }else {
            System.out.println("No es un número Armstrong");
        }
    }
}
