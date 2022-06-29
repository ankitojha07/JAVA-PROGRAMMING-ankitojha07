package DataStructures.ArrayDs.TwoDArray;

import java.util.Arrays;
public class TwoDimArr {
    public static void main(String[] args) {
        int[][] arr2D = null;

        arr2D = new int[2][2];

        arr2D[0][0] = 1;
        arr2D[0][1] = 2;
        arr2D[1][0] = 3;
        arr2D[1][1] = 4;

        System.out.println(Arrays.deepToString(arr2D));
    }
}
