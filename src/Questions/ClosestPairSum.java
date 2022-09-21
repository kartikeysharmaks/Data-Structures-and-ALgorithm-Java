package Questions;

public class ClosestPairSum {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,5};
        int [] array2 = {10,20,30,40};
        int sum = 32;
        closestPairSum(array1,array2,sum);
    }

    private static void closestPairSum(int[] array1, int[] array2, int sum) {
        int i = 0;
        int res_i = 0, res_j = 0;
        int diff = Integer.MAX_VALUE;
        int j = array2.length-1;
        while(i < array1.length && j >= 0){
            if(array1[i] + array2[j] < diff){
                res_i = i;
                res_j = j;
                diff = array1[i] + array2[j] - sum;
            }
            if(array1[i] + array2[j] > sum){
                j--;
            }else i++;
        }
        System.out.println("Two indexes forming the sum are " + res_i + " and " + res_j);
    }
}