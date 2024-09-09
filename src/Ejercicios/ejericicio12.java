package Ejercicios;

public class ejericicio12 {
    /*
    Dado el número a = 54321,
    invierte el orden de sus dígitos. El resultado sería 12345.
     */
    public static void main(String[] args) {

        int a = 54321;
        int invertido = 0;
        while (a > 0) {
            int ultimo_digito = a % 10;
            invertido = (invertido * 10) + ultimo_digito;
            a = a / 10;
        }
        System.out.print(invertido);
    }
}
