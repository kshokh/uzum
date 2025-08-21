package uz.uzum.two_pointers;

import java.util.Arrays;

/**
 * @author Shohjahon
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        int[] num = {1, 1, 1, 2, 2, 3, 3, 3, 3};
        int newer = duplicates(num);

        System.out.println(Arrays.toString(Arrays.copyOf(num, newer)));
    }

    static int duplicates(int[] num) {
        int index = 0;

        for (int i = 1; i < num.length; i++) {
            if (num[i] != num[index]) {
                num[++index] = num[i];
            }
        }

        return index + 1;
    }
}
