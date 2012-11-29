/***
 * DO NOT CHANGE THIS FILE!
 */

package ex02_01.help.help;

public class ArrayHelper {
    /**
     * This method swaps two elements of table. I'm not sure if it is correct...
     * 
     * @param table
     * @param i
     * @param j
     */
    public static void swap(int[] table, int i, int j) {
    }

    public static String toString(int[] table) {
        String outString = "";
        for (int i = 0; i < table.length - 1; i++) {
            outString += table[i] + ", ";
        }
        outString += table[table.length - 1];
        
        return outString;
    }
}
