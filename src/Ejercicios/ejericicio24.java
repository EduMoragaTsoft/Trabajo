package Ejercicios;

public class ejericicio24 {
    /*
    Suma todos los múltiplos de a = 3 dentro del rango de 1 a 50.
     Un múltiplo de un número es el resultado de multiplicarlo
     por un entero.
     */
    public static void main(String[] args) {
        int a = 3;
        int b = 50;
        int sumaImpares = 0;
        // Calcular la suma de los números pares
        System.out.println("Calculando la suma de los números impares entre " + a + " y " + b + "...");
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sumaImpares += i;
            }
        }
        System.out.println(sumaImpares);
    }
}
