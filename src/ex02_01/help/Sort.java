package ex02_01.help;

import ex02_01.help.ArrayHelper;

public class Sort {
    public static void main(String[] args) {
        System.out.println("Enjoy!");
    }

    public static void quickSort(int tab[], int lewy, int prawy) {
        if (lewy < prawy) {
            int m = lewy;
            for (int i = lewy + 1; i < prawy; i++) {
                if (tab[i] < tab[lewy]) {
                    ArrayHelper.swap(tab, ++m, i);
                }
            }
            ArrayHelper.swap(tab, lewy, m);
            quickSort(tab, lewy, m - 1);
            quickSort(tab, m + 1, prawy);
        }
    }
}
