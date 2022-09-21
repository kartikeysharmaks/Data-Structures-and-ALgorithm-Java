package Questions;

public class NthFibonacciNumber {
    public static void main(String[] args) {
       int ans = fibonacci(5);
        System.out.println(ans);
    }

    private static int fibonacci(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
