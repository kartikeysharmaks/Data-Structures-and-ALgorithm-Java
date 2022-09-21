package Questions;

import java.util.HashMap;

public class SingleOccurrenceOfANumberInAnArray {
    public static void main(String[] args) {
        int [] array = {1,3,2,4,1,4,3,5,6,5,7,6,7};
        findSinglyOccurredNumber(array);
    }

    private static void findSinglyOccurredNumber(int[] array) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : array) {
            if (map.containsKey(n)) {
                count++;
            } else {
                map.put(n, count);
            }
        }
        System.out.println(map);
    }
}
