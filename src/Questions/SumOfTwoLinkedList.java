package Questions;

import java.util.LinkedList;

public class SumOfTwoLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);
        System.out.println(l1);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.addFirst(8);
        l2.addFirst(2);
        l2.addFirst(1);
        System.out.println(l2);

        getSum(l2,l1);
    }
    private static void getSum(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        int n = l1.size();
        int m = l2.size();
        int i = 0;
        int j = 0;
        int carry = 0;
        StringBuilder sum = new StringBuilder();

        while (i<n && j<m){
            int temp = l1.get(i) + l2.get(j) + carry;
            if(temp > 9){
                carry = temp/10;
                temp = temp%10;
            }
            sum.append(temp);
            i++;
            j++;
        }
        System.out.println(sum);
    }
}
