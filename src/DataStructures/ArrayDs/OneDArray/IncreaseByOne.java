package DataStructures.ArrayDs.OneDArray;
public class IncreaseByOne {
    static int[] solution(int[] arr){
        int n =arr.length;
        for (int i =n-1;i>=0;i--){
            if (arr[i]!=9){
                arr[i]++;
                break;
            } else arr[i]=0;
        }
        if (arr[0]==0){
            int[] res = new int[n+1];
            res[0]=1;
            return res;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {9,9,9,9};
        solution(arr);
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
