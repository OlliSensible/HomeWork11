package Task3;

import static Task3.SortArray.sortNumbersInArray;

public class PrintSortArray {
    public static void main(String[] args) {
        String[] inputArray = {"1, 2, 0", "4, 5"};
        String result = sortNumbersInArray(inputArray);
        System.out.println(result);
    }
}
