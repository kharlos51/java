package app;

import java.util.Scanner;

/**
 * 13) Realiza una aplicación que nos pida un número de ventas a introducir,
 * después nos pedirá tantas ventas por teclado como número de ventas se hayan
 * indicado. Al final mostrara la suma de todas las ventas. Piensa que es lo que
 * se repite y lo que no.
 */
public class ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("numero de ventas");
        int numero_ventas = sc.nextInt();
        int ventas = 0;
        for (int i = 1; i <= numero_ventas; i++) {
            System.out.println("precio de venta: " + i);
            ventas = ventas + sc.nextInt();
        }
        System.out.println("El total de ventas es: " + ventas);
        sc.close();
    }
}