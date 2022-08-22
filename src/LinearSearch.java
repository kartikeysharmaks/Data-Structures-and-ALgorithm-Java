public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {76,87,89,95,1,56,34,22};
        int target = 34;
        linearSearch(arr,target);

    }
    static void linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                System.out.println("Item found at " + i);
            }
        }
    }
}
