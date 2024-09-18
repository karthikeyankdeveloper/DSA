import java.util.Arrays;

public class BubbleSort{

    public static void main(String[] args) {
        int[] arr = {35,45,53,63,72,12,5,1,4};

        boolean isSwap;

        for(int i=0;i<arr.length;i++){
            isSwap=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    isSwap = true;
                    swap(arr, j, j+1);
                }
            }

            if(!isSwap) break;
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}