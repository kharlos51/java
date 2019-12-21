package app;

/**
 * 1) Declara dos variables numéricas (con el valor que desees), 
 * muestra por consola la suma, resta, multiplicación, división y
 * módulo (resto de la división).
 */
public class ejercicio1 {

    public static void main(String[] args) {
        int numero1 = 12;
        int numero2 = 8;

        System.out.println("La suma es: " + (numero1 + numero2));
        System.out.println("La resta es: " + (numero1 - numero2));
        System.out.println("La multiplicacion es: " + (numero1 * numero2));
        System.out.println("La division es: " + (numero1 / numero2));
        System.out.println("El resto es: " + (numero1 % numero2));
    }
}