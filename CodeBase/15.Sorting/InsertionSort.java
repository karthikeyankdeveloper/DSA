import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {35,45,53,63,72,12,5,1,4};

        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
