package Questions;

public class CountNumberOfWordsInAString {
    public static void main(String[] args) {
        String sample = "  My name is  Kartik Sharma and I am    a web developer ";
        int count = 0;
        for (int i = 0; i < sample.length()-1; i++) {
            if(sample.charAt(i) ==' ' && sample.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
