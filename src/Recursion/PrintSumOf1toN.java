package Recursion;

public class PrintSumOf1toN {

    public static int Sum1toN(int n) {
        int sum=0;
        if(n==0) {
            return sum;
        }
        sum= n+ Sum1toN(n-1);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Sum1toN(10));

    }
}
