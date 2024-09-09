package Ejercicios;

public class ejercicio5 {
    /*
Dados los números a = 5, b = 12 y c = 9,
encuentra cuál de ellos es el mayor.
     */

    public static void main(String[] args) {
        int a = 5, b = 12, c = 9;
        System.out.println("A: "+a +", B: "+b+", C: "+c);
        if(a>b && a>c){
            System.out.println("A es mayor");
        }
        if(b>a && b>c){
            System.out.println("B es mayor");
        }
        if(c>b && c>b){
            System.out.println("C es mayor");
        }
    }
}
