package Ejercicios;

public class ejericicio10 {
    /*
    Dado el número a = 6, calcula su factorial.
     El factorial de un número se obtiene multiplicando
     todos los números desde 1 hasta el número dado.
     */
    public static void main(String[] args) {
        int a = 6, factorial = 1;
        for (int i = 1; i < a+1;i++){
            factorial = i * factorial;

        }
        System.out.println("El promedio es: "+factorial);
    }
}
