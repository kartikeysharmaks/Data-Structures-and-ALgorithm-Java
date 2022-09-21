package Questions;

import java.util.HashSet;

public class LargestSubsequenceInAString {
    public static void main(String[] args) {
        String sample = "abacbecdab";
        HashSet<Character> set = new HashSet<>();
        String longestTillNow = "";
        String longestOverAll = "";
        for (int i = 0; i < sample.length(); i++) {
            char c = sample.charAt(i);
            if(set.contains(c)){
                longestTillNow = "";
                set.clear();
            }
            longestTillNow += c;
            set.add(c);
            if(longestTillNow.length() > longestOverAll.length()){
                longestOverAll = longestTillNow;
            }
        }
        System.out.println(longestOverAll);
    }
}
