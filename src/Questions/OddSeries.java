package Questions;

public class OddSeries {
    public static int findNth(int n){
        int ans=0;
        if(n >= 0 && n<= 100000){
            ans = fibonacci(n) % (1000000007);
        }
        return ans;
    }

    public static int fibonacci(int n){
        int funcVal;
        if(n<2){
            funcVal = n;
        }else if(n%5==0){
            funcVal=11;
        }else{
            funcVal = fibonacci(n-2) + fibonacci(n-1);
        }
        return funcVal;
    }
    public static void main(String[] args) {
        System.out.println(findNth(12));
    }
}
