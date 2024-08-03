import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // Test sort(int[] array)
        int[] intArray = {3, 1, 5, 99, 3, 12};
        sort(intArray);
        System.out.println(Arrays.toString(intArray));

        // Test sort(String[] array)
        String[] strArray = {"banana", "apple", "orange", "pear"};
        sort(strArray);
        System.out.println(Arrays.toString(strArray));

        // Test sortIntegers(ArrayList<Integer> integers)
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(3, 1, 5, 99, 3, 12));
        sortIntegers(intList);
        System.out.println(intList);

        // Test sortStrings(ArrayList<String> strings)
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("banana", "apple", "orange", "pear"));
        sortStrings(strList);
        System.out.println(strList);
    }

    // Method to sort an array of integers
    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    // Method to sort an array of strings
    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    // Method to sort an ArrayList of integers
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    // Method to sort an ArrayList of strings
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
