package String;

import java.util.Scanner;

public class LeftMostRepeatingCharcater {

    public static int leftmostRep(String str) {

        for(int i=0;i<str.length();i++) {

            for(int j=i+1;j<str.length();j++) {

                if(str.charAt(i)==str.charAt(j)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        int index= leftmostRep(str);
        System.out.println(index);
    }
}
