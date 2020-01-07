package app;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * dado un numero x, imprimir los primeros x numeros en binario
 */
public class decimaltobinario {

    public static int[]binario (int cantidad) {
        int[] resultado = new int[cantidad];
        int contador = 0;

        ArrayList<String> binario = new ArrayList<String>();
        int resto;
        String binarioString = "";
        int numero;
        for (contador = 0; contador < cantidad; contador++) {
            numero = contador;
            do {
                resto = numero%2;
                numero =  numero/2;
                binario.add(0, Integer.toString(resto));
            } while (numero >= 2);

            binario.add(0, Integer.toString(numero));

            for (int i = 0; i < binario.size(); i++) {
                binarioString += binario.get(i);
            }

            resultado[contador] =  Integer.parseInt(binarioString);
            binario.clear();
            binarioString = "";
        }
        
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a mostrar en binario");
        int cantidad = sc.nextInt();
        sc.close();

        int numeros[] = binario(cantidad);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El numero " + i + " en binario es: " + numeros[i]);
        }
        
    }
}