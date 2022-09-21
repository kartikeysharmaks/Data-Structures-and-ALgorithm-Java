package Questions;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,3,5,7};
        int [] arr2 = {2,4,6,8};
        System.out.println(Arrays.toString(sortAndMerge(arr1,arr2)));
    }

    public static int[] sortAndMerge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int [] sortedArray = new int[n+m];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n){
            if (arr1[i] <= arr2[j]){
                sortedArray[k] = arr1[i];
                i++;
            }else {
                sortedArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            sortedArray[k] = arr1[i];
            i++;
            k++;
        }
        while(j < n){
            sortedArray[k] = arr2[j];
            j++;
            k++;
        }
        return sortedArray;
    }
}
