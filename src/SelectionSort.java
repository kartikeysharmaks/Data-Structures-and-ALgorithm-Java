import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr  = {-10,-20,-3,-40,-5,65,87,99,54,33,21,8,12};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int last = arr.length-1-i;
            int largest = getMaxIndex(arr,0,last );
            swap(arr, largest, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int last){
        int largest = 0;
        for (int i = 0; i <= last ; i++) {
            if (arr[largest] < arr[i]){
                largest=i;
            }
        }
        return largest;
    }

    static void swap(int[] arr, int largest, int last){
        int temp = arr[last];
        arr[last] = arr[largest];
        arr[largest]=temp;
    }
}
