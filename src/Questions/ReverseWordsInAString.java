package Questions;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "Welcome to Java World";
        String [] a = s.split(" ");
        for (int i = a.length-1; i >= 0 ; i--) {
            System.out.print(a[i]+" ");
        }
    }
}
