import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr  = {-10,-20,-3,-40,-5,65,87,99,54,33,21,8,12};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j-1]> arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }else break;
            }
        }
    }
}
