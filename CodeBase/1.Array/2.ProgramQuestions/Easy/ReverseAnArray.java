import java.util.Arrays;

public class ReverseAnArray {
    
    public int[] reverse(int[] input) {
        for(int i=0;i<input.length/2;i++){
            int temp = input[i];
            input[i] = input[input.length-i-1];
            input[input.length-i-1] = temp;
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,5,4,9};
        System.out.println("Output : "+Arrays.toString(new ReverseAnArray().reverse(input)));
    }
}
