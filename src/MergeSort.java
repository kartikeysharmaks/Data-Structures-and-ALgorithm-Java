import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] array = {3,97,5,76,34,76,9,1,64,36,2,17,54};
        int start = 0;
        int end = array.length-1;
        mergeSort(array,start,end);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array, int start, int end) {
        if(start >= end){
            return;
        }
        int mid = start + (end-start)/2;
        mergeSort(array,start,mid);
        mergeSort(array,mid+1,end);
        merge(array,start,mid,end);
    }

    private static void merge(int[] array, int start, int mid, int end) {

        int idx1 = start;
        int idx2 = mid+1 ;
        int index = 0;
        int [] sortedArray =  new int[end-start+1];

        while(idx1 <= mid && idx2 <= end){
            if(array[idx1] <= array[idx2]){
                sortedArray[index++] = array[idx1++];
            }else {
                sortedArray[index++] = array[idx2++];
            }
        }
        while (idx1 <= mid){
            sortedArray[index++] = array[idx1++];
        }
        while (idx2 <= end){
            sortedArray[index++] = array[idx2++];
        }

        for (int i = 0,j= start ; i <sortedArray.length ;i++,j++) {
            array[j] = sortedArray[i];
        }
    }
}
