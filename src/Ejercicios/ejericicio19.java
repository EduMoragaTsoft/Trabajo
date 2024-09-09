package Ejercicios;

public class ejericicio19 {
    /*
    Determina si el número a = 28 es un número perfecto.
    Un número perfecto es aquel cuya suma de sus
    divisores (excluyendo el número mismo) es igual al número.
     */
    public static void main(String[] args) {
        int a = 28, suma = 0;
        for (int i = 1; i < a; i++) {  // i son los divisores. Se divide desde 1 hasta n-1
            if (a % i == 0) {
                suma = suma + i;   // si es divisor se suma
            }
        }
        if (suma == a) {           // si el numero es igual a la suma de sus divisores es perfecto
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");


        }
    }
}
