package Recursion;

public class NthFibonacci {
    public static int fib(int n) {
        int nthfib= 0;
        if(n==0 || n==1) {
            return n;
        }


        nthfib= fib(n-1)+fib(n-2);
        return nthfib;
    }

    public static void main(String[] args) {
        System.out.println("nth fibonacci number is " + fib(6));
    }
}
