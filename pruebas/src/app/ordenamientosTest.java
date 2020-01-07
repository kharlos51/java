package app;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * ordenamientosTest
 */
public class ordenamientosTest {

    static ordenamientos o = new ordenamientos();

    @Test
    public void testBurbuja() {
        int[] comprueba = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] ordenados = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] inverso = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] random = { 1, 0, 4, 3, 5, 10, 8, 9, 2, 6, 7 };

        o.burbuja(ordenados);
        assertArrayEquals(comprueba, ordenados);
        o.burbuja(inverso);
        assertArrayEquals(comprueba, inverso);
        o.burbuja(random);
        assertArrayEquals(comprueba, random);
    }

    @Test
    public void testSeleccion() {
        int[] comprueba = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] ordenados = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] inverso = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] random = { 1, 0, 4, 3, 5, 10, 8, 9, 2, 6, 7 };

        o.seleccion(ordenados);
        assertArrayEquals(comprueba, ordenados);
        o.seleccion(inverso);
        assertArrayEquals(comprueba, inverso);
        o.seleccion(random);
        assertArrayEquals(comprueba, random);
    }

    @Test
    public void testRapido() {
        int[] comprueba = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] ordenados = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] inverso = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] random = { 1, 0, 4, 3, 5, 10, 8, 9, 2, 6, 7 };

        o.rapido(ordenados);
        assertArrayEquals(comprueba, ordenados);
        o.rapido(inverso);
        assertArrayEquals(comprueba, inverso);
        o.rapido(random);
        assertArrayEquals(comprueba, random);
    }

    @Test
    public static void testInsercion() {
        int[] comprueba = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] ordenados = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] inverso = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] random = { 1, 0, 4, 3, 5, 10, 8, 9, 2, 6, 7 };

        int [] num= o.insercion(random);

        for (int j : num) {
            System.out.print(" " + j);
        }
        System.out.println(" ");
        


        //assertArrayEquals(comprueba, ordenados);
        //o.insercion(inverso);
        //assertArrayEquals(comprueba, inverso);
        //o.insercion(random);
        //assertArrayEquals(comprueba, random);
    }

    public static void main(String[] args) {
        testInsercion();
    }
}