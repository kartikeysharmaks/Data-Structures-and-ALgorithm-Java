package Questions;

public class NumberOfUpperCaseCharacter {
    public static void main(String[] args) {
        String sample = "Hey my name is Kartik. I am from India.";
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        for (int i = 0; i < sample.length(); i++) {
            char c = sample.charAt(i);
            if (c>=65 & c<=90){
                upperCaseCount++;
            }
            if (c>=97 && c<=122){
                lowerCaseCount++;
            }
        }
        System.out.println(upperCaseCount);
        System.out.println(lowerCaseCount);
    }
}
