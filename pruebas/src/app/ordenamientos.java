package app;

/**
 * ordenamientos
 */
public class ordenamientos {

    /**
     * Ordenacion por el metodo burbuja
     */

    public static void burbuja(int[] a) {
        int n = a.length;
        for(int i = 0; i <= n - 2; i++){
            for (int j = n - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    permuta(a, j - 1, j);
                }
            }
        }
    }

    /**
     * Ordenacion por insercion directa
     */
    public static int[] insercion(int[] a) {
        int n = a.length;//11
        for (int i = 1; i <= n -1; i++) {
            int x = a[i];//a x se le asigna el valor del array en la posicion i
            int j = i - 1;//a j se le asigna el valor de i - 1 / primera vuelta vale i = 1 y j = 0
            while (j >= 0 &&  x < a[j]) {//mientras que j sea mayor o igual a 0 y x sea menor al array en la posicion j
                a[j + 1 ] = a[j];//array [en la posicion j + 1 = 0] se le asigna el valor de  a[j = 1]
                j = j - 1;//volvemos asignarle a j -> j - 1 = 
            }
            a[j + 1] = x; 
        }
        return a;
    }

    /**
     * Ordenacion por el metodo rapido (quicksort)
     */

    private static void rapirec(int[] v, int iz, int de) {
        int m;
        if (de > iz) {
            m = particion(v, iz, de);
            rapirec(v, iz, m - 1);
            rapirec(v, m + 1, de);
        }
    }

    public static void rapido(int[] v) {
        rapirec(v, 0, v.length -1);
    }

    /**
     * Ordenacion por seleccion
     */
    public static void seleccion(int[] v) {
        int n = v.length;
        int posmin;
        for (int i = 0; i < n - 1; i++) {
            posmin = i;
            for (int j = i + 1; j < n; j++) {
                if (v[j] < v[posmin]) {
                    posmin = j; //posicion del mas pequeño
                }
            }
            permuta(v, i, posmin);
        }
    }

    /**
     * Lo que hace es cambiar dos elementos de sitio
     */
    private static void permuta(int[] a, int i, int j) {
        int t;
        t = a[i];
        a[i] = a [j];
        a[j] = t;
    }

    /**
     * Método que va subdividiendo la lista en listas 
     * más pequeñas. Es un procedimiento recursivo denominado divide y vencerás.
     */
    private static int particion(int[] v, int iz, int de) {
        int i, pivote;
        permuta(v, (iz + de) / 2, iz);
        //el pivote es el centro y se cambia con el primero
        pivote = v[iz];
        i = iz;

        for (int s = iz + 1; s <= de; s++) {
            if (v[s] <= pivote) {
                i++;
                permuta(v, i, s);
            }
        }
        permuta(v, iz, i);
        return i;

    }
}