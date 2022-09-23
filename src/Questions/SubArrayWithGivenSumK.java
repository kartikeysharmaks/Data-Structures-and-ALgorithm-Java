package Questions;

import java.util.HashMap;

public class SubArrayWithGivenSumK {
    public static void main(String[] args) {
        int [] array = {10,15,-5,15,-10,5};
        int sum = 5;
        subArraySum(array,sum);
    }

    private static void subArraySum(int[] array, int sum) {
        int currentSum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];
            if(currentSum == sum){
                end = i;
                break;
            }
            if(map.containsKey(currentSum-sum)){
                start = map.get(currentSum-sum) + 1;
                end = i;
                break;
            }
            map.put(currentSum,i);
        }
        if(end == -1){
            System.out.println("Not found");
        }else {
            System.out.println("Index are = "+  start + " and " + end);
        }
    }
}
