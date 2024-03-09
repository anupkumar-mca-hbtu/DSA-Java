package String;
import java.util.*;

public class PrintFrequenciesOfCharacter {

    public static void PrintCharFreq(String str) {
        int arr[]= new int[256];
        for(int i=0;i<str.length();i++) {

            arr[str.charAt(i)]++;
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>0){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        PrintCharFreq(s);

    }
}
