package DataStructures.ArrayDs.OneDArray;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] arr = {1,2,4,5,6,3};
        boolean result = cd.isUnique(arr);
        System.out.println(result);
    }
    public boolean isUnique(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1 ; i++) {
                if (arr[i]==arr[i+1]){
                    return false;
                }
        }
        return true;
    }
}
