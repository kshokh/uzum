package uz.uzum.two_sums;

/**
 * @author Shohjahon
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 7, 8};
        int target = 8;

        FindNumbers findNumbers = new FindNumbers(arr);
        findNumbers.find(target);
        findNumbers.print(target);
    }
}
