package Questions;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] sample = {"coding", "codepen", "codingNinjas", "coder"};
        System.out.println(getCommon(sample));
        System.out.println(commonPrefix(sample));
    }

    private static String commonPrefix(String [] sample){
        String prefix = sample[0];
        for (int i = 1; i < sample.length; i++) {
            prefix = getCommonPrefix(sample[i], prefix);
        }
        return prefix;
    }

    private static String getCommonPrefix(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0, j = 0; i < length1 && j < length2; i++ ,j++ ) {
            if(s1.charAt(i) != s2.charAt(j)){
                break;
            }
            result.append(s1.charAt(i));
        }
        return result.toString();
    }

    private static String getCommon(String[] sample){
        if(sample.length == 0){
            return "";
        }
        if(sample.length == 1){
            return sample[0];
        }
        Arrays.sort(sample);
        int i = 0;
        int end = Math.min(sample[0].length(), sample[sample.length-1].length());

        while(i< end && sample[0].charAt(i) == sample[sample.length-1].charAt(i))
            i++;

        return sample[0].substring(0,i);
    }
}
