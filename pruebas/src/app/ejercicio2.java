package app;

/**
 * Declara 2 variables numéricas (con el valor que desees), 
 * he indica cual es mayor de los dos. Si son iguales indicarlo 
 * también. Ves cambiando los valores para comprobar que funciona.
 */
public class ejercicio2 {

    public static void main(String[] args) {
        int numero1 = 15;
        int numero2 = 15;

        if(numero1 >= numero2){
            if (numero1 == numero2) {
                System.out.println("Numero: " + numero1 + " es igual a numero: " + numero2);
            }
            else{
                System.out.println("Numero: " + numero1 + " es mayor que: " + numero2);
            }
        }
        else{
            System.out.println("Numero: " + numero1 + " es menor que: " + numero2);
        }
    }
}