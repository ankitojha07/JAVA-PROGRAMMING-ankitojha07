package DataStructures.ArrayDs.TwoDArray;

import java.util.Arrays;

public class InsertionIn2DArr{
    public static void main(String[] args) {
        TwoDimArray tda = new TwoDimArray(3,3);
        tda.insertVal(0,0,1);
        tda.insertVal(0,0,10);
        System.out.println(Arrays.deepToString(tda.arr));
    }
}

class TwoDimArray {
    int arr[][] = null;
    public TwoDimArray(int numOfRows, int numOfCol){
        this.arr= new int[numOfRows][numOfCol];
        for (int i = 0; i < arr.length; i++) {
            for (int j=0; j<arr[0].length;j++){
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }
    public void insertVal(int row, int col, int val){
        try{
            if (arr[row][col]==Integer.MIN_VALUE){
                arr[row][col]=val;
                System.out.println("Value inserted successfully!");
            } else {
                System.out.println("Space is already occupied!!");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound!");
        }
    }
}
