package app;

import java.util.Scanner;

/**
 * 9) Lee un número por teclado que pida el precio 
 * de un producto (puede tener decimales) y calcule el 
 * precio final con IVA. El IVA sera una constante que sera del 21%.
 */
public class ejercicio9 {

    public static void main(String[] args) {
        //leer desde el teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un precio");
        int precio = sc.nextInt();
        sc.close();
        double iva = precio * 0.21;
        double valor_final = precio + iva;
        System.out.println("EL precio con IVA es: " + valor_final);
    }
}