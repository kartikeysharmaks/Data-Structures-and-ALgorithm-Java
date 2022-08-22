import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10,5,87,43,56,99,10,12,139,12,33,66,-4,-76,-45,-23-17,0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}