package March25;

class Sort{
    void sort(int arr[]){
        int n = arr.length;

        for (int i =0; i<n-1; i++){
            int min_idx = i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[min_idx]){
                    min_idx = j;

                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = arr[temp];

                }
            }
        }
    }

    void printArray(int arr[]){
        int n = arr.length;
        System.out.println("Sorted Array is : ");
        for (int i=0;i<n; i++){
            System.out.print(+arr[i]);
            System.out.println();
        }
    }
}

public class SelectionSort {
    public static void main(String[] args) {
        Sort srt = new Sort();

        int arr[] = {1,5,3,7,2};

        srt.sort(arr);
        srt.printArray(arr);

    }
}
