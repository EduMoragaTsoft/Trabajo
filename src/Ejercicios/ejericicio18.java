package Ejercicios;

public class ejericicio18 {
    /*
    Dado el número a = 2 y la potencia b = 8, calcula a^b,
    es decir, 2 elevado a la potencia de 8.
     */
    public static void main(String[] args) {
        int a = 2, b = 8, total = 1;
        for(int i=1; i<b+1;i++){
            total = total * a;
        }
            System.out.println(total);
    }
}
