package Ejercicios;

public class ejericicio28 {
/*
Dados los números a = 48 y b = 18,
calcula su MCD (máximo común divisor). El MCD es el número más grande que divide
exactamente a ambos números.
 */

    public static void main(String[] args) {
        double a= 64;
        double b = Math.sqrt(a);
        double c = b*b;
        if(c==a){
            System.out.println("Es cuadrado perfecto");
        } else {
            System.out.println("No es cuadrado perfecto");
        }


    }
}
