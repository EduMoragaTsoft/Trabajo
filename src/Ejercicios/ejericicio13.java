package Ejercicios;

public class ejericicio13 {
    /*
    Determina si el número a = 1221 es palíndromo,
    es decir, si se lee igual de izquierda a derecha
    que de derecha a izquierda.
     */
    public static void main(String[] args) {
        System.out.println(esPalindromo(1221));
    }
    public static boolean esPalindromo (int num) {
        String numText = String.valueOf(num);
        int i = 0;
        int j = numText.length() - 1;
        while (i < j) {
            if (numText.charAt(i) != numText.charAt(j)) {
                System.out.println("No es Palindromo");
                return false;
            }
            ++i;
            --j;
        }
        System.out.println("Es Palindromo");
        return true;
    }
}
