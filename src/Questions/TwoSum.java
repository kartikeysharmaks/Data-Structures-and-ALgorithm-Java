package Questions;

public class TwoSum {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        int sum = 16;
        twoSum(array,sum);
    }

    private static void twoSum(int[] array, int sum) {
        if (sum <= array[array.length-1]) {
            int i = 0;
            for (int j = array.length-1; j >= 1; j--) {
                if(array[i]+array[j] == sum){
                    System.out.println("Two indexes forming the sum are " + i  + " and " + j);
                    break;
                }
            }
        }else {
            int j = array.length-1;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i]+array[j] == sum){
                    System.out.println("Two indexes forming the sum are " + i  + " and " + j);
                    break;
                }
            }
        }
    }
}
