package Ejercicios;

public class ejericicio9 {
    /*
    Dado el número N = 50, calcula la suma de los primeros N números
    naturales. Los números naturales son los enteros positivos
    comenzando desde 1.
     */
    public static void main(String[] args) {
        int n = 50, suma = 0;
        for (int i = 1; i < n+1;i++){
            suma = i + suma;

        }
        System.out.println("El suma de n números naturales es: "+suma);
    }
}
