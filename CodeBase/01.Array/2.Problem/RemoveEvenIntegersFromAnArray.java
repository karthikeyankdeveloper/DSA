import java.util.Arrays;

public class RemoveEvenIntegersFromAnArray {

    public int[] removeEven(int[] input) {
        int newLength = 0;
        for(int i=0;i<input.length;i++){
            if(input[i]%2!=0) newLength++;
        }

        int[] output = new int[newLength];
        for(int j=0,k=0;j<input.length && newLength!=0;j++){
            if(input[j]%2!=0) output[k++]=input[j];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,5,4,22,9};
        System.out.println("Output : "+Arrays.toString(new RemoveEvenIntegersFromAnArray().removeEven(input)));
    }
     
}

/*
    Other Problem : 
    1. Remove negative value
    2. Remove particular target
    3. Remove odd Integer 
*/ 