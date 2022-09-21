package Questions;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] array = {3,5,12,10,9,15,2,1,6};
        int k = 3;
        System.out.println(subArray(array, k));
    }
    public static int subArray(int[] array, int windowSize){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;

        while(j < array.length){
            sum += array[j];

            if(j-i+1 < windowSize){
                j++;
            }else if(j-i+1 == windowSize){
                max = Math.max(max, sum);
                sum = sum - array[i];
                i++;
                j++;
            }
        }
        return max;
    }
}
