package Questions;

public class NumberOfVowelsInAString {
    public static void main(String[] args) {
        String sample = "Learn Coding With me";
        int vowelCount = 0;
        for (int i = 0; i < sample.length(); i++) {
            char c = sample.charAt(i);
            switch (c) {
                case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}
