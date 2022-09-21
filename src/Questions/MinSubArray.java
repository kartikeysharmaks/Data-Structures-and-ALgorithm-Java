package Questions;

public class MinSubArray {
    public static void main(String[] args) {
        int[] array = {3,5,12,10,9,15,2,1,6};
        int k = 3;
        System.out.println(subArray(array, k));
    }
    public static int subArray(int[] array, int windowSize){
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;

        while(j < array.length){
            sum += array[j];

            if(j-i+1< windowSize){
                j++;
            }else if(j-i+1 == windowSize){
                min = Math.min(min,sum);
                sum = sum - array[i];
                i++;
                j++;
            }
        }
        return min;
    }
}
