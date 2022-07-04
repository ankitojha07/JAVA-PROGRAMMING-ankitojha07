package DataStructures.ArrayDs.OneDArray;

public class MovezeroesToEnd {
    static void moveZeroesToEnd(int [] arr){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=0){
                int temp=0;
                temp = arr[i];
                arr[i] = arr[count];
                count++;
            }
        }
        for (int i =0; i< arr.length; i++) System.out.print(arr[i]+" ");
    }
}
