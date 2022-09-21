package Questions;

public class FrequencyOfACharacterInAString {
    public static void main(String[] args) {
        String sample = "Hello World";
        char ch = 'l';
        int frequencyCount=0;

        for (int i = 0; i < sample.length(); i++) {
            if (ch == sample.charAt(i)){
                frequencyCount++;
            }
        }
        System.out.println(frequencyCount);
    }
}
