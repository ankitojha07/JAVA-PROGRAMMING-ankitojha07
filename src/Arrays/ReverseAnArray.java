package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseLogic rl = new ReverseLogic();

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();


        // Using ArrayList
//        System.out.print("Enter the elements of arrayList : ");
//        ArrayList<Integer> arrayList = new ArrayList<>(n);
//        for (int i =0; i<n;i++){
//            arrayList.add(sc.nextInt());
//        }
//        System.out.println(rl.reverseUsingAList(arrayList));

        //Using Arrays
        System.out.print("Enter the elements of array : ");
        int[] arr = new int[n];
        for (int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] newArr = rl.reverseUsingArray(arr,0,arr.length-1);
        for (int i=0;i<n;i++){
            System.out.print(newArr[i] + " ");
        }
    }
}
class ReverseLogic{

    // Reverse using ArrayList
    ArrayList<Integer> reverseUsingAList(ArrayList<Integer> arr){
        int s =0;
        int e = arr.size()-1;
        int temp = 0;
        while (s<e){
            temp = arr.get(s);
            arr.set(s, arr.get(e));
            arr.set(e, temp);
            s++;
            e--;
        }
        return (arr);
    }

    // Reverse using Array
    int[] reverseUsingArray(int[] arr, int i, int j){
        // reverse from index i to j
        int s =i;
        int e = j;
        int temp = 0;
        while (s<e){
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }
}
