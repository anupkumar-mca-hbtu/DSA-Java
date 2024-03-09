package String;
import java.util.Scanner;
import java.util.Arrays;


public class checkForAnagram {
    // Naive approach
    public static boolean isAnagram(String str1,String str2) {

        if(str1.length()!=str2.length()) {
            return false;

        }
        char []ch1= str1.toCharArray();
        char []ch2= str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        str1= new String(ch1);
        str2= new String(ch2);

        if(str1.equals(str2)) {
            return true;
        }

       return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;

        String s1= sc.next();
        String s2= sc.next();

        boolean flag = isAnagram(s1,s2);
        System.out.println(flag);

    }
}
