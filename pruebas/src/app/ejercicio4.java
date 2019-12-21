package app;
import javax.swing.JOptionPane;

/**
 * 4) Modifica la aplicación anterior, para que nos pida el 
 * nombre que queremos introducir (recuerda usar JOptionPane).
 */
public class ejercicio4 {

    public static void main(String[] args) {

        /**
         * //Nos aparece un cuadro de dialogo
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre=sc.nextLine();
         */
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
        System.out.println("Bienvenido " + nombre);
    }
}