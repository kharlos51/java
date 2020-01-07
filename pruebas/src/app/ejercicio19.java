package app;

import java.util.Scanner;

/**
 * Pide por teclado un número entero positivo (debemos controlarlo) y muestra el
 * número de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre
 * que tiene 4 cifras. Tendremos que controlar si tiene una o mas cifras, al
 * mostrar el mensaje.
 */
public class ejercicio19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int contador = 0;

        do {
            System.out.println("Introduce un numero");
            num1 = sc.nextInt();
            String conver = Integer.toString(num1);
            contador = (int)conver.length();
        } while (num1 < 0); 

        if (contador == 1) {
            System.out.println("el numero: " + num1 + " tiene " + contador + " cifra");
        } else {
            System.out.println("el numero: " + num1 + " tiene " + contador + " cifras");
        }
        sc.close();
    }
}