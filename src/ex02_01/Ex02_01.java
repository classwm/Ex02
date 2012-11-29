package ex02_01;

import ex02_01.help.help.ArrayHelper;
import ex02_01.help.Sort;
import static java.lang.System.out;

public class Ex02_01 {
    public static int nextId;
    public String info;
    public int[] table;
    public int id;

    static {
        nextId = 1;
    }

    public static void main(String[] args) {
        int[] table = { 9, 7, 10, 3, 1, 8, 3 };

        Ex02_01 ex = new Ex02_01(table, "Program sorts table using quicksort.");
        ex.execute();        
    }
    {
        id = nextId++;
    }
    

    private Ex02_01(int[] table, String info) {
        this(table);
        this.info = info;        
    }

    private Ex02_01(int[] table) {
        this.table = table;
    }

    private void execute() {
        out.println(info);

        Sort.quickSort(table, 0, table.length);

        out.println(ArrayHelper.toString(table));
    }
}
