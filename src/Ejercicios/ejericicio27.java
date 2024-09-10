package Ejercicios;

public class ejericicio27 {
    /*
    Intercambia los valores de a = 5 y b = 10
    sin usar una tercera variable auxiliar.
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 0;
        if(a!=b) {
             c = a;
             a = b;
             b = c;
         }
        System.out.println("Valor de A: "+a + "  Valor de B: "+b);
    }
}
