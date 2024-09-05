package Ejercicios;

public class ejercicio3 {
    /*
    Dado el número a = 15, determina si es par o impar. Un número es par si es divisible por 2, y es impar si no lo es.
     */
    public static void main(String[] args) {
        int a = 15;
        int b = a%2;
        if(b==0){
            System.out.println("Es par" );
        }else
            System.out.println("Es impar");

    }
}
