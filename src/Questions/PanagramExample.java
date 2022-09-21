package Questions;

public class PanagramExample {

    public static void main(String[] args) {
        String a = "Hello World";
        String b = "The quick brown fox jumps over the lazy dog";

        System.out.println(isPanagram(a.toLowerCase()));
        System.out.println(isPanagram(b.toLowerCase()));
    }

    public static boolean isPanagram(String a){
       if(a.length()<26){
           return false;
       }else {
           for (char ch = 'a'; ch <= 'z'; ch++ ){
               if (a.indexOf(ch) < 0){
                   return false;
               }
           }
       }
       return true;
    }
}
