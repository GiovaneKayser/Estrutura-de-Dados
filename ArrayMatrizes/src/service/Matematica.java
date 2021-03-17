package ArrayMatrizes.src.service;

import java.util.Vector;

public class Matematica {
    public Matematica(){}

    public static double Media(int[] lista) {
        double resultado = 0;
        for (int i : lista) {
            resultado += i;
        }
        return resultado / lista.length;
    }
    private static int repetiu(int[] lista, int valor) {
        int resultado = 0;
        for (int i : lista) {
            resultado = (i == valor) ? resultado + 1 :resultado ;
        }
        return resultado;
    }

    public static int Moda(int[] lista) {
        int moda = 0;
        int repeti = 0;
        for (int i : lista) {
            int x = repetiu(lista, i);
            if (x > repeti) {
                moda = i;
                repeti = x;
            }
        }
        return moda;
    }
}
