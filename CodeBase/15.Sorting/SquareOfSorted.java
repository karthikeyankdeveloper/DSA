import java.util.Arrays;

public class SquareOfSorted {
    public static void main(String[] args) {
        int data[] = {-4,-1,0,3,10};

        int len = data.length;
        int[] arr = new int[len];
        int j = len-1, k = 0;

        for(int i=data.length-1;i>=0;i--){

            if(Math.abs(data[j])<Math.abs(data[k])){
                arr[i] = data[k]*data[k++];
            }else{
                arr[i] = data[j]*data[j--];
            }


        }

        System.out.println(Arrays.toString(arr));
    }
    
}
