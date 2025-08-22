package uz.uzum.two_pointers;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Shohjahon
 * @version 1.0.1
 */

public class Main {
    public static void main(String[] args) {
        int[] num = {1, 1, 1, 2, 2, 3, 3, 3, 3};
        int newer = duplicates(num);

        System.out.println(Arrays.toString(Arrays.copyOf(num, newer)));
    }

    static int duplicates(int[] num) {
        HashSet<Integer> numbers = new HashSet<>();
        int index = 0;

        for (int i = 0; i < num.length; i++) {
            if (!numbers.contains(num[i])) {
                numbers.add(num[i]);
                num[index++] = num[i];
            }
        }

        return index;
    }
}

