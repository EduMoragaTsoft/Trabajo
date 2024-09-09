package Ejercicios;

public class ejericicio17 {
    /*
    Suma todos los números pares entre a = 1 y b = 100.
    Un número es par si es divisible por 2.
     */
    public static void main(String[] args) {
        int a = 1;
        int suma = 0;
        while (a < 101) {
            a = a + 1;
            if ((a % 2)==0)
            {
                suma = suma + a;
            }
        }
        System.out.println(" la suma es: " +suma);
    }
}
