package app;

/**
 * fibonacci
 */
public class fibonacci {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        int c = 0;
        for (int i = 0; i < 10; i++) {
            c = a + b;
            a = b;
            b = c;

            System.out.println(a);
        }
    }
}