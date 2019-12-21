package app;

import java.util.Scanner;

/**
 * 8) Modifica el ejercicio anterior, para que en lugar de pedir un número, pida
 * un carácter (char) y muestre su código en la tabla ASCII.
 */
public class ejercicio8 {

    public static void main(String[] args) {
        //leer desde el teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        char car = sc.next().charAt(0);
        //pasamos el caracter a codigo
        int codigo = (int) car;
        //se muestra por consola
        System.out.println("El codigo ASCII del caracter es: " + codigo);
    }
}