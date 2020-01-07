package app;

import java.util.Scanner;

/**
 * 18) Pide por teclado dos número y genera 10 números aleatorios entre esos
 * números. Usa el método Math.random para generar un número entero aleatorio
 * (recuerda el casting de double a int).
 */
public class ejercicio18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro numero");
        int num2 = sc.nextInt();
        sc.close();

        for (int i = 0; i < 10; i++) {
            int aleatorio = (int) (Math.random()*(num1-num2)+num2);
            System.out.println(aleatorio);;
        }
    }
}