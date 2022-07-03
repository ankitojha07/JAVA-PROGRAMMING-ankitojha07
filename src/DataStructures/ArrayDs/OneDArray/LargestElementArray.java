package DataStructures.ArrayDs.OneDArray;

public class LargestElementArray {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{1, 5, 8, 34, 23, 8, 84};

        System.out.println(LargestElementArraySolution.largestElem(arr));
    }
}
class LargestElementArraySolution{
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
