package DataStructures.ArrayDs.OneDArray;

public class CheckIfArrayIsSorted {
    static void isSorted(int[] arr){
        boolean flag = false;
        for (int i =0; i<arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                flag = false;
                break;
            } else
                flag = true;
        }
        if (flag) System.out.println("Array is sorted!");
        else System.out.println("Array is not sorted!");
    }
}
