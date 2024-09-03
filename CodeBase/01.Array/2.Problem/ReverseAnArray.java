import java.util.Arrays;

public class ReverseAnArray {
    
    public int[] reverse(int[] input) {
        int n = input.length-1;
        for(int i=0;i<input.length/2;i++){
            int temp = input[i];
            input[i] = input[n-i];
            input[n-i] = temp;
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,5,4,9};
        System.out.println("Output : "+Arrays.toString(new ReverseAnArray().reverse(input)));
    }
}
