package Ejercicios;

public class ejericicio22 {
    /*
    Cuenta cuántos dígitos tiene el número a = 987654.
    El resultado sería 6 dígitos.
     */
    public static void main(String[] args) {
        int a = 987654, contDig = 0;
        contDig = 0;
        while (a >= 1) {
            contDig++;
            a/=10;
        }
        System.out.println(contDig);
    }
}
