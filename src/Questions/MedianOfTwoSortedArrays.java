package Questions;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] array1 = {1,3,5,7,9,11};
        int [] array2 = {2,4,6,8,10,12};
        System.out.println(Arrays.toString(mergeTwoSortedArray(array1,array2)));
        System.out.println(medianOfSortedArray(mergeTwoSortedArray(array1,array2)));
    }

    private static double medianOfSortedArray(int[] mergeTwoSortedArray) {
        int length = mergeTwoSortedArray.length;
        if(length % 2 == 0){
            int z = length/2;
            return (mergeTwoSortedArray[z] + mergeTwoSortedArray[z-1]) / 2.00;
        }else {
            int z = Math.round(length/2);
            return mergeTwoSortedArray[z];
        }
    }

    public static int[] mergeTwoSortedArray(int[] array1, int[] array2){
        int i = 0;
        int j = 0;
        int k = 0;
        int m = array1.length;
        int n = array2.length;
        int [] array3 = new int[n+m];
        while (i < m && j < n){
            if(array1[i] <= array2[j]){
                array3[k] = array1[i];
                i++;
            }else {
                array3[k] = array2[j];
                j++;
            }
            k++;
        }
        while (i < m){
            array3[k] = array1[i];
            i++;
            k++;
        }
        while (j < n){
            array3[k] = array2[j];
            j++;
            k++;
        }
        return array3;
    }
}

