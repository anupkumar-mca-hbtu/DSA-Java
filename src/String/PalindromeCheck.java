package String;
import java.util.*;

public class PalindromeCheck {

   // Naive approach
    public static boolean  isPalindromeNaive(String str) {
        StringBuffer sb= new StringBuffer(str);
        sb.reverse();
        if(str.equals(sb.toString())) {
            return true;
        }
        return false;
    }
    // Efficient approach
    public static boolean isPalindrome(String str) {

        int low=0,high=str.length()-1;
        while(low<high) {
            if(str.charAt(low)!=str.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String s= sc.next();
       // boolean flag= isPalindromeNaive(s);
        boolean flag= isPalindrome(s);
        System.out.println(flag);
    }
}
