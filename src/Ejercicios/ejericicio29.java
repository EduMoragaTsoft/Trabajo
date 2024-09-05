package Ejercicios;

public class ejericicio29 {
    /*
    Determina si el número a = 64 es un cuadrado perfecto.
    Un cuadrado perfecto es un número que es el resultado de multiplicar un entero
    por sí mismo. En este caso, 8 × 8 = 64.
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
