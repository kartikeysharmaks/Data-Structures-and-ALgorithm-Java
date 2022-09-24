import java.util.HashSet;

public class Hashing1 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,1,2,3};

        //declaration and initialisation of HashSet
        HashSet<Integer> set = new HashSet<>();

        //HashSet only contains the unique elements

        //add method -  to add elements in the set
        for (int i : array) {
            set.add(i);
        }

        //to print all the elements of the set
        System.out.println(set);

        //to check whether set contain the target element or not - this will return the boolean value(true/false)
        System.out.println(set.contains(5));
        System.out.println(set.contains(6));

        //to remove any element from set
        set.remove(4);
        System.out.println(set);
    }
}
