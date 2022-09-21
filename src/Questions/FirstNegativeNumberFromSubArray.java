package Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class FirstNegativeNumberFromSubArray {
    public static void main(String[] args) {
        int[] array = {3,-5,-12,10,-9,15,-2,-1,6,18,35};
        int k = 3;
        System.out.println(firstNegativeNumberFromEverySubArray(array, k));
    }

    public static Vector<Integer> firstNegativeNumberFromEverySubArray(int[] array, int windowSize){
        int i = 0; //start
        int j = 0; //end

        Queue<Integer> queue = new LinkedList<>();
        Vector<Integer> vector = new Vector<>();

        while (j < array.length){
            if (array[j] < 0){
                queue.add(array[j]);
            }
           if (j-i+1 < windowSize){
               j++;
           }else if(j-i+1 == windowSize){
               if (queue.size() == 0){
                   vector.add(0);
               }else {
                   vector.add(queue.peek());
                   if (array[i] == queue.peek()){
                       queue.remove();
                   }
               }
               i++;
               j++;
           }
        }
        return vector;
    }
}
