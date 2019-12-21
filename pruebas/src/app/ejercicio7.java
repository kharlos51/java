package app;

import java.util.Scanner;

/**
 * Lee un número por teclado y muestra por consola, el carácter al que pertenece
 * en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.
 */
public class ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un codigo de la tabla ASCII");
        int numero= sc.nextInt();

        char caracter = (char) numero;
        System.out.println("El caracter es: " + caracter);
        sc.close();
    }
}