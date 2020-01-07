package app;

import java.util.Scanner;

/**
 * 15) Lee un número por teclado y comprueba que 
 * este numero es mayor o igual que cero, si no lo 
 * es lo volverá a pedir (do while), después muestra 
 * ese número por consola.
 */
public class ejercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("introduce un numero mayor que cero");
            num = sc.nextInt();

        } while (num <= 0);

        sc.close();
        System.out.println("el numero es: " + num);
    }
}