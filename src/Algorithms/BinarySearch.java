package Algorithms;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter 5 elements : ");
        for (int i =0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value to search : ");
        int val = sc.nextInt();
        binarySearchCode(arr,val);

    }
    // BINARY SEARCH LOGIC
    static void binarySearchCode(int[] arr,int val){
        int s=0; //start
        int e=arr.length-1; // end
        int mid = 0;
        while (s<=e){
            mid = (s+e)/2;
            if (arr[mid] == val){
                System.out.println("Element is found at " + (mid+1));
                break;
            }
            if (val > arr[mid]){
                s = mid+1;
            }
            else if (val<arr[mid]){
                e=mid-1;
            }
            else {
                System.out.println("Element not found!");
                break;
            }
        }
    }
}

