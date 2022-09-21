package Questions;

import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int number = getUglyNO(n);
       System.out.println(number);
        System.out.println(isUgly(859963392));
    }

    private static int getUglyNO(int n) {
        int number = 1;
        int count = 1;
        while(count<n){
            number++;
            if (isUgly(number)==1){
            count++;
            }
        }
        return number;
    }

    private static int isUgly(int n) {
        n = maxDivide(n,2);
        n = maxDivide(n,3);
        n = maxDivide(n,5);

        return (n == 1)  ? 1 : 0;
    }

    private static int maxDivide(int a, int b) {
        while(a % b == 0)
            a = a / b;
            return a;
    }
}
