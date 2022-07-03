package DataStructures.ArrayDs.OneDArray;

public class LargestElementArray {
    static int largestElem(int[] arr){
        int temp=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            if (temp<arr[i]){
                temp = arr[i];
            }
        }
        return temp;
    }
}
