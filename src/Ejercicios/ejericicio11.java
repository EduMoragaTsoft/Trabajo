package Ejercicios;

public class ejericicio11 {
    /*
    Genera los primeros N = 10 números de la secuencia de Fibonacci,
    donde cada número es la suma de los dos anteriores.
    La secuencia comienza con 0 y 1.
     */
    public static void main(String[] args) {

        // Set it to the number of elements you want in the Fibonacci Series
        int cantidadNumeros = 10;
        int numeroPrevio = 0;
        int numeroSiguiente = 1;
        System.out.print("La serie de Fibonacci para los primeros "+cantidadNumeros+" números es: ");
        for (int i = 1; i <= cantidadNumeros; ++i) {
            System.out.print(numeroPrevio + " ");
            int suma = numeroPrevio + numeroSiguiente;
            numeroPrevio = numeroSiguiente;
            numeroSiguiente = suma;
        }
    }
}
