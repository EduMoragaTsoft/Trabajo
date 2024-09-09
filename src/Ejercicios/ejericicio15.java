package Ejercicios;

public class ejericicio15 {
    /*
     Dado el radio r = 7 de un círculo,
     calcula su área usando la fórmula: area= pi x r^2
     */
    public static void main(String[] args) {
        int r = 7;
        double rCuadrado = r*r;
        double pi = Math.PI;
        double area = pi*rCuadrado;
        System.out.printf(String.valueOf(area));
    }
}
