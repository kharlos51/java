package app;

import java.util.Scanner;

/**
 * 6) Lee un número por teclado e indica si es divisible 
 * entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
 */
public class ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero= sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero: " + numero + " es divisible entre 2");
        }
        else{
            System.out.println("El numero: " + numero + " no es divisible entre 2");
        }
        sc.close();
    }
}