package Ejercicios;

import java.util.Scanner;

public class ejericicio14 {
    /*
    Dado el número decimal a = 45, conviértelo a binario.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 45;

        String bin = Integer.toBinaryString(num);
        System.out.printf(bin);

    }
}
