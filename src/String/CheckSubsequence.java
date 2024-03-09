package String;
import java.util.*;

public class CheckSubsequence {

    public static boolean isSubsequence(String str,String s) {
        int m=0,n=0;
        while(m<str.length() && n<s.length()) {

            if(s.charAt(n)==str.charAt(m)) {
                m++;
                n++;
            }
            else {
                m++;
            }
        }
        if(n==s.length()) {
            return true;
        }
        return false;
    }

    public static boolean isSubsequenceRec(String str, String s,int m,int n) {

        if(m==0) {
            return false;
        }
        if(n==0) {
            return true;
        }
        if(s.charAt(n)==str.charAt(m)) {
           return isSubsequenceRec(str,s,m-1,n-1);
        }
        return isSubsequenceRec(str,s,m-1,n);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int m=sc.nextInt();
        int n=sc.nextInt();

        String ST= sc.next();
        String st= sc.next();
      //  boolean flag= isSubsequence(ST,st);
        boolean flag= isSubsequenceRec(ST,st,m,n);
        System.out.println(flag);
    }
}
