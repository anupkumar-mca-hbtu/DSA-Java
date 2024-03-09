package in.anup.sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void swap(int arr[],int low,int high) {
        while(low<high) {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            high--;
            low++;
        }
    }
    public static void Selectionsort(int arr[], int n) {
        for(int i=0;i<n;i++) {
            for(int j=i;j<n-1;j++) {
                if(arr[j]>arr[j+1]) {
                    swap(arr,i,j);
                }
            }
        }
        System.out.println();
        System.out.println("sorted array is :"+" ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println();
        System.out.println("oringinal array is :"+" ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        Selectionsort(arr,n);
    }
}
