package app;

import java.util.Scanner;

/**
 * Escribe una aplicación con un String que contenga una contraseña cualquiera.
 * Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando
 * aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo
 * “Enhorabuena”. Piensa bien en la condición de salida (3 intentos y si acierta
 * sale, aunque le queden intentos).
 */
public class ejercicio16 {

    public static void main(String[] args) {
        
        String pass = "carlitox";

        Scanner sc = new Scanner(System.in);
        
        int intentos = 3;
        String password = "";

        do {
            System.out.println("Introduce tu contraseña: ");
            password = sc.nextLine();
            if (password.equals(pass)) {
                System.out.println("Enhorabuena");
                break;
            }
            else{
                intentos--;
                System.out.println("Te quedan " + (intentos) + " intentos");
            }
         
        } while (intentos >=1);
        sc.close();
    }
}