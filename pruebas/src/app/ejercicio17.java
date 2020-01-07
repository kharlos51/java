package app;

import java.util.Scanner;

/**
 * 17) Crea una aplicación que nos pida un día de la semana y que nos diga si es
 * un dia laboral o no. Usa un switch para ello.
 */
public class ejercicio17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un dia de la semana");
        String dia =  sc.nextLine();
        sc.close();

        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es dia laboral");
                break;

            case "sabado":
            case "domingo":
                System.out.println("NO es dia laboral");
                break;
            default:
                System.out.println("Introduce un dia de la semana");
        }
    }
}