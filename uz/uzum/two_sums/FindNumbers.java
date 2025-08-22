package uz.uzum.two_sums;

public class    FindNumbers {
    private final int[] array;

    public FindNumbers(int[] array) {
        this.array = array;
    }

    public int[] find(int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                return new int[]{complement, num};
            }
            map.put(num, 1);
        }
        return null;
    }

    public void print(int target) {
        int[] pair = find(target);
        System.out.printf("%s + %s = %s.\n", pair[0], pair[1], target);
    }
}

