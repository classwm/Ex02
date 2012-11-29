/***
 * DO NOT CHANGE THIS FILE!
 */

package ex02_01.help;

public class ArrayHelper {

    /**
     * This method swaps two elements of table.
     * 
     * @param table
     * @param i
     * @param j
     */
    public static void swap(int[] table, int i, int j) {
        int temp = table[i];
        table[i] = table[j];
        table[j] = temp;
    }
}
