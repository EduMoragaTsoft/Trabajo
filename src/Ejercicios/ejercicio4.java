package Ejercicios;

public class ejercicio4 {
/*
Dado el número a = 29, determina si es primo.
Un número primo solo tiene dos divisores: 1 y él mismo.
 */

    public static void main(String[] args) {
        int a = 29;
        boolean primo = true;
        for(int i = 2; i < a; i++) {
            if (a % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo)
            System.out.println("Es Primo");
        else
            System.out.println("No es primo");
    }
}
