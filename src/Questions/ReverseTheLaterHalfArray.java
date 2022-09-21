package Questions;
import java.util.ArrayList;

public class ReverseTheLaterHalfArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr  = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        System.out.println(arr);
        reverseArray(arr, 1);
        System.out.println(arr);
    }

    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int n = arr.size();
        int p = 0;
        ArrayList<Integer> brr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            brr.add(0);
        }

        for (int i = 0; i <= m; i++) {
            brr.set(p++, arr.get(i));
        }
        for (int j = n - 1; j > m; j--) {
            brr.set(p++, arr.get(j));
        }
        for (int i = 0; i < n; i++) {
            arr.set(i, brr.get(i));
        }

    }
}






