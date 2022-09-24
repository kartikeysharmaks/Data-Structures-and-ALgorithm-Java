import java.util.HashMap;

public class Hashing2 {
    public static void main(String[] args) {

        //declaration and initialization of Hashmap
        HashMap<String,Integer> map = new HashMap<>();

        //put method to add element in the form of key value pairs in the map
        map.put("China",150);
        map.put("India", 130);
        map.put("US",50);

        //to print all the elements and its value inside the map
        System.out.println(map);

        //get method to get a particular element and its value by its key
        int ans = map.get("China");
        System.out.println(ans);

        //remove method to remove element by key
        map.remove("US");
        System.out.println(map);

        //size method to get the size of the map
        System.out.println(map.size());
    }
}
