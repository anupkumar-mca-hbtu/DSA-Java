package Hashing;

import java.util.HashSet;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {5, -4, -3, -1};
        System.out.print(findsum(arr, arr.length));

    }
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        int preSum=0;
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<n;i++) {
            preSum=preSum+arr[i];
            if(hs.contains(preSum+arr[i])) {
                return true;
            }
            if(preSum==0) {
                return true;
            }

            hs.add(arr[i]);
        }
        return false;
    }
}
