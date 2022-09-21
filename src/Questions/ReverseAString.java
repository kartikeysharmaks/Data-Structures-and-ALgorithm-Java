package Questions;

public class ReverseAString {
    public static void main(String[] args) {

        //Using String Builder
        String s = "Hello World";
        StringBuilder a = new StringBuilder();
        a.append(s);
        a.reverse();
        System.out.println(a);

        //Using for loop
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();

        //Using Char Array
        char [] charArray = s.toCharArray();
        for (int i = charArray.length-1; i >=0 ; i--) {
            System.out.print(charArray[i]);
        }
    }
}
