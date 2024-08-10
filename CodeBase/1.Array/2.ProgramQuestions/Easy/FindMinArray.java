
public class FindMinArray {

    public static int Min(int[] input) {
        int min = input[0];
        for(int i=1;i<input.length;i++){
            if(min>input[i]) min = input[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[] input = {55,2,3,5,22,9};
        System.out.println("Output : "+FindMinArray.Min(input));
    }
    
}

/*
    Other Problem : 
    1. Find Max
*/ 
