package uz.uzum.two_sums;

public class    FindNumbers {
    private final int[] array;

    public FindNumbers(int[] array) {
        this.array = array;
    }

    public int[] find(int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return null;
    }

    public void print(int target) {
        int[] pair = find(target);
        System.out.printf("%s + %s = %s.\n", pair[0], pair[1], target);
    }
}
