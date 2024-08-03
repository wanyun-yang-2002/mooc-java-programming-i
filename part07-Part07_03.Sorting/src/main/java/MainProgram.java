
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        MainProgram.sort(array);
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index1 = indexOfSmallestFrom(array, i);
            MainProgram.swap(array, index1, i);
            System.out.println(Arrays.toString(array));
        }
    }
    
    public static void swap(int[] array, int index1, int index2) {
    // write your code here
        int t = array[index1];
        array[index1] = array[index2];
        array[index2] = t;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int index = startIndex;
        int small = table[index];
        for (int i = startIndex; i < table.length; i++) {
            if (small > table[i]) {
                small = table[i];
                index = i;
            }
        }
        return index;
    }
    public static int smallest(int[] array){
        // write your code here
        int res = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < res) {
                res = array[i];
            }
        }
        return res;
    }
    
    public static int indexOfSmallest(int[] array) {
        int n = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < n) {
                n = array[i];
                index = i;
            }
        }
        return index;
    }

}
