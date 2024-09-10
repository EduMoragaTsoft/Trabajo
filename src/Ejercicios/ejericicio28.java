package Ejercicios;

public class ejericicio28 {
/*
Dados los números a = 48 y b = 18,
calcula su MCD (máximo común divisor). El MCD es el número más grande que divide
exactamente a ambos números.
 */

    public static void main(String[] args) {
        int a =48;
        int b = 18;
        int temp = 0;
        while (b != 0) {
            temp = b;
            b= a % temp;
            a = temp;
        }
        System.out.printf(String.valueOf(a));
    }
}
