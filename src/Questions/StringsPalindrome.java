package Questions;

public class StringsPalindrome {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "dlroW olleH";
        isPalindrome(s1,s2);
    }

    private static void isPalindrome(String s1, String s2) {
        if(s1.length() != s2.length()){
            System.out.println("No");
        }else {
            StringBuilder temp = new StringBuilder();
            for (int k = s2.length()-1; k >=0 ; k--) {
                temp.append(s2.charAt(k));
            }

            if(s1.equals(temp.toString())){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
