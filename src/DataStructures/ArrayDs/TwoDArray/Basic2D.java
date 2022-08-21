package DataStructures.ArrayDs.TwoDArray;
import java.util.Arrays;
public class Basic2D {
    public static void main(String[] args) {
        int[][] nameArray;
        nameArray = new int[2][2];
        nameArray[0][0] = 1;
        nameArray[0][1] = 2;
        nameArray[1][0] = 3;
        nameArray[1][1] = 4;
        System.out.println(Arrays.deepToString(nameArray));

        String strArray[][] = {{"Ankit","Binod"},{"Nikhil","Bikas"}};
        System.out.println(Arrays.deepToString(strArray));
    }
}
