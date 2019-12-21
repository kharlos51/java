package app;

import java.util.Scanner;

/**
 * 5) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se
 * pedirá por teclado (recuerda pasar de String a double con
 * Double.parseDouble). Usa la constante PI y el método pow de Math.
 */
public class ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio del circulo");
        double radio= sc.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);
    }
}