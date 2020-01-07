package app;


/**
 * 12) Muestra los números del 1 al 100 (ambos incluidos) 
 * divisibles entre 2 y 3. Utiliza el bucle que desees.
 */
public class ejercicio12 {

    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 100) {
            if (contador%2 == 0  || contador%3 == 0) {
                System.out.println(contador);
                
            }
            contador++;
        }
    }
}